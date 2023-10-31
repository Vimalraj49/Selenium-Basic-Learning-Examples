package log4jExamples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jxmlConfigurator {

	private static final Logger LOG = LogManager.getLogger(Log4jxmlConfigurator.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println( "Hello World!" );
        LOG.debug("This is a debug statement");
        LOG.info("This is Info Log");
        LOG.warn("This is Warn Log");
        LOG.error("This is Error Log");
        LOG.fatal("This is Fatal Log");
		
	}

}
