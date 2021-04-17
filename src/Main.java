
public class Main {

	public static void main(String[] args) {
		
		Printer h = new Printer();
		
		System.out.println("Type: " + h.type);
		System.out.println("Brand: " + h.brand);
		System.out.println("Colour: " + h.colour);
		System.out.println("Price(RM): " + h.price);
		System.out.println("How many input tray: " + h.input_tray + " sheet input tray");
		
		System.out.println("------------------------------");
		
		Printer c = new Printer("Inkjet Printer", "Canon Pixma", "Black",  799.99, 100);
			
		System.out.println("Type: " + c.type);
		System.out.println("Brand: " + c.brand);
		System.out.println("Colour: " + c.colour);
		System.out.println("Price(RM): " + c.price);
		System.out.println("How many input tray: " + c.input_tray + " sheet input tray");
	}

}
