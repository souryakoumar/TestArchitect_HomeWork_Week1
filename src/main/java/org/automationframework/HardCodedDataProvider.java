package org.automationframework;

import java.util.logging.Logger;

public class HardCodedDataProvider implements DataFactory{
    Logger logger = Logger.getLogger(HardCodedDataProvider.class.getName());
    @Override
    public void switchDataSource() {
        logger.info("DataProvider Connected to Hardcoded");
    }
}
