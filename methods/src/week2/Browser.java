package week2;

public class Browser {

		public String launchBrowser(String browserName) {
			System.out.println("Browser launched successfully:"+ browserName);
			return browserName;
		}
			public void loadURL() {
		        System.out.println("Application URL loaded successfull");
		    }
		    public static void main(String[] args) {
		        Browser browserinfo = new Browser();
		        browserinfo.launchBrowser("chrom");
		        browserinfo.loadURL();
		    }
		}

	

