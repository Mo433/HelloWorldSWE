import java.util.Scanner;

public class basketball {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Geben Sie bitte einen Start punkt ein (x|y): ");
//		String start = sc.next();
//		for (int i = 0; i < start.length(); i++) {
//			if (start.charAt(i)=='|') {
//				String x= start.substring(0,i);
//				String y= start.substring(i + 1 , start.length());
//				Double xs = Double.valueOf(x);
//				Double ys = Double.valueOf(y);
//			}
//		}
//		System.out.print("Geben Sie bitte Den Korb punkt ein (x|y): ");
//		String korb = sc.next();
//		for (int i = 0; i < korb.length(); i++) {
//			if (korb.charAt(i)=='|') {
//				String x= korb.substring(0,i);
//				String y= korb.substring(i + 1 , korb.length());
//				Double xk = Double.valueOf(x);
//				Double yk = Double.valueOf(y);
//			}
//		}
//		
//		System.out.print("Geben Sie die Scheitelpunkt ein (x|y): ");
//		String scheitel = sc.next();
//		for (int i = 0; i < scheitel.length(); i++) {
//			if (scheitel.charAt(i)=='|') {
//				String x= scheitel.substring(0,i);
//				String y= scheitel.substring(i + 1 , scheitel.length());
//				Double xh = Double.valueOf(x);
//				Double yh = Double.valueOf(y);
//			}
//		}
		Double x = eingabe();
		Double y = eingabe();
		Double xs = eingabe();
		Double ys = eingabe();
		Double xk = eingabe();
		Double yk = eingabe();
		
		rechnung(x, y, xs, ys, xk, yk);
		
		

	}

	private static Double eingabe() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie bitte eine zahl ein: ");
		Double eingabe = sc.nextDouble();
		return eingabe;
	}

	private static void rechnung(Double x, Double y, Double xs, Double ys, Double xk, Double yk) {
		
//		//f(x) = a(x-xs)2 + ys
				
				Double klammer = x - xs;
				Double quad = Math.pow(klammer, 2);
		System.out.println(klammer);
		System.out.println(quad);
				Double 	a = y -ys;
					a = a / quad;
		System.out.println(a);
				Double klammer1 = xk - xs;
				Double quad1 = Math.pow(klammer1, 2);
		System.out.println(klammer1);
		System.out.println(quad1);
				Double ergibnss= a * quad1 + ys;
		System.out.println(ergibnss);
		if (ergibnss != xk ){ 
			System.out.println("Nicht getroffen!");
			
		}else {
			System.out.println("Getroffen!");
		}
		
		
	}	

}
