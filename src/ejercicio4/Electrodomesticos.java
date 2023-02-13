package ejercicio4;

public class Electrodomesticos {

	protected final  static  String colorDefecto="Blanco";
	protected final static char ConsumoEnergetico='F';
	protected final static int PrecioBase=100;
	protected final static int pesoBase=5;
	protected final static int pesoBase4=5;
	protected final static int pesoBase8=5;
	
	
	
	
	
	
	// atributos 
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	
	public Electrodomesticos () {
		
		
		
	}


	public Electrodomesticos(double precioBase, double peso) {
		
		this.precioBase = precioBase;
		this.peso = peso;
	}


	
	public Electrodomesticos(double precioBase, double peso, char consumoEnergetico, String color) {
		// TODO Auto-generated constructor stub
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}


	/// metodos publicso de get y set
	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public static String getColordefecto() {
		return colorDefecto;
	}


	public static char getConsumoenergetico() {
		return ConsumoEnergetico;
	}


	public static int getPreciobase() {
		return PrecioBase;
	}


	public static int getPesobase() {
		return pesoBase;
	}
	
	
	/// metodos  privados 
	
	
	
	public void  coloresDisponibles(String color) {
		
		String Disponible []= {"Blanco","Negro","Rojo","Azul","Gris"};
		boolean hallado=false;
		
		 for(int i = 0 ; i<Disponible.length && !hallado;i++) {
			
			if (Disponible[i].equals(Disponible)) {
				
				hallado=true;
				
				
				
				
				
			}
			
			
			
			
		}
		
		if(hallado) {
			
			this.color=color;
			
			
		}else {
			
			this.color=colorDefecto;
			
			
		}
		
	}
	
	
	public void letrascomprovadas(char consumoEnergetico) {
		
		if (consumoEnergetico>=65 && consumoEnergetico<=70) {
			
			
			this.consumoEnergetico=consumoEnergetico;
			
		}else {
			
			this.consumoEnergetico=ConsumoEnergetico;
			
			
		}
		
		
		
	}
	
	public double precioFinal1() {
		double Final=0;
		
		switch (consumoEnergetico) {
		
		case 'A':
		Final+=100;
		System.out.println("el precio es  por de fecto es "+Final);
		break;
		
		case 'B':
		Final+=80;
		
		break;
		
		case 'C':
	    Final+=60;
	    break;
		case 'D':
		Final+=50;
		break;
		case 'E':
		Final+=30;
		break;
		case 'F':
		Final+=10;
		
		}
		
		if (peso>=0 && peso<=19) {
			Final+=10; 
			
		}else if(peso>=20 && peso<=49) {
			Final+=30;
		}else if(peso>=50 && peso<=79) {
			Final+=50;
		}else if(peso>=80 && peso<=91) {
			Final+=60;
		}else if(peso>=92 && peso<=100) {
			Final+=100;
			
		}
		 return PrecioBase+Final;
	}
	
	
}
