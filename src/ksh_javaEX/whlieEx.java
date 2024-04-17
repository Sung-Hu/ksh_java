package ksh_javaEX;

public class whlieEx {

	public static void main(String[] args) {

		int i = 1; //시작 값은 1
		int l = 0; //
		
		while(i <= 10) {
			l += i;
			i++;
		} // end of while 
		System.out.println("값은 : " + l);
	}

}
