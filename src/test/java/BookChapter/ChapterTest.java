package BookChapter;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class ChapterTest {

    @Test
    public void nameIsNotNullString(){
        // ARRANGE
        // Create SUT
        Chapter SUT = new Chapter("Prologue","2");

        // ACT

        // ASSERT
        assertNotEquals("Name should not be a null string","",SUT.getName());
    }

    @Test
    public void numberIsStringOfNumberAnd2LevelMaximum(){
        // ARRANGE
        // Create SUT
        Chapter SUT = new Chapter("Prologue","2.2");
        Boolean result = false;

        // ACT
        if (SUT.getNumber().matches("^\\d+(\\.\\d+)?$"))
            result = true;

        // ASSERT
        assertTrue("Number should be a string of numbers and have 2 level maximum (e.g. 2.4)",result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongNameOrNumberWillThrowIllegalArgumentException(){
        // ARRANGE
        // Create SUT
        Chapter SUT = new Chapter("Prologue","2.2.1");

        // ACT

        // ASSERT
    }
}
