package modelo.dao;

import java.util.ArrayList;

import javax.security.sasl.SaslException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.presentation.rmi.IDLTypeException;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import modelo.Conector;
import modelo.bean.Usuario;

public class UsuarioModelo extends Conector{	
	
	
	
	public void addUser(Usuario usuario){
		


	}
	
	
	public void deleteUser(int id) {
		//Recive el id y borra el usuario
	}
	public void updateUser(Usuario) {
		//Recive datos de la clase usuario y lo   
	}
	public void selectAll() {
		//Pasa la arraylist de usuarios mostrando todos los usuarios
	}
}
