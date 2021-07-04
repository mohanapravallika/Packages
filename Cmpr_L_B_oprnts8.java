package pack1;
public class Cmpr_L_B_oprnt {
	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		int c = 30;
		System.out.println(a > b && a++ <c);
		System.out.println(a);
		System.out.println(a > b & a++ < c);
		System.out.println(a);
		System.out.println(a < b || b++ < c);
		System.out.println(b);
		System.out.println(a < b | b++ < c);
		System.out.println(b);
	}
}