package daos;

import models.StudentModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GeneralDAO
{

	public Connection getConnection() throws InstantiationException , IllegalAccessException , ClassNotFoundException
	{

		String DB_URL 		= "jdbc:mysql://localhost:3306/schoolschema";
		String USER_NAME 	= "root";
		String PASSWORD 	= "LuungocnganA15041997";

		try
		{

			Class.forName( "com.mysql.cj.jdbc.Driver" );
			Connection conn = DriverManager.getConnection( DB_URL , USER_NAME , PASSWORD );
			return conn;

		}
		catch ( SQLException ex )
		{

			return null;

		}

	}

	public void closeConnAndClearList( Connection conn , PreparedStatement preparedStatement , ResultSet resultset ,
			List< StudentModel > students ) throws SQLException
	{

		if ( conn != null )					conn.close();
		if ( preparedStatement != null )	preparedStatement.close();
		if ( resultset != null )			resultset.close();
		if ( students.isEmpty() == false )	students.clear();

	}

	public void setParams( PreparedStatement preparedStatement , Object... params ) throws SQLException
	{

		for ( int index = 1 ; index <= params.length ; index++ )
		{

			Object param = params[index - 1];
			if ( param instanceof Long )
			{

				preparedStatement.setLong( index , ( long ) param );

			}
			else if ( param instanceof String )
			{

				preparedStatement.setString( index , param.toString() );

			}

		}

	}

	public List< StudentModel > mapRow( ResultSet resultSet ) throws SQLException
	{

		List< StudentModel > list = new ArrayList< StudentModel >();

		while (resultSet.next())
		{

			long 			id 		= resultSet.getLong( 1 );
			String 			name 	= resultSet.getString( 2 );
			String 			mail 	= resultSet.getString( 3 );
			String 			address = resultSet.getString( 4 );
			StudentModel 	student = new StudentModel( id , name , mail , address );
			list.add( student );

		}

		return list;

	}

}
