package backup.ky.noj;

import java.util.Arrays;
import java.util.Scanner;

public class Dijkstra {

	public static final int INF = 1000;
	public static int n; // 顶点数
	public static int[][] w; // u到v的权值
	public static boolean used[]; // 标记数组
	public static int[] d; // 从某个顶点出发的最短距离

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //顶点数
		int m = sc.nextInt(); //边数
		int s = sc.nextInt();
		int t = sc.nextInt();
		w = new int[Dijkstra.n][Dijkstra.n]; //权值数组
		used = new boolean[Dijkstra.n];
		d = new int[Dijkstra.n]; //最短距离数组
		//初始化w
		for (int i = 0; i < Dijkstra.n; i++) {
			for (int j = 0; j < Dijkstra.n; j++) {
				w[i][j] = INF;
			}
		}

		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			w[v1][v2] = sc.nextInt();
		}


		System.out.println(dijkstra(s, t));


	}

	public static int dijkstra(int v, int t) {
		//初始化
		Arrays.fill(d, INF);
		Arrays.fill(used, false);

		d[v] = 0; //从顶点v出发
		while (true) {
			int v1 = -1;
			for (int i = 0; i < n; i++) {
				if (!used[i] && (v1 == -1 || d[i] < d[v1]))
					v1=i;
			}
			if (v1 == -1)
				break;
			used[v1] = true;
			for (int i = 0; i < n; i++) {
				d[i] = Math.min(d[i], d[v1] + w[v1][i]);
			}
		}

		return d[t];

	}


}
