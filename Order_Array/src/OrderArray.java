import java.awt.print.Printable;

public class OrderArray {

	public static void main(String[] args) {

		int[][] array = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 }, {8,9}, { 8, 2}, {5,3}, {4,7} };
		show(array);
		sort(array);
		show(array);

	}

	public static void primarySort(int m[][]) {
		for (int i = 0; i < m.length - 1; i++) {
			for (int j = 0; j < (m.length - 1 - i); j++) {
				if (m[j][0] > m[j + 1][0]) {
					int temp = m[j][0];
					int temp2 = m[j][1];

					m[j][0] = m[j + 1][0];
					m[j][1] = m[j + 1][1];
					m[j + 1][0] = temp;
					m[j + 1][1] = temp2;
				}
			}
		}
	}

	public static void secondarySort(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			int j = i;
			while ((j != 0) && (m[j - 1][0] == m[j][0]) && (m[j][1] < m[j - 1][1])) {
				int temp = m[j][0];
				int temp2 = m[j][1];

				m[j][0] = m[j - 1][0];
				m[j][1] = m[j - 1][1];
				m[j - 1][0] = temp;
				m[j - 1][1] = temp2;
				
				j--;
			}
		}

	}

	public static void sort(int m[][]) {
		primarySort(m);
		secondarySort(m);
	}

	public static void show(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i][0] + ", " + m[i][1]);
		}
		System.out.print("\n");
	}

}
