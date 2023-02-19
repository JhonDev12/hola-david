package fabrica;

public class WindowsDialog extends Dialog{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		 return (Button) new WindowsButton();
	}

}
