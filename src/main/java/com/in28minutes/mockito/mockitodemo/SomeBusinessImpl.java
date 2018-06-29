package com.in28minutes.mockito.mockitodemo;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData(){

        int[] allData = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value : allData) {
            if(value > greatest)
                greatest = value;
        }
        return greatest;
    }
}

