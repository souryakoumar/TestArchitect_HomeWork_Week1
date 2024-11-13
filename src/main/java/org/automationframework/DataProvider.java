package org.automationframework;

public class DataProvider {
    public static void connectingDataProvider(DataProviderType dataProviderType) throws IllegalAccessException {
        switch (dataProviderType){
            case DataBase:
                new DataBaseDataProvider().switchDataSource();
                break;
            case Excel:
                new ExcelDataProvider().switchDataSource();
                break;
            case Faker:
                new FakerDataProvider().switchDataSource();
                break;
            case API:
                new APIDataProvider().switchDataSource();
                break;
            case HardCoded:
                new HardCodedDataProvider().switchDataSource();
                break;
            default:
                throw new IllegalAccessException("Data Provide Type is not valid");
        }
    }
}
