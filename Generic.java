public class GenericsExample{

	public static void main(Stringp[] args) {

	IntegerPrinter printer = new Integer(23);
	printer.print();

}//main

}//class

public class GenericsExample{

	public static void main(Stringp[] args) {

	Printer<Integer> printer = new Printer<>(23);// 裡面也是不能吃primitive type喔
	printer.print();
	
	Printer<Double> printer = new Printer<>(23.00);
	printer.print();
	
	Printer<Long> Longprinter = new Printer<>(2300);
	printer.print();

}//main

}//class


public class IntegerPrinter{

	Integer thingToPring;
	
	public IntegerPrint(Interger thingToPrint){
		this.thingToPrint = thingToPrint;

}

	public void print(){
	System.out.println(thingToPrint);
}


}// class

public class Printer<T>{

	T thingToPring;
	
	public IntegerPrint(T thingToPrint){
		this.thingToPrint = thingToPrint;
}

	public void print(){
	System.out.println(thingToPrint);
}


}// class