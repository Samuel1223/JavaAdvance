public class Cat extends Animal{

	String name;
	int age;
// private: 只有class內部可以call
	public static void meow(){
		System.out.println("Meow");
	}

	public static void dingDong(){
		System.out.println("Ding dong");
	}
}