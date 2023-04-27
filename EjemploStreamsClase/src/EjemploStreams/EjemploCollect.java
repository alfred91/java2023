package EjemploStreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploCollect {

	public static void main(String[] args) {
		
		System.out.println(
			Stream.generate( () -> ( (int) (Math.random() * 100) ) + 1  )
				.limit(20)
				.collect(Collectors.counting())
		);
		
		System.out.println(
				Stream.generate( () -> ( (int) (Math.random() * 100) ) + 1  )
					.limit(20)
					.peek(System.out::println)
					.collect(Collectors.summingInt( Integer::intValue ))
		);
		
		System.out.println(
				Stream.generate( () -> ( (int) (Math.random() * 100) ) + 1  )
					.limit(20)
					.collect(Collectors.averagingInt( Integer::intValue ))
		);
		
		System.out.println(
				Stream.generate( () -> ( (int) (Math.random() * 100) ) + 1  )
					.limit(20000)
					.collect(Collectors.summarizingInt(Integer::intValue))
		);

	}
}