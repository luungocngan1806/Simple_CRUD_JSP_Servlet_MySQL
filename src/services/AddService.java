package services;

import java.sql.SQLException;
import daos.StudentDAO;

public class AddService extends GeneralService
{

	StudentDAO dao = new StudentDAO();

	/*
	 * - This service will call 'DAO beans' to insert new student's information to the
	 * database.
	 */
	public void addNewStudent( String name , String mail , String address )
	{

		try
		{

			dao.save( name , mail , address );

		}
		catch ( InstantiationException | IllegalAccessException | SQLException e )
		{

			e.printStackTrace();

		}

	}

}
