package day14;

class Calc{
	public void display() {
		System.out.println("계산기입니다");
	}
}

class Computer extends Calc{
	public void print() {
		System.out.println("컴퓨터입니다");
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Computer calc = new Computer();
		calc.print();	
		calc.display();
		

	}

}
