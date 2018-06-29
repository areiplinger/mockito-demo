package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusinessImpl;

    @Test
    public void testFindTheGreatestFromAllData() {

        //dataServiceMock.retrieveAllData() => new int[] {24,15,3}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,5,14});

        //SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(25, someBusinessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_OneVal() {
/*        DataService dataServiceMock  = mock(DataService.class);
        //dataServiceMock.retrieveAllData() => new int[] {24,15,3} */
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});

        //SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(15, someBusinessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_NoVal() {
/*        DataService dataServiceMock  = mock(DataService.class);
        //dataServiceMock.retrieveAllData() => new int[] {24,15,3} */
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});

        //SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(Integer.MIN_VALUE, someBusinessImpl.findTheGreatestFromAllData());
    }
}

