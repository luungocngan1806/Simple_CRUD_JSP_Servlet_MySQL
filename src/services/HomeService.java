package services;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import daos.StudentDAO;

public class HomeService extends GeneralService
{

	StudentDAO dao = new StudentDAO();

	/*
	 * - This service will call 'DAO beans' to query a list that contains all of
	 * the student's information in the database as a java object.
	 * - But first, you must pass 'request object' when calling this service.
	 * 'request objject' will pass the previously queried list to the jsp file by
	 * 'set the request attribute', then the jsp file can display that data in the
	 * view page by using JSTL lib.
	 */
	public void getAllStudents( HttpServletRequest request )
	{

		try
		{

			request.setAttribute( "students" , dao.queryAll() );

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
	public void deleteStudentById( long id )
	{

		try
		{

			dao.deleteStudentById( id );

		}
		catch ( SQLException e )
		{

			e.printStackTrace();

		}

	}

}
