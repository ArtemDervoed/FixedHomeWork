import static org.junit.Assert.*;

import org.junit.Test;

public class RepeatCharInArrayTest {
RepeatCharInArray utilite = new RepeatCharInArray();
	@Test
	public void testCheckElements() throws Exception {
        String[] s = {"srt", "src", "to","centre","srt","key","cell"};
        boolean res = true;
        assertEquals(utilite.searchRepeatElementsInArray(s),res);
	}
	@Test
	public void testCheckElementsWithEmptyArray() throws Exception {
        String[] s = {};
        boolean result = false;
        assertEquals(utilite.searchRepeatElementsInArray(s),result);
	}
	@Test
	public void testCheckElementsWithOutRepeatElements() throws Exception {
        String[] s = {"srt", "src", "to","centre","srt8","key","cell"};
        boolean result = false;
        assertEquals(utilite.searchRepeatElementsInArray(s),result);
	}

}
