package org.automationframework;

import java.util.logging.Logger;

public class FakerDataProvider implements DataFactory{
    Logger logger = Logger.getLogger(FakerDataProvider.class.getName());
    @Override
    public void switchDataSource() {
        logger.info("DataProvider Connected to Faker");
    }
}
