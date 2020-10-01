package services;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import daos.StudentDAO;

public class EditService extends GeneralService
{

	StudentDAO dao = new StudentDAO();

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
