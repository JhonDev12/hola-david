package facade;

public class Fachada {
	private Avianca avianca;
    private SanMartin sanMartin;
    private TurismoAlInstante turismoalinstante;

    public Fachada() {
    	avianca = new Avianca();
    	sanMartin= new SanMartin();
    	turismoalinstante= new TurismoAlInstante();
    }

    public void metodoFacade() {
    	avianca.metodoUno();
    	sanMartin.metodoDos();
    	turismoalinstante.metodoTres();
    }

	
}
