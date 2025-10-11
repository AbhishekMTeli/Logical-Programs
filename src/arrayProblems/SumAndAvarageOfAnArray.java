package arrayProblems;

public class SumAndAvarageOfAnArray {
	public static void main(String[] args) {
		int arr[] = { 3, -4, 7, -3, 9, 2 };
		int sum = 0;
		if (arr.length == 0) {
			System.out.println("The array is empty ");
			return;
		}
		for (int num : arr) {
			sum = sum + num;
		}
		double avg = (double) sum / arr.length;
		System.out.println("The sum of an array is " + sum);
		System.out.println("The avarage of an array is " + avg);
	}
}
// trying to get the merge conflictt
// dsgu

//  gdghjhkj
// ffyhggyuhiuv