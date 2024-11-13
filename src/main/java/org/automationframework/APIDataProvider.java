package org.automationframework;

import java.util.logging.Logger;

public class APIDataProvider implements DataFactory{
    Logger logger = Logger.getLogger(APIDataProvider.class.getName());
    @Override
    public void switchDataSource() {
        logger.info("DataProvider Connected to API");
    }
}
