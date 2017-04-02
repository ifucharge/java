package sort;
/*冒泡排序：不断地在未排序的数字中找到最大或最小值，已经排序好的数的下一个数交换；外层循环控制你要对比的数，和找出最大数后要交换的位置
 * 内层循环控制在未选择的数中找出最大数；
 * 鸡尾酒排序（冒泡改进）：冒泡排序先是从左到右找出最值放到最左边，再从剩下的未排序的数值从复上一步；如果左边放最大值的话鸡尾酒
 *排序则是：先是从左到右找出最大值，放到一边，再从右到左找出最小值放到另外一边。
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
		int reght = a.length;//确定对比的范围；
		while (left < reght) {
			for (int i = left; i < reght - 1; i++) {

				if (a[i] < a[i + 1]) {
					exchange(a, i, i + 1);//从左到右找出最大值，交换到最左边。
				}
			}
			left++;
			for (int i = reght - 1; i > left; i--) {

				if (a[i] > a[i - 1]) {
					exchange(a, i, i - 1);//从右到左找出最小值，交换到最右边。
				}
			}
			reght--;
		}
	}
}
