package Week3Day2HomeAssign;

public class Button extends WebElements{
	
	
	public void Submit() {
		System.out.println("Submit Document");
	}

	public static void main(String[] args) {
        Button submitOptions = new Button ();	
		submitOptions.Submit();
		submitOptions.click();
		submitOptions.setText();
	}
	}

