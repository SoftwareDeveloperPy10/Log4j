package App;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestAppl {

	//every class has to be one logger object
	private static Logger log = Logger.getLogger(TestAppl.class);
	
	public static void main(String[] args) throws IOException {
		//1. Create Layout
		Layout layout = new PatternLayout("%p %d %C %M %m %n");
		//2. Create Appender + link Layout
		//Appender app = new ConsoleAppender(layout);
		Appender app = new FileAppender(layout,"C:\\wamp64\\www\\Log4JTutorial\\logs\\data.log");
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
