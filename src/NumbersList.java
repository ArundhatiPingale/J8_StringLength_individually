import java.util.List;

public class NumbersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumbersList(List.of(12, 5, 6, 3,2,4,8,1));
		
	}
	private static boolean isEven(int number)
	{
		return number%2==0;
	}

	private static void NumbersList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().
		filter(NumbersList::isEven)
		.forEach(System.out::println);

	}

}
