import java.util.Scanner;

public class J20210413_05_if {

	public static void main(String[] args) {
		// if ��
		//���� ��� ��� ���
//		double won = 0;
//		int use = 450; //��뷮
//		double ele1 = 88.3;//1�ܰ� ���·� ���
//		double ele2 = 182.9;//2�ܰ� ���·� ���
//		double ele3 = 275.6;//3�ܰ� ���·� ���
//		int base;//�⺻ ���
//		
//		if (use<=200) { //1�ܰ�
//			base = 910;
//			won = base + use * ele1;
//		}
//		else if (use<=400) {//2�ܰ�
//			base= 1600;
//			won =base + (200 *ele1) + ((use -200) + ele2);
//		
//		}else {// 3�ܰ�
//			base= 7300;
//			won = base + (200* ele1) + (200* ele2) + ((use-400)* ele3);
//		
//		}
//		System.out.println(won);
//		System.out.println(Math.floor(won)); //����
//		System.out.println(Math.ceil(won)); //�ø�
//		System.out.println(Math.round(won)); //�ݿø�
//		
//		
//		System.out.println("�����" + (int)won);
		
		//�������� ��
		// 0 <= random <=1
		//((int)(������ - ���۰� + 1) +���۰�)
//		double a = Math.random();
//		System.out.println(a);
//		System.out.println((int)(a*6+1)+1); //1���� 6������ ��
//		System.out.println((int)(a*(10-5+1)+5));// 5���� 10������ ��
//		System.out.println((int)(a*(20-11+1)+11)); //11~20������ ��

		
		//�ֻ��� ����
		int a = (int)(Math.random() * 6 + 1 + 1);
		int b = (int)(Math.random() * 6 + 1 + 1);
		System.out.println(a);
		System.out.println(b);
		
		 if (a>b)
			 System.out.println("a��");
		 else if(a<b)
		 	System.out.println("b��");
		 else
			 System.out.println("�����ϴ�");
		
		
	}

}
