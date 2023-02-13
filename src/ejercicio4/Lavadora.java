package ejercicio4;

public class Lavadora extends Electrodomesticos {

	
	private final static int volumen=5;
	
	
	/// atributos 
	
	private  int carga ; 
	
	
	// constructores 
	public Lavadora () {
		
	
	}
	
	
	
	public Lavadora(double precioBase,double peso) {
		super(precioBase,peso);
		
		
	}
	
	public Lavadora(double precioBase,double peso,char consumoEnergetico, String color ,int carga) {
		
		super(precioBase,peso,consumoEnergetico,color);
		this.carga=carga;
	}

	// mdtodos get 

	public int getCarga() {
		return carga;
	}



	public void setCarga(int carga) {
		this.carga = carga;
	}



	public static int getVolumen() {
		return volumen;
	}
	
	
	/// metodos publicos 
	
	public double preciofinal() {
		
		double FINAL=super.precioFinal1();
		
		if (FINAL<=30) {
			FINAL+=50;
			
			
			
			
		}
		
	 return FINAL;
	}
	
	
}
