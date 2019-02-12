
package modelo.dao;

import modelo.Conector;
import modelo.bean.Usuario;

public class UsuarioModelo extends Conector{

	UsuarioModelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addUser(Usuario usuario) {
		//Recive datos de la clase usuario y añade un nuevo usuario
		//INSERT INTO usuarios(nombre, apellido, usuario, e-mail, contrasenia, contrasenia2, dni, fecha_nacimiento,direccion, provincia, ciudad, cp) 
		//VALUES ("","","","","","","","","","","","")
	}
	
	public void deleteUser(int id) {
		//Recive el id y borra el usuario
		//DELETE FROM usuarios WHERE id='';
	}
	
	public void updateUser(Usuario usuario) {
		//Recive datos de la clase usuario y los modifica  
	}
	
	public void selectAll() {
		//Pasa la arraylist de usuarios mostrando todos los usuarios
		//SELECT * FROM usuarios
	}
}

