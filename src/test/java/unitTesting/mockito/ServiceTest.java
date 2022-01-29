package unitTesting.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTest  {

    @Mock
    Database databaseMock;

    @Test
    public void testQuery(){
        assertNotNull(databaseMock);
        when(databaseMock.getId()).thenReturn(42);
        Service service = new Service(databaseMock);
        assertEquals(service.toString(), "Using database with id: 52");
    }
}