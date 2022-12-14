import java.util.List;

public class NumbersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=List.of(1,2,3,4,5,6);
		values.stream().filter(value -> value%2 !=0 ).
		map(value -> value * value * value).
		forEach(System.out::println);
	
	}

	

}
