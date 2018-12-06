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
        Chapter SUT = new Chapter("Prologue",1);

        // ACT

        // ASSERT
        assertNotEquals("Name should not be a null string","",SUT.getName());

    }
}
