package kits.util.collections;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Mappers {

	// List operations
	
	public static <S> List<S> filter(List<S> list, Predicate<S> predicate) {
		return list.stream().filter(predicate).collect(Collectors.toList());
	}
	
	public static <S, T> List<T> map(List<S> list, Function<S, T> map) {
		return list.stream().map(map).collect(Collectors.toList());
	}
	
	public static <S, T> List<T> map(List<S> list, Predicate<S> predicate, Function<S, T> map) {
		return list.stream().filter(predicate).map(map).collect(Collectors.toList());
	}
	
	// Set operations
	
	public static <S> Set<S> filter(Set<S> list, Predicate<S> predicate) {
		return list.stream().filter(predicate).collect(Collectors.toSet());
	}
	
	public static <S, T> Set<T> map(Set<S> list, Function<S, T> map) {
		return list.stream().map(map).collect(Collectors.toSet());
	}
	
	public static <S, T> Set<T> map(Set<S> list, Predicate<S> predicate, Function<S, T> map) {
		return list.stream().filter(predicate).map(map).collect(Collectors.toSet());
	}
	
}
