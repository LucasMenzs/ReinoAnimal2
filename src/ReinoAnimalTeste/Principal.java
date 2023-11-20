package ReinoAnimalTeste;

/*
 * @autor José Lucas Menezes Lopes
 */

import java.util.Date;
import ReinoAnimal.Aereo;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Terrestre;

public class Principal {

	public static void main(String[] args) {
		
		Aquatico Carcharias_taurus = new Aquatico("Carcharias taurus", "FÃªmea",7,  false, "Alga salgada");
		Aquatico Pygocentrus_nattehghrer = new Aquatico("Pygocentrus natterer", "maCHO", 8, true, "Agua doce");
		// Instacia animais aquaticos
		
		Terrestre Felis_catus = new Terrestre("Felis catus", "fÃªmea", 2,true, "Ásia");
		Terrestre Hydrochoerus_hydrochaeris = new Terrestre("Hydrochoerus hydrochaeris", "macho", 8, true,"AmÃ©rica do Sul");
		
		Aereo Coragyps_atratus = new Aereo("Coragyps atratus"," macho", 3, 54.5);
		Aereo Amazona_aestiv = new Aereo("Amazona aestiv"," femea", 10, 47.5);
	}

}
