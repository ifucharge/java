package sort;
/*ð�����򣺲��ϵ���δ������������ҵ�������Сֵ���Ѿ�����õ�������һ�������������ѭ��������Ҫ�Աȵ��������ҳ��������Ҫ������λ��
 * �ڲ�ѭ��������δѡ��������ҳ��������
 * ��β������ð�ݸĽ�����ð���������Ǵ������ҳ���ֵ�ŵ�����ߣ��ٴ�ʣ�µ�δ�������ֵ�Ӹ���һ���������߷����ֵ�Ļ���β��
 *�������ǣ����Ǵ������ҳ����ֵ���ŵ�һ�ߣ��ٴ��ҵ����ҳ���Сֵ�ŵ�����һ�ߡ�
 * */
public class Mpsort {
	public static void main(String[] args) {
		int[] a = { 5, 6, 3, 7, 2, 11, 9 };
		Mpsort mp = new Mpsort();
		mp.mpsort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.print("\n");
		mp.mpsort_new(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}
	public void exchange(int[] a, int i, int j) {
		int t;
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public void mpsort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 1 + i; j < a.length; j++) {
				if (a[i] < a[j]) {
					exchange(a, i, j);
				}
			}
		}
	}
	public void mpsort_new(int[] a) {
		int left = 0;
		int reght = a.length;//ȷ���Աȵķ�Χ��
		while (left < reght) {
			for (int i = left; i < reght - 1; i++) {

				if (a[i] < a[i + 1]) {
					exchange(a, i, i + 1);//�������ҳ����ֵ������������ߡ�
				}
			}
			left++;
			for (int i = reght - 1; i > left; i--) {

				if (a[i] > a[i - 1]) {
					exchange(a, i, i - 1);//���ҵ����ҳ���Сֵ�����������ұߡ�
				}
			}
			reght--;
		}
	}
}
