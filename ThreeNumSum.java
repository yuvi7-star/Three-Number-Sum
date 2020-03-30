
class TestThreeNumSum {
	 static int threeNumSum(int firstNumber, int seconNumber, int thirdNumber) {
	 	int addition = firstNumber + seconNumber + thirdNumber;
	 	return addition;
	 }
}

class ThreeNumSum {
	public static void main(String[] args) {
		int addition = TestThreeNumSum.threeNumSum(20,30,50);
		System.out.println("Addtion = "+addition);
	}
}