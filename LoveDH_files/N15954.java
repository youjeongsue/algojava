import java.io.*;
import java.util.*;

public class N15954{

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int k = Integer.parseInt(st.nextToken()); 
		int[] arr = new int[n]; 
		double var = 0, dif_sum = 0, avg = 0, std = 0;
		double min = 10000000; 

		st = new StringTokenizer(br.readLine()); 
		for (int i = 0; i < n; i++) { 
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i <= n - k; i++) {
			int cnt = k; 
			while (i + cnt <= n) { 
				dif_sum = avg = var = std = 0;
				for (int j = 0; j < cnt; j++) {
					dif_sum += arr[i + j]; 
				}
				avg = dif_sum / cnt; 
				dif_sum = 0;
				for (int j = 0; j < cnt; j++) { 
					dif_sum += (arr[i + j] - avg) * (arr[i + j] - avg); 
				}
				var = dif_sum / cnt;
                std = Math.sqrt(var); 
                if (min>=std) min = std;
				cnt++;
			}
		}
		System.out.println(min);
		sc.close();
		bw.close();
		br.close();
	}
}