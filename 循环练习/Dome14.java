import java.util.Scanner;

public class Dome14 {
	public static void main(String[] args) {
		int inyear;
		int year;
		int s = 0;
		int num;
		String n = null;
		int c = 0;
		int[][] a = new int[12][31];
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年份：");
		inyear = in.nextInt();
		for (int k = 1900; k <= inyear; k++) {
			year = k;
			for (int i = 0; i < 12; i++) {
				if ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 5
						|| (i + 1) == 7 || (i + 1) == 8 || (i + 1) == 10
						|| (i + 1) == 12) {
					num = 31;
				} else if ((i + 1) == 2 && year % 4 == 0 && year % 100 != 0) {
					num = 29;
				} else if ((i + 1) == 2) {
					num = 28;
				} else
					num = 30;
				for (int j = 0; j < num; j++) {
					s++;
					if (s % 7 == 0) {
						a[i][j] = 7;
					} else
						a[i][j] = s % 7;

				}
			}
		}

		for (int j = 0; j < 31; j++) {
			System.out.println("1月" + (j + 1) + "号:" + "星期：" + a[0][j]);

		}
		while (true) {
			System.out.println("请选择：" + "\n" + "all  n  p  exit");

			n = in.next();
			if (n.equals("all")) {
				for (int i = 0; i < 12; i++) {
					if ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 5
							|| (i + 1) == 7 || (i + 1) == 8 || (i + 1) == 10
							|| (i + 1) == 12) {
						num = 31;
					} else if ((i + 1) == 2 && inyear % 4 == 0
							&& inyear % 100 != 0) {
						num = 29;
					} else if ((i + 1) == 2) {
						num = 28;
					} else
						num = 30;
					for (int j = 0; j < num; j++) {
						System.out.println((i + 1) + "月" + (j + 1) + "号:"
								+ "星期：" + a[i][j]);
					}
				}
			}
			if (n.equals("n")) {
				c++;
				int i = c;

				if ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 5
						|| (i + 1) == 7 || (i + 1) == 8 || (i + 1) == 10
						|| (i + 1) == 12) {
					num = 31;
				} else if ((i + 1) == 2 && inyear % 4 == 0 && inyear % 100 != 0) {
					num = 29;
				} else if ((i + 1) == 2) {
					num = 28;
				} else
					num = 30;
				for (int j = 0; j < num; j++) {
					System.out.println((i + 1) + "月" + (j + 1) + "号:" + "星期："
							+ a[i][j]);
				}

			}
			if (n.equals("p")) {
				c--;
				int i = c;

				if ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 5
						|| (i + 1) == 7 || (i + 1) == 8 || (i + 1) == 10
						|| (i + 1) == 12) {
					num = 31;
				} else if ((i + 1) == 2 && inyear % 4 == 0 && inyear % 100 != 0) {
					num = 29;
				} else if ((i + 1) == 2) {
					num = 28;
				} else
					num = 30;
				for (int j = 0; j < num; j++) {
					System.out.println((i + 1) + "月" + (j + 1) + "号:" + "星期："
							+ a[i][j]);
				}

			}
			if (n.equals("exit")) {
				break;
			}
		}
		System.out.println("Thank you for using.");
	}

}
