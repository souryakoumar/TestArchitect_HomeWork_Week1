package org.automationframework;

import java.util.logging.Logger;

public class ExcelDataProvider implements DataFactory{
    Logger logger = Logger.getLogger(ExcelDataProvider.class.getName());
    @Override
    public void switchDataSource() {
        logger.info("DataProvider Connected to Excel");
    }
}
