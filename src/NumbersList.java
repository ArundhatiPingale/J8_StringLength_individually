import java.util.List;

public class NumbersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumbersList(List.of(12, 5, 6, 3,2,4,8,1));
		
	}
	private static void print(int number)
	{
		System.out.println(number);
	}

	private static void NumbersList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().forEach(NumbersList::print);
//		for (int number :numbers)
//		{
//			System.out.println(number);
//		}
	}

}
