package backup.ky.nn;

import java.util.*;

/**
 * n诺刷题笔记
 */
public class Main {

	// 日期差值
	//20110412
	//20110422
	public static void main(String[] args) {

	}

	// 杨辉三角
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			if (i != 1)
//				System.out.println();
//			for (int j = 1; j <= i; j++) {
//				if (j != 1)
//					System.out.print(" ");
//				System.out.print(yang(i, j));
//			}
//		}
//		System.out.println();
//		System.out.print(yang(3, 2));
//	}

	// 递归求杨辉三角
	public static int yang(int i, int j) {
		if (j == 1 || j == i) // 每行第一个元素和最后一个元素都为1
			return 1;
		else
			return yang(i - 1, j - 1) + yang(i - 1, j);
	}

	// 矩阵旋转180
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[][] mat1 = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				mat1[i][j] = sc.nextInt();
//			}
//		}
//
//		int[][] NewMat = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				NewMat[n - i - 1][n - j - 1] = mat1[i][j];
//			}
//		}
//
//		System.out.print(Arrays.deepToString(NewMat));
//	}

	// 矩阵旋转90
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[][] nums = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				nums[i][j] = sc.nextInt();
//			}
//		}
//
//		// 旋转
//		int[][] Nums = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				Nums[j][n - i - 1] = nums[i][j];
//			}
//		}
//
//		// 矩阵扁平化
//		int[] flat = new int[n * n];
//		for (int i = 0; i < n * n; i++) {
//			flat[i] = nums[i/n][i%n];
//		}
//
//		System.out.print(Arrays.deepToString(Nums));
//		System.out.println(Arrays.toString(flat));
//	}

	// 矩阵旋转
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[][] m1 = new int[n][n];
//		int[][] m2 = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				m1[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				m2[i][j] = sc.nextInt();
//			}
//		}
//
//		int angle = 0; //角度
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (angle == 0) {
//					if (m1[i][j] == m2[i][j]) //0度 aij = bij
//						continue;
//					else
//						angle = 90;
//				}
//
//				if (angle == 90) {
//					if (m1[i][j] == m2[j][n - i - 1]) //90 aij = bj,n-i-1
//						continue;
//					else
//						angle = 180;
//				}
//
//				if (angle == 180) {
//					if (m1[i][j] == m2[n - i - 1][n - j - 1]) // 180 aij = bn-i-1,n-j-1
//						continue;
//					else
//						angle = 270;
//				}
//
//				if (angle == 270) {
//					if (m1[i][j] == m2[n - j - 1][i]) //270 aij = bn-j-i,i
//						continue;
//					else
//						angle = -1;
//				}
//
//				if (angle == -1) {
//					break;
//				}
//			}
//			if (angle == -1) {
//				break;
//			}
//		}
//		System.out.print(angle);
//	}

	// 删除最大最小值
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//
//		int[] copyNums = new int[n];
//		System.arraycopy(nums, 0, copyNums, 0, n);
//		Arrays.sort(copyNums);
//		int min = copyNums[0];
//		int max = copyNums[n - 1];
//		for (int i = 0; i < n; i++) {
//			int num = nums[i];
//			if (num != min && num != max) {
//				System.out.print(num);
//				if (i != 0 && i != n - 1)
//					System.out.print(" ");
//			}
//		}
//	}

	// 查找
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		int m = sc.nextInt();
//		int[] b = new int[m];
//		for (int i = 0; i < m; i++) {
//			b[i] = sc.nextInt();
//		}
//
//		Arrays.sort(nums); //数组排序
//		for (int i = 0; i < m; i++) {
//			if (i != 0)
//				System.out.println();
//			if (Arrays.binarySearch(nums, b[i]) > -1) { //
//				System.out.print("YES");
//			} else {
//				System.out.print("NO");
//			}
//		}
//	}

	// 进制转换
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		List<String> nums = new ArrayList<>();
//		while (sc.hasNextInt()) {
//			nums.add(Integer.toString(sc.nextInt(), 2));
//		}
//		for (int i = 0; i < nums.size(); i++) {
//			if (i != 0)
//				System.out.println();
//			System.out.print(nums.get(i));
//		}
//	}

	// 字母统计
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String line = sc.nextLine();
//		int[] nums = new int[26];
//		for (int i = 0; i < line.length(); i++) {
//			char ch = line.charAt(i);
//			if (ch >= 65 && ch <= 90) { // 大写字母 65-90，小写是97到122，数字是48-57
//				nums[ch - 'A']++;
//			}
//		}
//		for (int i = 0; i < 26; i++) {
//			if (i != 0)
//				System.out.println();
//			System.out.printf("%c:%d", (char) i + 65, nums[i]);
//		}
//	}

	// 成绩排序
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[][] nums = new int[n][2];
//		for (int i = 0; i < n; i++) {
//			nums[i][0] = sc.nextInt();
//			nums[i][1] = sc.nextInt(); // 成绩
//		}
//
//		Arrays.sort(nums, (o1, o2) -> o1[1] - o2[1]);
//		for (int i = 0; i < n; i++) {
//			if (i != 0)
//				System.out.println();
//			for (int j = 0; j < nums[i].length; j++) {
//				if (j != 0)
//					System.out.print(" ");
//				System.out.print(nums[i][j]);
//			}
//		}
//	}

	// 击鼓传花
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.println(fn(n, 3) + 1);
//	}

	/**
	 * f(n,m)=(f(n-1,m)+m)%n
	 *
	 * @param n 总数个数
	 * @param m 步长
	 */
	public static int fn(int n, int m) {
		if (n == 1)
			return 0; //当只有一个元素的时候，最后一个元素的下标为0
		return (fn(n - 1, m) + m) % n; //当前轮次的最后元素下标是上一个轮次的下标+步长对n取模
	}

	// 最长连续因子
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		List<List<Integer>> ans = new ArrayList<>();
//
//		for (int i = 2; i <= n; i++) {
//			if (n % i == 0) {
//				List<Integer> r = new ArrayList<>();
//				int j;
//				for (j = i; j <= n; j++) {
//					if (n % j == 0) {
//						r.add(j);
//					} else {
//						break;
//					}
//				}
//				ans.add(r);
//				i = j;
//			}
//		}
//
//		int max = 0;
//		for (int i = 0; i < ans.size(); i++) {
//			if (ans.get(i).size() > ans.get(max).size())
//				max = i;
//		}
//
//		List<Integer> maxLs = ans.get(max);
//		for (int i = 0; i < maxLs.size(); i++) {
//			if (i != 0)
//				System.out.print(" ");
//			System.out.print(maxLs.get(i));
//		}
//	}

	// 字母频率
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String line = sc.nextLine().toLowerCase(); // 转换成小写
//		int[] nums = new int[26];
//		for (int i = 0; i < line.length(); i++) {
//			char ch = line.charAt(i);
//			if (ch >= 97 && ch <= 122) { // 小写a到z统计
//				nums[ch - 'a']++;
//			}
//		}
//
//		int max = 0; // 记录下标
//		int count = 0; // 记录个数
//		for (int i = 0; i < 26; i++) {
//			if (count < nums[i]) {
//				max = i;
//				count = nums[i];
//			}
//		}
//		System.out.printf("%c %d", (char) max + 97, count);
//	}

	// 字符菱形
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int maxLen = 1 + (n - 1) * 2;
//		for (int i = 1; i <= maxLen; i += 2) {
//			if (i != 1)
//				System.out.println();
//			int blank = (maxLen - i) / 2;
//			for (int j = 0; j < blank; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j < blank; j++) {
//				System.out.print(" ");
//			}
//		}
//
//		for (int i = maxLen - 2; i > 0; i -= 2) {
//			System.out.println();
//			int blank = (maxLen - i) / 2;
//			for (int j = 0; j < blank; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j < blank; j++) {
//				System.out.print(" ");
//			}
//		}
//	}

	// 三个数的最大值
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String[] s = sc.nextLine().split(" ");
//		int[] nums = new int[s.length];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = Integer.parseInt(s[i]);
//		}
//
//		Arrays.sort(nums);
//		System.out.print(nums[nums.length - 1]);
//	}

	// 最大公约数和最小公倍数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		int gcd = gcd(m, n);
//		int lcm = m * n / gcd;
//		System.out.printf("%d %d", gcd, lcm);
//	}

	// gcd，最大公约数
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}


	// 查找第k小数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		int k = sc.nextInt();
//		Arrays.sort(nums);
//		// 双指针
//		int l = 0, r = 0;
//		int count = 1;
//		while (r < n && count < k) {
//			if (nums[l] != nums[r]) {
//				count++; // +1已经表示有两个较小值了
//				l = r;
//			}
//			r++;
//		}
//		System.out.print(nums[l]);
//	}

	// 日期计算
//	public static void main(String[] args) {
//		int[][] mons = new int[][]{
//			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
//			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
//		};
//
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		int mon = sc.nextInt();
//		int day = sc.nextInt();
//
//		int leap = isLeap(year);
//		int sum = 0;
//		// 之前的月份和
//		for (int i = 1; i < mon; i++) {
//			sum += mons[leap][i-1];
//		}
//		// 当前月份天数
//		sum += day;
//		System.out.print(sum);
//	}

	// 判断是否是闰年, 返回1表示闰年，0表示平常年
	public static int isLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return 1;
		return 0;
	}

	// 查找学生信息
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int[] books = new int[m];
//		int[] readers = new int[n];
//		for (int i = 0; i < n; i++) {
//			int p = sc.nextInt();
//			readers[i] = p;
//			books[p]++;
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (i != 0)
//				System.out.println();
//			if (books[readers[i]] == 1)
//				System.out.print("BeiJu");
//			else
//				System.out.print(books[readers[i]] - 1);
//		}
//	}

	// 素数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		List<Integer> ans = new ArrayList<>();
//		for (int i = 2; i < n; i++) {
//			if (i % 10 == 1 && isPrime(i)) {
//				ans.add(i);
//			}
//		}
//
//		for (int i = 0; i < ans.size(); i++) {
//			if (i != 0)
//				System.out.print(" ");
//			System.out.print(ans.get(i));
//
//		}
//	}

	// 素数
	public static boolean isPrime2(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// 水仙花数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNextLine()) {
//			String[] s = sc.nextLine().split(" ");
//			int m = Integer.parseInt(s[0]);
//			int n = Integer.parseInt(s[1]);
//			if (m == 0 && n == 0)
//				break;
//			List<Integer> ans = new ArrayList<>();
//			for (int i = m; i <= n; i++) {
//				char[] ch = String.valueOf(i).toCharArray();
//				int sum = 0;
//				for (char ch1 : ch) {
//					sum += Math.pow(ch1 - '0', 3);
//				}
//				if (sum == i)
//					ans.add(i);
//			}
//			if (ans.size() == 0)
//				System.out.println("no");
//			else {
//				for (int i = 0; i < ans.size(); i++) {
//					if (i != 0)
//						System.out.print(" ");
//					System.out.print(ans.get(i));
//					if (i == ans.size() - 1)
//						System.out.println();
//				}
//			}
//		}
//	}

	static class Node {
		int element;
		Node next;

		public Node() {
		}

		public Node(int element, Node next) {
			this.element = element;
			this.next = next;
		}
	}

	// 单链表
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String[] s = sc.nextLine().split(" ");
//		// 获取输入数据
//		List<Integer> nums = Arrays.stream(s).map(Integer::parseInt).collect(Collectors.toList());
//
//		Node head = new Node(Integer.MIN_VALUE, null);
//		Node p = null;
//		for (int element : nums) {
//			p = head;
//			//找到一个小于等于element的node
//			while (p.next != null && p.next.element < element)
//				p = p.next;
//			Node cur = new Node(element, null);
//			cur.next = p.next;
//			p.next = cur;
//		}
//		// 遍历
//		p = head.next;
//		while (p != null) {
//			if (p != head.next)
//				System.out.print(" ");
//			System.out.print(p.element);
//			p = p.next;
//		}
//	}

	// 输出杨辉三角
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNextInt()) {
//			int n = sc.nextInt();
//			List<List<Integer>> ans = new ArrayList<>();
//			for (int i = 0; i < n; i++) { //控制行数
//				List<Integer> row = new ArrayList<>();
//				for (int j = 0; j <= i; j++) { //控制每行个数
//					if (j == 0 || j == i)
//						row.add(1);
//					else
//						row.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
//				}
//				ans.add(row);
//			}
//
//			for (int i = 0; i < ans.size(); i++) {
//				List<Integer> list = ans.get(i);
//				if (i != 0)
//					System.out.println();
//				for (int j = 0; j < list.size(); j++) {
//					if (j != 0)
//						System.out.print(" ");
//					System.out.print(list.get(j));
//				}
//			}
//		}
//	}

	// 博学楼的阶梯
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt(); // t组样例
//		int n = sc.nextInt(); // n层楼梯
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//
//		int pre = 1;
//		int sum = 0;
//		for (int i = 0; i < n; i++) {
//			int cur = nums[i];
//			if (cur > pre)
//				sum += (cur - pre) * 6;
//			else
//				sum += (pre - cur) * 4;
//			sum += 3;
//			pre = cur;
//		}
//		System.out.print(sum);
//	}

	// 幂次方(快速幂)
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int n = sc.nextInt();
//		int num = 1;
//		while (n > 0) { // 每次循环都在算n/2的幂的分解形式
//			if (n % 2 == 1)
//				num *= x % 233333;
//			x = x * x % 233333;
//			n /= 2;
//		}
//		System.out.print(num);
//	}

	// 成绩排序
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = sc.nextInt(); //0标识降序，1标识升序
//		String[] names = new String[n];
//		int[][] nums = new int[n][2]; //n行2列，第二列用来表示下标
//		for (int j = 0; j < n; j++) {
//			names[j] = sc.next();
//			nums[j][0] = sc.nextInt();
//			nums[j][1] = j;
//		}
//
//		Arrays.sort(nums, (o1,o2)-> {
//			if (0 == i)
//				return o2[0]-o1[0];
//			return o1[0]-o2[0];
//		});
//
//		for (int j = 0; j < n; j++) {
//			if (j != 0)
//				System.out.println();
//			System.out.printf("%s %d", names[nums[j][1]], nums[j][0]);
//		}
//	}

	// 字符分类
	// 48-57：0~9
	// 65-90: 大写字母
	// 97-122：小写字母
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		StringBuilder s1 = new StringBuilder();
//		StringBuilder s2 = new StringBuilder();
//		StringBuilder s3 = new StringBuilder();
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch >= 48 && ch <= 57)
//				s2.append(ch);
//			else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
//				s1.append(ch);
//			else
//				s3.append(ch);
//		}
//
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
//		System.out.print(s3.toString());
//	}

	// 二进制数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.print(Integer.toBinaryString(n)); //转为2进制
//	}

	// 进制转换2 (Integer.parseInt())
	//hex.substring(2) 16进制前面有0x
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String hex = sc.next();
//		System.out.print(Integer.parseInt(hex.substring(2), 16));
//	}

	// 翻转数的和
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNextInt()) {
//			int c = sc.nextInt();
//			int d = sc.nextInt();
//			System.out.print(rev(c) + rev(d));
//		}
//	}

	// 翻转数字
	public static int rev(int n) {
		int ans = 0;
		while (n != 0) {
			ans *= 10;
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}

	//0和1的个数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String str = Integer.toBinaryString(n);
//		int count0 = 0;
//		int count1 = 0;
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if (c == '0')
//				count0++;
//			if (c == '1')
//				count1++;
//		}
//		System.out.printf("count0=%d count1=%d", count0, count1);
//	}

	// 随机数
//	public static void main(String[] args) {
//		int[] randomNums = new int[5];
//		for (int i = 0; i < 5; i++) {
//			randomNums[i] = (int) (Math.random() * 20 + 1); // [1-20]的随机整数
//		}
//		System.out.println(Arrays.stream(randomNums).sum());
//		// 求1-20的累和
//		int sum = 20 + 20 * 19 / 2;
//		System.out.print(sum);
//	}

	// 删除字符串2
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String ins = sc.next();
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < ins.length(); i++) {
//			char cur = ins.charAt(i);
//			if (cur == 'g' || cur == 'G') {
//				if (ins.substring(i, i + 3).toUpperCase().equals("GZU")) {
//					i += 2;
//					continue;
//				}
//			}
//			sb.append(cur);
//		}
//		System.out.print(sb.toString());
//	}

	// 反序数
//	public static void main(String[] args) {
//		int n = 1;
//		while (reverse(n) != 9 * n) {
//			n++;
//		}
//		System.out.print(n);
//	}

	/**
	 * 数字n逆序
	 *
	 * @param n 输入
	 * @return 输出
	 */
	public static int reverse(int n) {
		int ans = 0;
		while (n != 0) {
			ans *= 10;
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}

	// 加密算法
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String ins = sc.nextLine();
//		for (int i = 0; i < ins.length(); i++) {
//			char cur = ins.charAt(i);
//			if (cur == ' ' || (cur >= 48 && cur <= 57))
//				System.out.print(cur);
//			else
//				System.out.print((char) (cur + 3));
//		}
//	}

	// 判断素数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while (!isPrime(n)) {
//			n++;
//		}
//		System.out.print(n);
//	}

	/**
	 * 判断是否是质数
	 *
	 * @param n 输入
	 * @return 输出
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// 日期
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int y = sc.nextInt();
//		int r = sc.nextInt();
//
//		int[] yf = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		String[] xq = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//		// 求4月12到输入的月份和日期的天数
//		int days = 0;
//		while (y >= 4) {
//			if (y == 4)
//				days = r - 12;
//			else
//				days += yf[y-1];
//			y--;
//		}
//		int index = days % 7;
//		System.out.print(xq[(3 + index) % 7]);
//	}

	// 字符移动 ab4f35gr#a6
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String ins = sc.next();
//		char[] incs = ins.toCharArray();
//		int csc = 0;
//		for (char ci : incs) {
//			if (!(ci >= 48 && ci <= 57)) {
//				csc++;
//			}
//		}
//		char[] ans = new char[incs.length];
//		int cp = 0;
//		for (char ci : incs) {
//			if (ci >= 48 && ci <= 57) {
//				ans[csc++] = ci;
//			} else {
//				ans[cp++] = ci;
//			}
//		}
//		for (char an : ans) {
//			System.out.print(an);
//		}
//	}

	// 数字统计
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNextLine()) {
//			String[] ins = sc.nextLine().split(" ");
//			int l = Integer.parseInt(ins[0]);
//			int r = Integer.parseInt(ins[1]);
//			int c = 0; //count
//			for (int i = l; i <= r; i++) {
//				char[] cs = String.valueOf(i).toCharArray();
//				for (char value : cs) {
//					if (value == '2')
//						c++;
//				}
//			}
//			System.out.println(c);
//		}
//	}

	// 排序
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}

	//法一：遍历
//		int[] ans = new int[n];
//		int idx = 0;
//		for (int i = 0; i < n; i++) {
//			if ((i + 1) % 2 == 1)
//				ans[idx++] = nums[i];
//		}
//		int cur = idx;
//		for (int i = 0; i < n; i++) {
//			if ((i + 1) % 2 == 0)
//				ans[cur++] = nums[i];
//		}

	//法二：先求奇数位个数
//		int[] ans = new int[n];
//		int odd = 0;
//		int even = 0;
//		if (n % 2 == 1)
//			odd = (n + 1) / 2;
//		else
//			even = n / 2;
//		int cur = even;
//		for (int i = 0; i < n; i++) {
//			if ((i + 1) % 2 == 1)
//				ans[odd++] = nums[i];
//			else
//				ans[even++] = nums[i];
//		}
//		Arrays.sort(ans, cur, n - 1);
//		for (int i = 0; i < n; i++) {
//			if (i != 0)
//				System.out.print(" ");
//			System.out.print(ans[i]);
//		}
//	}

	// 求1到n的和
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.print((1 + n) / 2 * n);
//	}

	// 整除
//	public static void main(String[] args) {
//		List<Integer> ans = new ArrayList<>();
//		for (int i = 101; i < 1000; i++) {
//			if (i % 5 == 0 && i % 6 == 0) {
//				ans.add(i);
//			}
//		}
//
//		for (int i = 0; i < ans.size(); i++) {
//			if (i != 0 && i % 10 == 0)
//				System.out.println();
//			if (i % 10 != 0)
//				System.out.print(" ");
//
//			System.out.print(ans.get(i));
//		}
//
//	}

	// 字符串翻转
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		char[] chars = a.toCharArray();
//		int l = 0, r = chars.length - 1;
//		while (l < r) {
//			char tmp = chars[l];
//			chars[l] = chars[r];
//			chars[r] = tmp;
//			l++;
//			r--;
//		}
//		for (char c : chars) {
//			System.out.print(c);
//		}
//	}

	// 计算sn
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int n = sc.nextInt();
//
//		int sum = 0;
//		int ai = 0;
//		for (int i = 0; i < n; i++) {
//			ai = ai * 10 + a;
//			sum += ai;
//		}
//		System.out.print(sum);
//	}
}
