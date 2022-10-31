public class GenericsExample{

public static void main(String[] args){
	
shout("John", 74);
}
	

private static<T,V> T shout(T thingToShout, V otherThingToShout){
	//       上面控制input 後面(T)是return type
	System.out.println(thingToShout + "!!!" );
  System.out.println(otherThingToShout + "!!!");

 return thingToShout;
}


}//class

import java.util.List;

public class GenericsExample{

	public static void main(String[] args){

	List<Integer> inList = new Array<>();

}// main

private static void printList(List<?> myList){
	System.out.println();
}

}