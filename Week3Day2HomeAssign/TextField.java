package Week3Day2HomeAssign;

public class TextField extends WebElements {
	
	public void getText () {
		System.out.println("Text Field");
	}
	public static void main(String[] args) {
		
			TextField textFieldOptions = new TextField();
			textFieldOptions.getText();
			textFieldOptions.click();
			textFieldOptions.setText();	
			}
	}
	
