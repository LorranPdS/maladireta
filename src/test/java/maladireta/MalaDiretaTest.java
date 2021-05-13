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
	public void testMensagemMalaDireta() {
		MalaDireta malaDireta = new MalaDireta("Essa é a minha mensagem no corpo do texto");

		Destino destino1 = new Destino("Jack", "jackdaniels@gmail.com");
		Destino destino2 = new Destino("Hein", "heineken@gmail.com");
		destinos.add(destino1);
		destinos.add(destino2);

		malaDireta.setEnviarMensagem(destinos, 0);

		assertEquals("Jack", destinos.get(0).getNome());
		assertEquals("heineken@gmail.com", destinos.get(1).getEmail());
	}

	@Test(expected = NullPointerException.class)
	public void testEnvioSemNome() {
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
