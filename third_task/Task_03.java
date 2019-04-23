package third_task;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input start year: ");
		int startYear = in.nextInt();
		System.out.print("Input start month: ");
		int startMonth = in.nextInt();
		System.out.print("Input end year: ");
		int endYear = in.nextInt();
		System.out.print("Input end month: ");
		int endMonth = in.nextInt();
		int sum = 0;
		for (int i = startYear; i <= endYear; i++) {
			int k = 1;
			if (i == startYear) {
				k = startMonth;
			}

			System.out.print("Year: " + i + "\n");
			for (int j = k; j <= 12; j++) {

				switch (j) {
				case 1:
					sum = sum + 31;
					System.out.println("January");
					break;
				case 2:
					if ((i % 4 == 0) && i % 100 != 0) {
						sum = sum + 29;
						System.out.print (i + " is a leap year.");
					} else if ((i % 4 == 0) && (i % 100 == 0) && (i % 400 == 0)) {
						sum = sum + 29;
						System.out.print (i + " is a leap year.");
					} else {
						sum = sum + 28;
						System.out.print(i + " is not a leap year.");
					}
					System.out.println("February");
					break;
				case 3:
					sum = sum + 31;
					System.out.println("March");
					break;
				case 4:
					sum = sum + 30;
					System.out.println("April");
					break;
				case 5:
					sum = sum + 31;
					System.out.println("May");
					break;
				case 6:
					sum = sum + 30;
					System.out.println("June");
					break;
				case 7:
					sum = sum + 31;
					System.out.println("July");
					break;
				case 8:
					sum = sum + 31;
					System.out.println("August");
					break;
				case 9:
					sum = sum + 30;
					System.out.println("September");
					break;
				case 10:
					sum = sum + 31;
					System.out.println("October");
					break;
				case 11:
					sum = sum + 30;
					System.out.println("November");
					break;
				case 12:
					sum = sum + 31;
					System.out.println("December");
					break;
				}
				if (i == endYear && j == endMonth) {
					break;
				}
			}

			/*
			 * if (startYear modulo 400 is 0) { then is leapYear } else if (year modulo 100
			 * is 0) { then not leap year } else if (year modulo 4 is 0) { then is leap year
			 * } else { not leap year }
			 */
		}
		System.out.print("sum: " + sum + "\n");
	}
}
