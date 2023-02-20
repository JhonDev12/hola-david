package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

IFabrica miFabrica = new FabricaPizza();
        
        miFabrica.crearElementos();
        IElementoMasa miMasa = miFabrica.getElementoMasa();
        IElementoSabor miSabor = miFabrica.getElementoSabor();
        System.out.println("Mi Pizza tiene: "+miMasa.getDatos()+miSabor.getInformacion());

        
		
		
	}

}
