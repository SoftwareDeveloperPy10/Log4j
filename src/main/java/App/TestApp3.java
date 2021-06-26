package App;


import org.apache.log4j.Logger;


public class TestApp3 {
	
	private static Logger log = Logger.getLogger(TestApp3.class);
	
	public static void main(String[] args) {

		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERR");
		log.fatal("FATAL");
	}
	
}
