package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.EditService;

@WebServlet( name = "EditController" , urlPatterns = { "/Cap-nhat-thong-tin" } )
public class EditController extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	EditService service = new EditService();

	@Override
	protected void doGet( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException
	{

		long id = Long.parseLong( request.getParameter( "id" ) );
		service.getStudentById( request , id );
		service.showView( request , response , "/views/edit.jsp" );

	}

	@Override
	protected void doPost( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException
	{

		// Get data from form
		long id = Long.parseLong( request.getParameter( "id" ) );
		String name = request.getParameter( "name" );
		String mail = request.getParameter( "mail" );
		String address = request.getParameter( "address" );
		service.updateStudentById( id , name , mail , address );
		response.sendRedirect( "/Simple_CRUD_JSP_Servlet_MySQL/Trang-chinh" );

	}

}
