package patrones;import clases.*;

public class PatronSingleton {

	
	public static void main(String[]args)
	{


        Constante constante3 = Constante.getInstance();
        constante3.setDatos("Iva",19.4 );
        System.out.println(constante3);
        
        constante3.setDatos("Ivaa", 20.4);
        System.out.println(constante3);
        
	}
	
}
