package sort;
/*ѡ�������ȶ���һ������min/max��Ϊ��ǣ���һ��ѭ������δ����������ڶ���ѭ��ͨ��min��ǵ�����δ������������Աȣ��õ�
 * δ����������С�����±�=min���ڽ�����ǵ�����min��
 * */
public class Xzsort {
	public static void main(String[] args) {
		int[] a = { 7, 4, 5, 3, 6 };
		Xzsort xz = new Xzsort();
		xz.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
	public void exchange(int a[], int i, int j) {
		int t;
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public void sort(int a[]) {
		int min;//min��Ϊ��ǡ�
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = 1 + i; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;//�����С�����±꣬
				}
			}
			if (i != min) {
				exchange(a, i, min);// �����������Ͳ���ʱ���ü�[];������ǵ����͵�i������
			}
		}
	}
}
