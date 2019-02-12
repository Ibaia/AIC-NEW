package modelo.bean;

public class Usuario {

	protected int id_usuario;
	protected String nombre;
	protected String apellido;
	protected String usuario;
	protected String email;
	protected String contrasenia;
	protected String contrasenia2;
	protected String dni;
	protected int edad;
	protected String direecion;
	protected int cp;
	protected String ciudad;
	protected String provincia;
	
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getContrasenia2() {
		return contrasenia2;
	}
	public void setContrasenia2(String contrasenia2) {
		this.contrasenia2 = contrasenia2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireecion() {
		return direecion;
	}
	public void setDireecion(String direecion) {
		this.direecion = direecion;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	public Usuario() {
		super();
	}
	
	public Usuario(int id_usuario, String nombre, String apellido, String usuario, String email, String contrasenia,
			String contrasenia2, String dni, int edad, String direecion, int cp, String ciudad, String provincia) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.email = email;
		this.contrasenia = contrasenia;
		this.contrasenia2 = contrasenia2;
		this.dni = dni;
		this.edad = edad;
		this.direecion = direecion;
		this.cp = cp;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}
	

	
}
