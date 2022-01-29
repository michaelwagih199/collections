package unitTesting.mockito;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoSpyWithListTest {

    @Spy
    private final List<String> list = new ArrayList<>();

    @Test
    public void shouldAddItemsToListSuccessfully(){
        list.add("one");
        list.add("two");
        verify(list, times(2)).add(anyString());
        verify(list).add("one");
        verify(list).add("tow");
        Assert.assertEquals(2,list.size());
    }

}
