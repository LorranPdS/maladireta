package maladireta;

/**
 * Classe informando qual será o nome e o email do destinatário a receber a mensagem
 * 
 * @author Lorran, lorransantospereira@yahoo.com.br
 *
 */
public class Destino {

	private String nome;
	private String email;

	/**
	 * Metodo construtor contendo nome e email do destinatario.
	 * 
	 * @param nome
	 * @param email
	 */
	public Destino(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	/**
	 * Contem o nome do destinatario.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Contem o email do destinatario
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Destino [nome=" + nome + ", email=" + email + "]";
	}

}
