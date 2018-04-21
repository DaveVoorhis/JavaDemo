
public class Miscellaneous {

	private int x;
	private int y;
	
	public Miscellaneous() {
		x = 5;
		y = 2;
	}

	public void go() {
		if (x > y) {
			while (x > 0) {
				x--;
			}
			do {
				x++;
			} while (x < 10);
		}
		switch (y) {
		case 2:
			System.out.println("y is 2");
			break;
		case 3:
			System.out.println("y is 3");
			break;
		case 4:
			System.out.println("y is 4");
			break;
		default:
			System.out.println("y is something else");
		}
	}
	
	public static void main(String[] args) {
		Miscellaneous misc = new Miscellaneous();
		misc.go();
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
