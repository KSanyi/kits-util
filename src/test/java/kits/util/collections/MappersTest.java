package kits.util.collections;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import org.junit.Test;

import kits.util.collections.Mappers;

public class MappersTest {

	@Test
	public void filterList() {
		List<Integer> integers = Arrays.asList(1, 2, 3);
		
		List<Integer> result = Mappers.filter(integers, i -> i % 2 == 1);
		
		Assert.assertEquals(Arrays.asList(1, 3), result);
	}
	
	@Test
	public void mapList() {
		List<Integer> integers = Arrays.asList(1, 2, 3);
		
		List<String> result = Mappers.map(integers, i -> i + ". element");
		
		Assert.assertEquals(Arrays.asList("1. element", "2. element", "3. element"), result);
	}
	
	@Test
	public void mapAndFilterList() {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<String> result = Mappers.map(integers, i -> i % 2 == 0, i -> "number " + i);
		
		Assert.assertEquals(Arrays.asList("number 2", "number 4", "number 6"), result);
	}
	
}
