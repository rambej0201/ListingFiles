package list;

import java.io.File;

public class FileList {

	public static void main(String[] args) {

		File file = new File("E:\\");
		String[] files = file.list();
		for (String string : files) {
			System.out.println(string);
		}

	}

}
