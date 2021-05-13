package program;

import java.util.List;

import interfaces.InterfaceEnviadorEmail;

/**
 * Classe para envio de email
 * 
 * Classe respons�vel pelo envio de email. Nela est� sendo impressa no console
 * a mensagem, o nome e email de quem ir� receber a mensagem.
 * Desta vez foi implementada uma interface para desacoplar um pouco o projeto
 * 
 * @author Lorran <lorransantospereira16@gmail.com>
 *
 */
public class EnviadorEmail implements InterfaceEnviadorEmail {

	@Override
	public void enviar(MalaDireta malaDireta, List<Destino> destinos) {
		System.out.println("Mala direta: " + malaDireta.getMensagem());
		System.out.println("Destino: " + destinos.get(0).getNome());
		System.out.println("Destino: " + destinos.get(0).getEmail());
	}
}
