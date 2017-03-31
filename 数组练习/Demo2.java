package lianxi;

/*数组练习23，成绩的排序和插入；
 * */
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int[] insrt = new int[6];
		int sc;
		Demo2 deo = new Demo2();
		Scanner in = new Scanner(System.in);
		System.out.println("输入学生成绩：");
		for (int i = 0; i < score.length; i++) {
			score[i] = in.nextInt();
		}
		deo.sort(score);
		for (int i = 0; i < score.length; i++) {
			System.out.print(" " + score[i]);
		}
		System.out.println("要插入的成绩：");
		sc = in.nextInt();
		System.out.println("要插入的下标：" + deo.insert(score, sc));
		System.out.println("插入后的成绩：");

		deo.ins(score, insrt, sc);

		for (int i = 0; i < insrt.length; i++) {
			System.out.print(" " + insrt[i]);
		}
	}
	public void sort(int[] a) {
		int min;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i; j < a.length; j++) {
				if (a[min] < a[j]) {
					min = j;
				}
			}
			if (min != i) {
				exchange(a, min, i);
			}
		}
	}
	public void exchange(int[] a, int i, int j) {
		int t;
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public int insert(int[] a, int sc) {
		int l = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > sc && a[i + 1] < sc) {
				l = i + 1;
			}
		}
		return l;
	}
	public int[] ins(int[] a, int[] b, int sc) {

		for (int i = insert(a, sc); i < b.length - 1; i++) {
			b[i + 1] = a[i];
		}
		b[insert(a, sc)] = sc;
		for (int i = 0; i < insert(a, sc); i++) {
			b[i] = a[i];
		}
		return b;
	}
}
