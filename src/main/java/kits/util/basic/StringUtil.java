package kits.util.basic;

public class StringUtil {

	public static boolean containsIgnoreCase(String container, String pattern) {
		return container.toLowerCase().contains(pattern.toLowerCase());
	}
	
}
