package com.devendra.project;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceVerificationTest {
    @Test
    public void tsetVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();

//        verify(mockApi, times(1)).getData();      // Exactly once
//        verify(mockApi, atLeastOnce()).getData(); // At least once
//        verify(mockApi, never()).getData();       // Never called

//        ExternalApi2 mockApi2 = mock(ExternalApi2.class);
//        MyService2 service = new MyService2(mockApi2);
//        String token = "user1223345645frecd";
//        service.fetchData(token);
//        verify(mockApi2).getData(token);

    }
}
