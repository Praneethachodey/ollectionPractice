package come.bridgelabz.collectionsPractice;

import org.junit.Assert;
import org.junit.Test;

public class MapTest {

	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		HashMap<String, Integer> myHashMap = new HashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency=myHashMap.get("to");
		System.out.println(myHashMap);
		Assert.assertSame(2,frequency);

	}

}
