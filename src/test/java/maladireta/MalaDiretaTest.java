package maladireta;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import program.Destino;
import program.MalaDireta;

/**
 * Neste exemplo de Mala Direta foi feita uma implementação acoplada, o que não
 * é o ideal. Nos próximos commits veremos as melhorias.
 * 
 * @author Lorran
 *
 */
public class MalaDiretaTest {

	private List<Destino> destinos = new ArrayList<Destino>();

	@Test
	public void testMensagemMalaDiretaPorSMS() throws Exception {
		MalaDireta malaDireta = new MalaDireta("SMS - Envio por texto de celular");

		Destino destino1 = new Destino("Jack", "jackdaniels@gmail.com");
		Destino destino2 = new Destino("Hein", "heineken@gmail.com");
		destinos.add(destino1);
		destinos.add(destino2);

		String resultado = malaDireta.setEnviarMensagem(destinos, 0);

		assertEquals("Enviado por SMS", resultado);
	}

	@Test
	public void testMensagemMalaDiretaPorEmail() throws Exception {
		MalaDireta malaDireta = new MalaDireta("EMAIL - Envio por texto em email");
		
		Destino destino1 = new Destino("Jack", "jackdaniels@gmail.com");
		Destino destino2 = new Destino("Hein", "heineken@gmail.com");
		destinos.add(destino1);
		destinos.add(destino2);
		
		String resultado = malaDireta.setEnviarMensagem(destinos, 0);
		
		assertEquals("Enviado por email", resultado);
	}
	
	@Test(expected = NullPointerException.class)
	public void testEnvioSemNome() throws Exception {
		MalaDireta malaDireta = new MalaDireta("Essa é a minha mensagem no corpo do texto");

		Destino destino1 = new Destino(null, "jackdaniels@gmail.com");
		Destino destino2 = new Destino(null, "heineken@gmail.com");
		destinos.add(destino1);
		destinos.add(destino2);

		malaDireta.setEnviarMensagem(destinos, 0);
	}

	@Test
	public void testEnvioSemEmail() {
		// TODO possibilidade de teste
	}

}
