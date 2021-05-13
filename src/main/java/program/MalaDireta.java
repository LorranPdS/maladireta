package program;

import java.util.List;

import interfaces.InterfaceEnviadorEmail;

/**
 * 
 * Classe responsavel por conter a mala direta com mensagem a ser enviada e o
 * metodo contendo o envio da mensagem com a lista de destinatarios a receber a
 * mensagem.
 * 
 * @author Lorran
 *
 */
public class MalaDireta {

	private String mensagem;

	public MalaDireta(String mensagem) {
		this.mensagem = mensagem;
	}

	/**
	 * Mensagem enviada pelo remetente ao destinatario.
	 * 
	 * @return String
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * Metodo para enviar a mensagem com os destinos.
	 * 
	 * Metodo responsavel por fazer o envio da mensagem contendo os dados de
	 * {@link Destino}
	 * 
	 * @param destinos
	 */
	public String setEnviarMensagem(List<Destino> destinos, int index) throws Exception {
		InterfaceEnviadorEmail enviadorEmail = null;
		
		if(mensagem.startsWith("SMS")) {
			enviadorEmail = new EnviadorSMS();
		} else {
			enviadorEmail = new EnviadorEmail();			
		}
		
		if(destinos.get(index).getNome().equals(null)) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		String result = enviadorEmail.enviar(this, destinos);

		return result;
	}

	@Override
	public String toString() {
		return "MalaDireta [mensagem=" + mensagem + "]";
	}

}
