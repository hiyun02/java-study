import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class q15552 {

	public static void main(String[] args) throws IOException {
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	String s= bf.readLine();
	int n = Integer.parseInt(s);

	for(int i =0;i<n;i++) {
		String two = bf.readLine();
		String[] ab= two.split(" ");
		int result =Integer.parseInt(ab[0])+Integer.parseInt(ab[1]);
	bw.write(result+"");
	bw.newLine();
	}
	bw.close();
	}

}
