package ejercicio4;

public class Electrodomesticos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Electrodomesticos electro1 [] = new Electrodomesticos [10];
		//public Electrodomesticos(double precioBase, double peso, char consumoEnergetico, String color)
		electro1[0]=new Electrodomesticos(12.2,80.555,'A',"verde");
		//public Lavadora(double precioBase,double peso)
		electro1[1]=new Lavadora(155.2,87.2);
// public Televesion(double precioBase,double peso,char consumoEnergetico, String color , int resolucion,boolean sincronizadorTdt
		electro1[2]=new Televesion(2035.2,15.2,'E',"blanco",25,true);
		electro1[3]=new Electrodomesticos();
		electro1[4]=new Electrodomesticos(589.2,36.2,'B',"Azul");
//public Lavadora(double precioBase,double peso,char consumoEnergetico, String color ,int carga)		
		electro1[5]=new Lavadora(996.2,65.2,'C',"gris",6);
		//double precioBase,double peso,
		electro1[6]=new Televesion(5435.2,18.4);
		electro1[7]=new Lavadora(235.2,54.2,'F',"rojo",8);
		electro1[8]=new Televesion(145.2,58.4,'D',"Azul",6456,false);
		//double precioBase, double peso,
		electro1[0]=new Electrodomesticos(12.2,80.2);
		
		
		double SumaslosElectrodomesticos=0;
		double SumadelosTelevisores=0;
		double sumadelasLavadoras=0;
		
		for(int i=0;i<electro1.length;i++) {
			
			if (electro1[i] instanceof Electrodomesticos) {
				SumaslosElectrodomesticos+=electro1[i].precioFinal1();
				
				
				
			}
			
			if (electro1[i] instanceof Televesion) {
				SumadelosTelevisores+=electro1[i].precioFinal1();
				
				
				
			}
			if (electro1[i] instanceof Lavadora) {
				sumadelasLavadoras+=electro1[i].precioFinal1();
				
				
				
			}
		}
		
		
		
		System.out.println("la suma de los electrodomesticos  es de  "+SumaslosElectrodomesticos);
		System.out.println("la suma de los televisores es de  "+SumadelosTelevisores);
		System.out.println("la suma de las lavadoras es de  "+sumadelasLavadoras);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
