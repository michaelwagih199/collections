package unitTesting.mockito;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {

    /*
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Rule
    public MockitoRule initRule = MockitoJUnit.rule();
    
     */

    @Mock
    List<String> mockList;
    
    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        List mockList = Mockito.mock(ArrayList.class);
        mockList.add("one");
        Mockito.verify(mockList).add("one");
        assertEquals(0, mockList.size());

        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(200,mockList.size());
    }

    @Test
    public void whenUseMockAnnotation_thenMockIsInjected() {
        mockList.add("one");
    }

    @Test
    public void whenNotUseSpyAnnotation_thenCorrect() {
        List<String> spyList = Mockito.spy(new ArrayList<String>());
        spyList.add("one");
        spyList.add("tow");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("tow");

        assertEquals(2,spyList.size());

    }
}
