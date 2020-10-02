package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.AddService;

@WebServlet( name = "AddController" , urlPatterns = { "/Them-moi-sinh-vien" } )
public class AddController extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	AddService service = new AddService();

	@Override
	protected void doGet( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException
	{

		service.showView( request , response , "/views/add.jsp" );

	}

	@Override
	protected void doPost( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException
	{

		String name 	= request.getParameter( "name" );
		String mail 	= request.getParameter( "mail" );
		String address	= request.getParameter( "address" );
		service.addNewStudent( name , mail , address );
		response.sendRedirect( "/Simple_CRUD_JSP_Servlet_MySQL/Trang-chinh" );

	}

}
