package Interview_Preparation_Kit.dictionaries_and_hashmaps;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class MagazineWord {
	private final String word;
	private int occurrence = 1;

	public MagazineWord(String word) {
		this.word = word;
	}

	public void increment() {
		occurrence += 1;
	}

	public void decrement() throws Exception {
		if (occurrence == 0) {
			throw new Exception();
		}
		occurrence -= 1;
	}

	public String getWord() {
		return word;
	}
}


public class RansomNote {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = bufferedReader
				.readLine()
				.replaceAll("\\s+$", "").split(" ");
		int m = Integer.parseInt(firstMultipleInput[0]);
		int n = Integer.parseInt(firstMultipleInput[1]);

		List<String> magazine = Stream.of(
				bufferedReader
						.readLine()
						.replaceAll("\\s+$", "")
						.split(" ")).collect(toList());
		List<String> note = Stream.of(
				bufferedReader
						.readLine()
						.replaceAll("\\s+$", "")
						.split(" ")).collect(toList());
		checkMagazine(magazine, note);
		bufferedReader.close();
	}

	public static void checkMagazine(List<String> magazineWords, List<String> noteWords) {
		Map<String, MagazineWord> magazineMap = new HashMap<>();
		for (String word : magazineWords) {
			try {
				magazineMap.get(word).increment();
			} catch (NullPointerException e) {
				MagazineWord wordObj = new MagazineWord(word);
				magazineMap.put(wordObj.getWord(), wordObj);
			}
		}

		for (String word : noteWords) {
			try {
				magazineMap.get(word).decrement();
			} catch (Exception e) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}

