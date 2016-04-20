package kits.util.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mappers {

	public static <T, S> List<T> mapList(List<S> list, Function<S, T> map) {
		return list.stream().map(map).collect(Collectors.toList());
	}
	
}
