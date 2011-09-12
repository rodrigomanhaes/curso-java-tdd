package br.edu.iff.nsi.academico;

public class UserBean {
	private String name;
	private String password;
	
	public UserBean() {
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getPassword() { return password; }
	public void setPassword(String pass) { this.password = pass; }
	
	public String login() {
		return "welcome";
	}
}
