package Week3Day2HomeAssign;

public class Elements extends Button {

	
	public void named() {
		System.out.println("Executing Completed");
	}
	

	public static void main(String[] args) {
		
		Elements namedOptions = new Elements();
		namedOptions.named();
		namedOptions.Submit();
		namedOptions.click();
		namedOptions.setText();
	}

}
