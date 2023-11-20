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
		
		Aquatico carcharias_taurus = new Aquatico("Carcharias taurus", "FÃªmea",7,  false, "Alga salgada");
		Aquatico pygocentrus_nattehghrer = new Aquatico("Pygocentrus natterer", "maCHO", 8, true, "Agua doce");
		// Instacia animais aquaticos
		
		Terrestre felis_catus = new Terrestre("Felis catus", "fÃªmea", 2,true, "Ásia");
		Terrestre hydrochoerus_hydrochaeris = new Terrestre("Hydrochoerus hydrochaeris", "macho", 8, true,"AmÃ©rica do Sul");
		// Instacia animais terrestres
		
		Aereo coragyps_atratus = new Aereo("Coragyps atratus"," macho", 3, 54.5);
		Aereo amazona_aestiv = new Aereo("Amazona aestiv"," femea", 10, 47.5);
		// Instacia animais aereos
		
		System.out.println("Quantidade de animais: "+amazona_aestiv.getContador() );
	}

}
