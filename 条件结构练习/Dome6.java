/**
�����ṹ��ϰ13����Ʒ������
@author lzx
@version 2.0
@param args


 */

import java.util.Scanner;

public class Dome6 {
	public static void main(String[] args) {
		double qian;
		int times;
		Grade grade1 = new Grade();
		Scanner in = new Scanner(System.in);
		System.out.println("�������");
		qian = in.nextDouble();
		System.out.println("�Ƿ�μӶһ����"+"\n"+"1:��50 Ԫ������Ԫ�������¿���һƿ��"+"\n"
				                              +"2:��100Ԫ����3Ԫ����500ml���¿���һƿ��"+"\n"

+"3:��100Ԫ����10Ԫ�������ۡ�"+"\n"
+"4:��200Ԫ����10Ԫ����һ���ղ�����Ŷ��"+"\n"
+"5:��200Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ��"+"\n"
+"0:��������"+"\n"
+"��ѡ��"
				);


		times = in.nextInt();
		grade1.fil(qian,times);

	}

}

class Grade {
	int j;

	public void grade(double qian, int i) {
		switch (i) {
		case 1:
			j = 2;
			System.out.println("�������ѽ�" + (qian + j));
			break;
		case 2:
			j = 3;
			System.out.println("�������ѽ�" + (qian + j));
			break;
		case 3:
			j = 10;
			System.out.println("�������ѽ�" + (qian + j));
			break;
		case 4:
			j = 10;
			System.out.println("�������ѽ�" + (qian + j));
			break;
		case 5:
			j = 20;
			System.out.println("�������ѽ�" + (qian + j));
			break;
		default:
			System.out.println("�������ѽ�" + qian);
			break;
		}
	}
	public void fil(double qian,int times){
		if (times > amount(qian)) {
			System.out.println("sorry���޷�ѡ��");
		} else
			grade(qian, times);

	}
	public int amount(double qian) {
		int i;
		if (qian < 50) {
			i = 0;
		} else if (qian >= 50 && qian < 100) {
			i =1;
		} else if (qian >= 100 && qian < 200) {
			i = 3;
		} else
			i = 5;
		return i;
	}


}
