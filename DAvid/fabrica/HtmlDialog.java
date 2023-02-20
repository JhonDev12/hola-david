package fabrica;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		 return (Button) new HtmlButton();
	}

}
