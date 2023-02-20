package delegate;

public class Impresora {

	private ServicioDeImpresion servicioDeImpresion;

    public Impresora() {
        servicioDeImpresion = (ServicioDeImpresion) new ServicioDeImpresionImpl();
    }

    public void imprimir(String documento) {
        servicioDeImpresion.imprimirDocumento(documento);
    }
	
	
}
