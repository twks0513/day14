package day14;


class A02{
	public A02(String n) {
		System.out.println(n+" : A02 ����");
	}
	public void t() {
		System.out.println("�θ�");
	}
}
class A01 extends A02{
	public void t() {
		System.out.println("�ڽ�");
	}
	public A01() {
		super("��");
		System.out.println("A01 ������ ����");
		super.t();
	}
	public A01(String s) {
		super(s);
	}
}


public class Ex03 {

	public static void main(String[] args) {
		//A01 a = new A01();
		A01 a = new A01("�޾��ִ°�");
		

	}

}
