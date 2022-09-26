package generics;

import java.util.ArrayList;

import javas.oop.HelpJavas;

public class GenericsExample {

	public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(12);
		printer.print();
		
		Printer<Double> doubleprinter = new Printer<>(33.5);
		doubleprinter.print();
		
		
		
	}

}
