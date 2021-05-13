package interfaces;

import java.util.List;

import program.Destino;
import program.MalaDireta;

public interface InterfaceEnviadorEmail {

	public void enviar(MalaDireta malaDireta, List<Destino> destinos);
}
