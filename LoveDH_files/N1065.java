import java.io.*;

public class N1065 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String n = br.readLine();
        int intN = Integer.parseInt(n);
        int output = 99; // 99<= 한수 <=110은 한수가 99개다
        
        if(intN>=111) { // 111부터 체크
            
            for(int i=111; i<=intN; i++) { // 1000이 들어가도 1000은 한 수가 아니기 때문에 자동으로 계산되지 않는다.
                String checkNum= String.valueOf(i);
                int firstGap = Character.getNumericValue(checkNum.charAt(0)) - Character.getNumericValue(checkNum.charAt(1));
                int secondGap = Character.getNumericValue(checkNum.charAt(1)) - Character.getNumericValue(checkNum.charAt(2));
                
                if(firstGap == secondGap) { // 자릿수 갭 차이가 같으면 한수이다
                    output++;
                }
            }
        }else if(intN <99){ // 98 이하 수들은 입력한 값 그대로다
            output = intN;
        }
        
        bw.write(String.valueOf(output));
        bw.flush();
    }
}