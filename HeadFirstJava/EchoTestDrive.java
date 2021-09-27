public class EchoTestDrive {
	public static void main(String[] args) {
		Echo e1 = new Echo();
		//Echo e2 = new Echo();   //blank
		Echo e2 = e1;   //blank

		int x = 0;
		while( x<4 ) {  //blank
			e1.hello();
			e1.count = e1.count+1;  //blank
			if ( x==3 ) {   //blank
				e2.count = e2.count + 1;
			}
			if ( x>0 ) {    //blank
				e2.count = e2.count + e1.count;
			}
			x = x + 1;
		}
		System.out.println(e2.count);
	}
}

class Echo {
	int count = 0;
	void hello() {
		System.out.println("helloooo...");
	}
}
