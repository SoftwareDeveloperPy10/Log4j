package App;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class TestApp2 {
	
	private static Logger log =Logger.getLogger(TestApp2.class);
	
	public static void main(String[] args) {
		
		Layout layout = new PatternLayout("%d{yyyy/MMM/dd hh:mm:ss} [%C - %M - LineNumber:%L- %l  -  %m] %n");
		
		Appender app = new ConsoleAppender(layout);
		
		log.addAppender(app);
		
		log.debug("HELLO ONE");
		log.info("HELLO two");
		log.warn("HELLO ABC");
		log.error("HELLO XYZ");
		log.fatal("HELLO MNO");
		
		
	}
	
}
