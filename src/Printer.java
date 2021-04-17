import java.util.Scanner;
public class Printer {
	
	Scanner s = new Scanner(System.in);
	
	String type, brand, colour;
	double price, input_tray;
	
	Printer(){
		System.out.print("Enter type: ");
		this.type = s.nextLine();
		System.out.print("Enter brand: ");
		this.brand = s.nextLine();
		System.out.print("Enter colour: ");
		this.colour = s.nextLine();
		System.out.print("Enter price: ");
		this.price = s.nextDouble();
		System.out.print("How many input tray: ");
		this.input_tray = s.nextDouble();
	}
	
	Printer(String type, String brand, String colour, double price, double input_tray){
		this.type = type;
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.input_tray = input_tray;
		
	}

}
