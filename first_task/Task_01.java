package first_task;

public class Task_01 {

	public static void main(String[] args) {
		double a = Math.random() * 0 + 100;
		double min = a;
		double max = a;
		for (int i = 0; i < 100; i++) {
			if (a < min) {
				min = a;
				System.out.println(min);
			} else if (a > max) {
				min = a;
				System.out.println(max);
			} else {
				// System.out.println(a);
			}
		}
		System.out.println(a);
	}
}
