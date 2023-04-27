package EjemploStreams;

import java.util.Random;
import java.util.stream.Stream;

public class EjemplosReduccion {

	public static void main(String[] args) {
		
		Stream.generate(new Random()::nextInt)
		.limit(10)
		.reduce(Integer::sum)
		.ifPresent( e -> System.out.println(e) );
		
		System.out.println("-------------");

		System.out.println(
			Stream.generate(new Random()::nextInt)
			.limit(10)
			.peek(System.out::println)
			.reduce(Integer::max)
			.get()
		);
		
		System.out.println("-------------");

		System.out.println(
			Stream.generate( () -> ( (int) (Math.random() * 10) ) + 1  )
			.limit(4)
			.peek(System.out::println)
			.reduce(Math::multiplyExact)
			.get()
		);
		
		System.out.println(
			Stream.generate( () -> ( (int) (Math.random() * 10) ) + 1  )
			.limit(4)
			.peek(System.out::println)
			.reduce( (x,y) -> x * y )
			.get()
			);
		
	}

}