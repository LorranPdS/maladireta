package maladireta;

import java.util.List;

/**
 * Classe para envio de email
 * 
 * Classe responsável pelo envio de email. Nela está sendo impressa no console
 * a mensagem, o nome e email de quem irá receber a mensagem.
 * 
 * @author Lorran <lorransantospereira16@gmail.com>
 *
 */
public class EnviadorEmail {

	/**
	 * Metodo para envio de mensagem.
	 * 
	 * Método responsavel por enviar uma mensagem para o {@link Destino} especificado
	 * pelo nome e email de quem vai receber
	 * 
	 * @param malaDireta MalaDireta com mensagem
	 * @param destinos List<Destino> com nome do destinatário e endereco de email
	 */
	public void enviar(MalaDireta malaDireta, List<Destino> destinos) {
		System.out.println("Mala direta: " + malaDireta.getMensagem());
		System.out.println("Destinos: " + destinos.get(0).getNome());
		System.out.println("Destinos: " + destinos.get(0).getEmail());
	}
}
