package kits.util.collections;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import static kits.util.collections.ImmutableMap.*;

public class ImmutableMapTest {

	@Test
	public void test1(){
		
		Map<String, ?> map = mapOf(
				"name", "John",
				"age", 35,
				"city", "London",
				"car", "BMW",
				"married", false,
				"job", "accountant",
				"salary", 100_000,
				"phone", "532413",
				"children", 0,
				"education", "university");
		
		Assert.assertEquals("John", map.get("name"));
		Assert.assertEquals(35, map.get("age"));
		Assert.assertEquals("London", map.get("city"));
		Assert.assertEquals("BMW", map.get("car"));
		Assert.assertEquals(false, map.get("married"));
		Assert.assertEquals("accountant", map.get("job"));
		Assert.assertEquals(100_000, map.get("salary"));
		Assert.assertEquals("532413", map.get("phone"));
		Assert.assertEquals(0, map.get("children"));
		Assert.assertEquals("university", map.get("education"));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test2(){
		
		Map<String, ?> map = mapOf(
				"name", "John",
				"age", 35,
				"address", mapOf(
						"city", "London",
						"street", "Downing",
						"number", 15));
		
		Assert.assertEquals("John", map.get("name"));
		Assert.assertEquals(35, map.get("age"));
		Map<String, ?> addressMap = (Map<String, ?>) map.get("address"); 
		Assert.assertEquals("London", addressMap.get("city"));
		Assert.assertEquals("Downing", addressMap.get("street"));
		Assert.assertEquals(15, addressMap.get("number"));
		
	}		
	
}
