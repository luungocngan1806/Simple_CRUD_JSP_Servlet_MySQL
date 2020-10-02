package services;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import daos.StudentDAO;

public class EditService extends GeneralService
{

	StudentDAO dao = new StudentDAO();

	/*
	 * - This service will call 'DAO beans' to query the exact student's information
	 * in the database as a java object.
	 * - But first, you must pass 'request object' when calling this service.
	 * 'request objject' will pass the previously queried list to the jsp file by
	 * 'set the request attribute', then the jsp file can display that data in the
	 * view page by using JSTL lib.
	 */
	public void getStudentById( HttpServletRequest request , long id )
	{

		try
		{

			request.setAttribute( "student" , dao.queryStudentById( id ) );

		}
		catch ( SQLException e )
		{

			e.printStackTrace();

		}

	}

	/*
	 * - This service will call 'DAO beans' to delete the exact student's information in the
	 * database by ID.
	 */
	public void updateStudentById( long id , String name , String mail , String address )
	{

		try
		{

			dao.updateStudentById( id , name , mail , address );

		}
		catch ( SQLException e )
		{

			e.printStackTrace();

		}

	}

}
