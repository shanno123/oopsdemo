package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {

		List<String> city =Arrays.asList("Delhi","Mumbai","Dhanbad","Daman","Bengaluru");
		
		//sorting elements using streams
		city.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		//operations by creating a stream
		city.stream().filter(s->s.startsWith("D")).map(String::toUpperCase).sorted()
		.forEach(System.out::println);
		
		//Another way to process and display
		System.out.println();
		List<String> result=city.stream()
							.filter(s->s.startsWith("D"))
							.map(String::toUpperCase)
							.collect(Collectors.toList());
		System.out.println(result);
		System.out.println();
		
		//print list using lambda express--this must be followed in streams
		result.forEach(c->System.out.println(c)); 
		
		//display from nos. 1-10 with streams excluding the last value i.e 10
		IntStream.range(1, 10).forEach(i->System.out.println(i));
		
		//display from nos. 1-10 with streams including the last value i.e 10
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		//sum of array elements using streams
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		
		//using reduce; default index is always is 0 if we put another value it will add
		int sum=Arrays.stream(numbers).reduce(0,(a,b)->a+b);
		System.out.println("Sum of Arrays is :"+sum);

	}

}
