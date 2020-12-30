package by.homework.homework7.Task1;

import java.util.List;
import java.util.Map;
import java.util.Random;

import java.util.stream.Collectors;

public class TestListMap {

	public static void main(String[] args) {

		final double Pi = 3.14;

		List<Long> ran = new Random().longs(100, 1, 100).map(x -> (long) (x * Pi - 20)).filter(x -> x < 100).sorted()
				.skip(3).distinct().boxed().collect(Collectors.toList());

		Map<Long, String> m = ran.stream().collect(Collectors.toMap(x -> x, y -> "Number" + y));
		System.out.println(m);

	}
}
