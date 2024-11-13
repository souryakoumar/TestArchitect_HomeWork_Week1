package org.automationframework;

import java.util.logging.Logger;

public class DataBaseDataProvider implements DataFactory{
    Logger logger = Logger.getLogger(DataBaseDataProvider.class.getName());
    @Override
    public void switchDataSource() {
        logger.info("DataProvider Connected to DataBase");
    }
}
