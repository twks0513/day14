package day14;


class A02{
	public A02(String n) {
		System.out.println(n+" : A02 실행");
	}
	public void t() {
		System.out.println("부모");
	}
}
class A01 extends A02{
	public void t() {
		System.out.println("자식");
	}
	public A01() {
		super("값");
		System.out.println("A01 생성자 실행");
		super.t();
	}
	public A01(String s) {
		super(s);
	}
}


public class Ex03 {

	public static void main(String[] args) {
		//A01 a = new A01();
		A01 a = new A01("받아주는값");
		

	}

}
