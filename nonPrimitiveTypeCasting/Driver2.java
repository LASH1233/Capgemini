package nonPrimitiveTypeCasting;
class A {}
class B extends A {}
class C extends A{}
class D extends C{}
class E{}

public class Driver2 {
	public static void main(String[] args) {
		A a = new C();
		System.out.println(a instanceof A);
//		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
	}
}
