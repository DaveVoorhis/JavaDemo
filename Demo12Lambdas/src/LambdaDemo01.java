
public class LambdaDemo01 {

	@FunctionalInterface
	interface Blah {
		int go();
	}

	int doThing(Blah b) {
		return b.go();
	}

	public static void main(String[] args) {
		LambdaDemo01 demo = new LambdaDemo01();
		System.out.println("Test 1: " + demo.doThing(() -> 2));
		
		int x = 4;
		System.out.println("Test 2: " + demo.doThing(() -> 3 * x));
		
		Blah myLambda = () -> 3 + x * 2;
		System.out.println("Test 3: " + demo.doThing(myLambda));
		
		System.out.println("Test 4: " + demo.doThing(() -> {
			System.out.println("\tHave a fish!");
			return 4;
		}
		));
	}

}
