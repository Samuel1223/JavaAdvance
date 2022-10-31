public class Printer <T extends Animal>{

T thingToPring;

public Printer(T thingToPrint){
	this.thingToPrint = thingToPrint;
}

public void print(){
	thingToPrint.eat();
	System.out.println(thingToPrint);
}

}