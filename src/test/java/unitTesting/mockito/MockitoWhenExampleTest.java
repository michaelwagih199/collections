package unitTesting.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Iterator;
import java.util.Properties;

import static java.lang.Integer.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.when;


import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockitoWhenExampleTest {

    @Mock
    Iterator<String> i;
    Comparable<String> c;

    @Test
    void testMoreThanOneReturnValue() {
        when(i.next()).thenReturn("Mockito").thenReturn(String.valueOf(50)).thenReturn("rocks");
        String result = i.next() + " " + i.next();
        assertEquals("Mockito 50", result);
    }

    @Test
    void testReturnValueDependentOnMethodParameter(@Mock Comparable<String> c) {
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        //assert
        assertEquals(1, c.compareTo("Mockito"));
        assertEquals(2, c.compareTo("Eclipse"));
    }

    @Test
    void testReturnValueInDependentOnMethodParameter2(@Mock Comparable<Integer> c) {
        when(c.compareTo(isA(Integer.class))).thenReturn(0);
        assertEquals(0, c.compareTo(valueOf(4)));
    }

    @Test
    void testMockitoThrows() {

        Properties Properties = Mockito.mock(Properties.class);

        when(Properties.get(Mockito.anyString()))
                .thenThrow(new IllegalArgumentException("Stuff"));

        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> Properties.get("A"));
    }


}
