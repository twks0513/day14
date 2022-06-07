package day14;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Ex06 { 
	private Date date; // 생성자를 이용하여 접근
	private SimpleDateFormat simpl;
	public Ex06() { // 생성자
		simpl = new SimpleDateFormat("YYYY년 MM월 dd일 오후 hh시 mm분 ss초");
	}
	
	public void print() {
		String result = null;
		for(int i =0; i<10;i++) {
			date = new Date();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			result = simpl.format(date);
			System.out.println(result);
		}
	}

	
}



