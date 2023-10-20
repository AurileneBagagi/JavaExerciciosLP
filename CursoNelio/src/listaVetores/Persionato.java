package listaVetores;

public class Persionato {
	
	private String nome;
	private String email;

	
	public Persionato(String email, String nome) {
		this.email = email;
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome + ", " + email;
	}
	
	

}
