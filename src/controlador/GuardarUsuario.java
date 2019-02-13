package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuardarUsuario
 */
@WebServlet("/GuardarUsuario")
public class GuardarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuardarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		modelo.bean.Usuario newUser = new modelo.bean.Usuario();
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String usuario = request.getParameter("usuario");
		String email = request.getParameter("email");
		String contrasenia = request.getParameter("contrasenia");
		String contrasenia2 = request.getParameter("contrasenia2");
		String dni = request.getParameter("apelldniido");
		String fecha_nacimiento = request.getParameter("fecha_nacimiento");
		String direccion = request.getParameter("direccion");
		int cp = Integer.parseInt(request.getParameter("cp"));
		String ciudad = request.getParameter("ciudad");
		String provincia = request.getParameter("provincia");
		
		newUser.setNombre(nombre);
		newUser.setApellido(apellido);
		newUser.setUsuario(usuario);
		newUser.setEmail(email);
		newUser.setContrasenia(contrasenia);
		newUser.setContrasenia2(contrasenia2);
		newUser.setDni(dni);
		newUser.setFecha_nacimiento(fecha_nacimiento);
		newUser.setDireccion(direccion);
		newUser.setCp(cp);
		newUser.setCiudad(ciudad);
		newUser.setProvincia(provincia);
		
		request.setAttribute("usuario", newUser);
		request.getRequestDispatcher("viewUsuario.jsp").forward(request, response);
	}

}
