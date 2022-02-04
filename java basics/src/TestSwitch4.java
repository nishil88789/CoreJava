
public class TestSwitch4 {
public static void main(String[] args) {
	int rate =30000;
	switch (rate) {
	case 10000:
		System.out.println("Hero Bike");
		break;
	case 20000:
		System.out.println("Bajaj Bike");
		break;
	case 30000:
		System.out.println("Suzuki bike");
		break;
	case 40000:
		System.out.println("Tvs Bike");
		break;
	case 50000:
		System.out.println("Electric Bike");
		default:
			System.out.println("Not Available");
	}
}
}
