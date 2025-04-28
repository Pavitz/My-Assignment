package Week3Day2HomeAssign;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println(" Click CheckBox Button");
	}

	public static void main(String[] args) {
		CheckBoxButton buttonOptions = new CheckBoxButton();
		buttonOptions.clickCheckButton();
		buttonOptions.click();
		buttonOptions.setText();
		buttonOptions.Submit();
	}

}
