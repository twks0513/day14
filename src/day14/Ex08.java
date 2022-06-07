package day14;

class D01{
	public void test() throws InterruptedException {
		Thread.sleep(0);
		
	}
}
class D02 extends D01{
	public void test2() throws InterruptedException {
		test();
	}
}


public class Ex08 {

	public static void main(String[] args){
		
		try {
			System.out.println(10/2);
			
		} catch (Exception e) { 
			System.out.println("catch 실행");			
		}finally {
			System.out.println("finally 실행");
		}
		System.out.println("다음 문장 실행");
	}

}
