package daos;

import models.StudentModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO extends GeneralDAO
{

	Connection conn;
	ResultSet resultSet;
	PreparedStatement preparedStatement;
	List< StudentModel > students = new ArrayList<>();

	// This method is used to add new student information to the database
	public void save( String name , String mail , String address )
			throws SQLException , InstantiationException , IllegalAccessException
	{

		String SQL_QUERY = "INSERT INTO `student` ( `name` , `mail` , `address` ) VALUES ( ? , ? , ? )";
		try
		{

			// connnect to database
			conn = getConnection();
			// prepare statement to execute SQL query
			preparedStatement = conn.prepareStatement( SQL_QUERY );
			// set parameters for 'preparedStatement object'
			setParams( preparedStatement , name , mail , address );
			// insert new data to 'student' table
			System.out.println( "adding new data to 'student' table..." );
			preparedStatement.executeUpdate();
			System.out.println( "add succesful!" );

		}
		catch ( Exception ex )
		{

			// if an error was found, return null
			System.out.println( "connection or insert failure" );

		}
		finally
		{

			// close all Obj, clear student list after using
			closeConnAndClearList( conn , preparedStatement , resultSet , students );

		}

	}

	/*
	 * This method is used to query all the student information stored in the
	 * database. then convert the data to java object, add that java object to a
	 * list and return that list to the services calling this method.
	 */
	public List< StudentModel > queryAll() throws SQLException
	{

		String SQL_QUERY = "SELECT * FROM student";
		try
		{

			// connnect to database
			conn = getConnection();
			// prepare statement to execute SQL query
			preparedStatement = conn.prepareStatement( SQL_QUERY );
			// get data from 'student' table, assigning datas to resultSet Obj
			System.out.println( "querying data from 'student' table..." );
			resultSet = preparedStatement.executeQuery();
			System.out.println( "query succesful!" );
			// convert the data has been queried to an student obj, add to a list and return
			return mapRow( resultSet );

		}
		catch ( Exception ex )
		{

			// if an error was found, return null
			System.out.println( "connection or query failure" );
			return null;

		}
		finally
		{

			// close all Obj, clear student list after using
			closeConnAndClearList( conn , preparedStatement , resultSet , students );

		}

	}

	/*
	 * This method is used to query the exact student information that you need in
	 * database. then convert the data to java object and return that object to the
	 * services calling this method.
	 */
	public StudentModel queryStudentById( long id ) throws SQLException
	{

		String SQL_QUERY = "SELECT * FROM student WHERE id = ?";
		try
		{

			// connnect to database
			conn = getConnection();
			// prepare statement to execute SQL query
			preparedStatement = conn.prepareStatement( SQL_QUERY );
			// set parameters for 'preparedStatement object'
			setParams( preparedStatement , id );
			// get data from 'student' table, assigning datas to resultSet Obj
			System.out.println( "querying data from 'student' table..." );
			resultSet = preparedStatement.executeQuery();
			System.out.println( "query succesful!" );
			// convert the data has been queried to an student obj, add to a list and return
			return mapRow( resultSet ).get( 0 );

		}
		catch ( Exception ex )
		{

			// if an error was found, return null
			System.out.println( "connection or query failure" );
			return null;

		}
		finally
		{

			// close all Obj, clear student list after using
			closeConnAndClearList( conn , preparedStatement , resultSet , students );

		}

	}

	/*
	 * This method is used to update the exact student information that you need in
	 * database by ID
	 */
	public void updateStudentById( long id , String name , String mail , String address ) throws SQLException
	{

		String SQL_QUERY = "UPDATE student SET name = ?, mail = ?, address = ? WHERE id = ?";
		try
		{

			// connnect to database
			conn = getConnection();
			// prepare statement to execute SQL query
			preparedStatement = conn.prepareStatement( SQL_QUERY );
			// set parameters for 'preparedStatement object'
			setParams( preparedStatement , name , mail , address , id );
			// insert new data to 'student' table
			System.out.println( "updating data in 'student' table..." );
			preparedStatement.executeUpdate();
			System.out.println( "update succesful!" );

		}
		catch ( Exception ex )
		{

			// if an error was found, return null
			System.out.println( "connection or update failure" );

		}
		finally
		{

			// close all Obj, clear student list after using
			closeConnAndClearList( conn , preparedStatement , resultSet , students );

		}

	}

	// This method is used to delete the exact student information in the database
	// by ID
	public void deleteStudentById( long id ) throws SQLException
	{

		String SQL_QUERY = "DELETE FROM `student` WHERE `id` = ?;";
		try
		{

			// connnect to database
			conn = getConnection();
			// prepare statement to execute SQL query
			preparedStatement = conn.prepareStatement( SQL_QUERY );
			// set parameters for 'preparedStatement object'
			setParams( preparedStatement , id );
			// delete data with id selected in 'student' table
			System.out.println( "deleting data from 'student' table..." );
			preparedStatement.executeUpdate();
			System.out.println( "delete succesful!" );

		}
		catch ( Exception ex )
		{

			// if an error was found, return null
			System.out.println( "connection or delete failure" );

		}
		finally
		{

			// close all Obj, clear student list after using
			closeConnAndClearList( conn , preparedStatement , resultSet , students );

		}

	}

}
