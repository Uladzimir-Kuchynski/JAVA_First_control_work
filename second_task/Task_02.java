package second_task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data.txt"));
		String str;
		while (sc.hasNext()) {
			str = sc.next();
			System.out.println(str);
		}
	}
}
