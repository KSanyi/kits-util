package kits.util.testhelpers;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import kits.util.testheplers.RandomWordPicker;

import org.junit.Test;

public class RandomWordPickerTest {

	@Test
	public void createRandomNames() {
		
		RandomWordPicker lastNamePicker = new RandomWordPicker(loadPath("LastNames.txt"));
		RandomWordPicker firstNamePicker = new RandomWordPicker(loadPath("FirstNames.txt"));
		
		for(int i=0;i<100;i++) {
			System.out.println(lastNamePicker.pickRandomWord() + " " + firstNamePicker.pickRandomWord());
		}
		
	}
	
	private Path loadPath(String fileName) {
		try {
			return Paths.get(ClassLoader.getSystemResource(fileName).toURI());
		} catch(URISyntaxException ex) {
			throw new RuntimeException(ex);
		}
	}
	
}
