package patronDelegat;

public class Alejandro extends Persona {
	
	private Alumno varAlumno;
	private hijo varhijo;
	
	public Alejandro () {
		varAlumno=new Alumno();
		varhijo=new hijo();
		
	}
	
	public void asistir_a_clases() {
		varAlumno.asistir_a_clase();
	}
	
	public void ayudar_en_la_casa() {
		varhijo=new hijo();
	}
	

}
