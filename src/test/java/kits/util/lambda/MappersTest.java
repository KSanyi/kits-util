package kits.util.lambda;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import org.junit.Test;

public class MappersTest {

	@Test
	public void mapList() {
		
		List<Integer> integers = Arrays.asList(1, 2, 3);
		
		List<String> result = Mappers.mapList(integers, i -> i + ". element");
		
		Assert.assertEquals(Arrays.asList("1. element", "2. element", "3. element"), result);
		
	}
	
}
