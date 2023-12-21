package backup.leetcode.c2;

import java.util.List;

public class CountMatches078 {

	public static void main(String[] args) {

	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int index = 0;
		if ("color".equals(ruleKey))
			index = 1;
		else if ("name".equals(ruleKey))
			index = 2;
		int count = 0;
		for (List<String> itemLs : items) {
			if (ruleValue.equals(itemLs.get(index))) {
				count++;
			}
		}
		return count;
	}
}
