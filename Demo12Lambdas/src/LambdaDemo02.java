
public class LambdaDemo02 {

	@FunctionalInterface
	interface Blah {
		int go(int p, int q);
	}

	int doThing(Blah b) {
		return b.go(4, 5);
	}

	public static void main(String[] args) {
		LambdaDemo02 demo = new LambdaDemo02();
		System.out.println("Test 1: " + demo.doThing((p, q) -> p * q + 2));
		
		int x = 4;
		System.out.println("Test 2: " + demo.doThing((p, q) -> p + q * x));
		
		Blah myLambda = (p, q) -> 3 + p * q;
		System.out.println("Test 3: " + demo.doThing(myLambda));
	}

}
