package interfaces;

import java.util.List;

import program.Destino;
import program.MalaDireta;

public interface InterfaceEnviadorEmail {

	public String enviar(MalaDireta malaDireta, List<Destino> destinos);
}
