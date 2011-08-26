package br.edu.iff.nsi.academico;

public class UserBean {
	private String name;
	private String password;
	
	public UserBean() {
		name = "Enter your name";
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getPassword() { return password; }
	public void setPassword(String pass) { this.password = pass; }
}
