public class B{
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.a=3;
		a1.b=4;
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println(a1.b);
	}
}