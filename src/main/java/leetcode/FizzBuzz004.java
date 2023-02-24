package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 *      给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果
 * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 * answer[i] == "Fizz" 如果 i 是 3 的倍数。
 * answer[i] == "Buzz" 如果 i 是 5 的倍数。
 * answer[i] == i （以字符串形式）如果上述条件全不满足。
 */
public class FizzBuzz004 {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}

	public static List<String> fizzBuzz(int n) {
		List<String> answer = new ArrayList<>();
		int idx = 0;
		for (int i = 0; i < n; i++) {
			idx = i + 1;
			if (idx % 3 == 0 && idx % 5 == 0) {
				answer.add(i, "FizzBuzz");
			} else if (idx % 3 == 0) {
				answer.add(i, "Fizz");
			} else if (idx % 5 == 0) {
				answer.add(i, "Buzz");
			} else {
				answer.add(i, idx + "");
			}
		}
		return answer;
	}
}
