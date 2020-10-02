package services;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GeneralService
{

	/*
	 * - This method is used to display the view pages (jsp files)
	 * - You need to pass request, response object and path of jsp file should be
	 * displayed.
	 */
	public void showView( HttpServletRequest request , HttpServletResponse response , String viewPath )
			throws ServletException , IOException
	{

		RequestDispatcher rd = request.getRequestDispatcher( viewPath );
		rd.forward( request , response );

	}

}
