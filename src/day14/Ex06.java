package day14;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Ex06 { 
	private Date date; // �����ڸ� �̿��Ͽ� ����
	private SimpleDateFormat simpl;
	public Ex06() { // ������
		simpl = new SimpleDateFormat("YYYY�� MM�� dd�� ���� hh�� mm�� ss��");
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



