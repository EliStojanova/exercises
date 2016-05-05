
public class MainClass {

	public static void main(String[] args) {
		Box box1 = new Box(10, 20, 30);
		Box box2 = new Box(100, 200, 300);

		if ((box1.volume(box1.getHeight(), box1.getWeight(),
				box1.getDepth()) > (box2.volume(box2.getHeight(), box2.getWeight(), box2.getDepth())))) {

			System.out.println("box1");
		} else if ((box1.volume(box1.getHeight(), box1.getWeight(),
				box1.getDepth()) < (box2.volume(box2.getHeight(), box2.getWeight(), box2.getDepth())))) {

			System.out.println("box2");
		}

		else {
			System.out.println("equals volume");
		}

	}
}
