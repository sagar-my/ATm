import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		Mainmenu optionMenu = new Mainmenu();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("/n");
		System.out.println("Welcome to the ATM Project!");
	}
}
