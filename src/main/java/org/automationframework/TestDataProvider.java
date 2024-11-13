package org.automationframework;

public class TestDataProvider {
    public static void main(String[] args) throws IllegalAccessException {
        DataProvider.connectingDataProvider(DataProviderType.DataBase);
        DataProvider.connectingDataProvider(DataProviderType.Excel);
        DataProvider.connectingDataProvider(DataProviderType.Faker);
        DataProvider.connectingDataProvider(DataProviderType.API);
        DataProvider.connectingDataProvider(DataProviderType.HardCoded);
    }
}
