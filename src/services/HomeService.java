package services;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import daos.StudentDAO;

public class HomeService extends GeneralService
{

	StudentDAO dao = new StudentDAO();

	/*
	 * - this service will call 'DAO beans' to query for a list that contains all of
	 * the student information in the database
	 * - but first, you must pass 'request obj' when calling this service.
	 * 'request obj' will pass the previously queried list to the jsp file by 'set
	 * the request attribute', then the jsp file can display that data in the view
	 * page.
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
