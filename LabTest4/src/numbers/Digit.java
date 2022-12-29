package numbers;

public class Digit {

	public String pos(String Str) {
		int n = Str.length();
		String st = Str.substring(0,n-4);
	String st1 = Str.substring(n-4,n);

		char ch[] = st.toCharArray();

		for(int i =0;i<ch.length;i++) {

		ch[i] = '*';


		}

		String str = String.valueOf(ch);

		String s3=str.concat(st1);

		return s3;
	}

		public static void main(String args[]) {

		Digit ret =new Digit();
			String sm = ret.pos("123456789");
			System.out.println(sm);




		
		
		}
}
