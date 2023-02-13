package ejercicio4;

public class Televesion extends Electrodomesticos{

	private final static int  resolucion2=20;
	private final static boolean sincronizador=false;
	
	/// atributos 
	 private int  resolucion;
	 private boolean sincronizadorTdt;
	 
	// constructor por defecto 
	 
	 public Televesion(double precioBase,double peso) {
		 super(precioBase,peso);
	 }
	
	 public Televesion() {
		 
		 
	 }
	 
	 public Televesion(double precioBase,double peso,char consumoEnergetico, String color , int resolucion,boolean sincronizadorTdt) {
			
			super(precioBase,peso,consumoEnergetico,color);
			this.resolucion=resolucion;
			this.sincronizadorTdt=sincronizadorTdt;

	 }

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSincronizadorTdt() {
		return sincronizadorTdt;
	}

	public void setSincronizadorTdt(boolean sincronizadorTdt) {
		this.sincronizadorTdt = sincronizadorTdt;
	}

	public static int getResolucion2() {
		return resolucion2;
	}

	public static boolean isSincronizador() {
		return sincronizador;
	}
	 
	 // metodos get 
	 
	 public double preciofinal() {
		 double FINAL2=super.precioFinal1();
		 
		 if (resolucion>40) {
			 FINAL2+=precioBase*0.3;
			 
			 
		 }
		 if (sincronizadorTdt) {
			 
			 FINAL2+=50;
		 }
		 
		 return FINAL2;
		 
		 
	 }
	 
	
}







