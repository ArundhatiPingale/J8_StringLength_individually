import java.util.List;

public class NumbersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> courses=List.of("JAVA","SPRING","HIBERNATE","REST","ANGUKAR","WEBSERVICE");
		
		//courses.stream().map(course -> course.length()).forEach(System.out::println);
		courses.stream().map(course -> course+" "+course.length()).forEach(System.out::println);
	}

	

}
