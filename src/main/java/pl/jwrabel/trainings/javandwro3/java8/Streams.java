package pl.jwrabel.trainings.javandwro3.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by jakubwrabel on 15/05/2017.
 */
public class Streams {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(10);
		list.add(3);

		list.stream()
				.forEach(
						new Consumer<Integer>() {
							@Override
							public void accept(Integer integer) {
								System.out.println(integer);
							}
						}
				);


		list.stream().forEach(x -> System.out.println(x));


		list.stream()
				.forEach(
						new Consumer<Integer>() {
							@Override
							public void accept(Integer integer) {
								System.out.println(integer);
								System.out.println("Twice:" + integer);
							}
						}
				);

		list.stream().forEach(x -> {
			System.out.println(x);
			System.out.println("Twice:" + x);
		});

		for (Integer integer : list) {
			System.out.println(integer);
			System.out.println("Twice:" + integer);
		}

		list.stream().forEach(x -> {
			System.out.println(x);
			System.out.println("Twice:" + x);
		});

		list.forEach(x -> System.out.println(x));

		list.forEach(System.out::println);

		// FILTROWANIE
		System.out.println("Przefiltrowany strumień");

		list.stream().filter(x -> x >= 5).forEach(x -> System.out.println(x));

		// to samo bez lambd
		list.stream().filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer integer) {
				return integer > 10;
			}
		}).forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer integer) {
				System.out.println(integer);
			}
		});


		




	}


	public static void consume(MyConsumer myConsumer) {
		double x = 20;
		double multiply = myConsumer.multiply(x);
		System.out.println("Multiplied: " + multiply);
	}
}