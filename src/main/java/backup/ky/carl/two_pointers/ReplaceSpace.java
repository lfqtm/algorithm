package backup.ky.carl.two_pointers;

public class ReplaceSpace {

	public static void main(String[] args) {
		String s = "We are happy.";
		System.out.println(replaceSpace(s));
	}

	public static String replaceSpace(String s) {
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			if (s.charAt(i) == ' ') {
				sb.append("%20");
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
