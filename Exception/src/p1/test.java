public class test {

	static void f1() {
		System.out.println("in f1 function  At Begin");
		f2();
		System.out.println("in f1 function At End");

	}

	static void f2() {
		System.out.println("in f2 function");
		try{
			int n=12/0;
		 System.out.println(n);
		}catch{ArithmeticException e}
		

	}

	public static void main(String[] args) {

		System.out.println("In Begin Main");

		f1();
		System.out.println("In End Main");

	}

}

