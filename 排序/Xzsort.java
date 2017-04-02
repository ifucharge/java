package sort;
/*选择排序：先定义一个整型min/max作为标记，第一层循环控制未排序的数；第二层循环通过min标记的数与未排序的其他数对比，得到
 * 未排序数中最小数的下标=min，在交换标记的数和min。
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
		int min;//min作为标记。
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = 1 + i; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;//标记最小数的下标，
				}
			}
			if (i != min) {
				exchange(a, i, min);// 传入数组类型参数时不用加[];交换标记的数和第i个数；
			}
		}
	}
}
