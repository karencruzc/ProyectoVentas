package cibertec.karen;

import java.util.ArrayList;
import java.util.List;

public class CocinaDatos {
	
	public static List<Cocina> listaCocinas(){
		
		Cocina cocina0 = new Cocina("Mabe EMP6120PG0", 949.0, 60.0, 91.0, 58.6, 4);
		Cocina cocina1 = new Cocina("Indurama Parma", 1089.0, 80.0, 94.0, 67.5, 6);
		
		List<Cocina> lista = new ArrayList<>();
		
		lista.add(cocina0);
		lista.add(cocina1);
		
       return lista;
	}

	
  

}
