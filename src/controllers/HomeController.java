package controllers;

import java.io.IOException;
import services.HomeService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( name = "HomeController" , urlPatterns = { "/Trang-chinh" } )
public class HomeController extends HttpServlet
{

	HomeService service = new HomeService();

	@Override
	protected void doGet( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException
	{

		String method = ( String ) request.getParameter( "method" );

		if ( "delete".equals( method ) )
		{

			long id = Long.parseLong( request.getParameter( "id" ) );
			service.deleteStudentById( id );
			service.getAllStudents( request );
			service.showView( request , response , "/views/home.jsp" );

		}
		else
		{

			service.getAllStudents( request );
			service.showView( request , response , "/views/home.jsp" );

		}

	}

	@Override
	protected void doPost( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException
	{

	}

}
