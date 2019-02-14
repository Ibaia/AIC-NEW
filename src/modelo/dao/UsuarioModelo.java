
package modelo.dao;

import java.sql.PreparedStatement;

import modelo.Conector;
import modelo.bean.Usuario;

public class UsuarioModelo extends Conector{

	public UsuarioModelo() {
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

	public void insert(Usuario newUser) {
		
//		String insert = "INSERT INTO usuarios(nombre, apellido, usuario, e-mail, contrasenia, contrasenia2, dni, fecha_nacimiento,direccion, provincia, ciudad, cp)"
//						+ "	+ VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
//		try {
//			PreparedStatement pst = this.conexion.prepareStatement(insert);
//			pst.setString(1, newUser.getNombre);
//			pst.setString(2, newUser.getApellido);
//			pst.setString(3, newUser.getNombre);
		
		
//			Boolean ok =pst.execute();
//			Return ok;
		
////	}catch (SQLException e){
//		
//		e.printStackTrace();
//		return false;
//		}
	}
}

