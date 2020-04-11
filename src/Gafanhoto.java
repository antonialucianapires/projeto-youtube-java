
public class Gafanhoto extends Pessoa {
	private String login;
	private int toAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.toAssistido = 0;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getToAssistido() {
		return toAssistido;
	}

	public void setToAssistido(int toAssistido) {
		this.toAssistido = toAssistido;
	}

	@Override
	public String toString() {
		return "Inscrito: " + super.toString() + "login = " + login + 
			   ",toAssistido = " + toAssistido;
	}
	
	
}
