package program;

import java.util.List;

import interfaces.InterfaceEnviadorEmail;

public class EnviadorSMS implements InterfaceEnviadorEmail {

	@Override
	public String enviar(MalaDireta malaDireta, List<Destino> destinos) {
		// TODO código para envio por SMS
		System.out.println("Enviado por SMS");
		return "Enviado por SMS";
	}

}
