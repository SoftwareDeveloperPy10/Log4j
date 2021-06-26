package App;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class TestAppl {

	//every class has to be one logger object
	private static Logger log = Logger.getLogger(TestAppl.class);
	
	public static void main(String[] args) {
		//1. Create Layout
		Layout layout = new SimpleLayout();
		//2. Create Appender + link Layout
		Appender app = new ConsoleAppender(layout);
		//3 Link appender with logger
		log.addAppender(app);
		
		
		//  Print Messages
		log.info("FROM INFO");
		log.debug("FROM DEBUG");
		log.fatal("FROM FATAL");
		log.error("FROM ERROR");
		log.warn("FROM WARN");
		
		
	}
	
	
}
