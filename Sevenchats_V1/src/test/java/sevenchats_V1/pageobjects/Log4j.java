package sevenchats_V1.pageobjects;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class Log4j {
	
	
	

	

	   /* Get actual class name to be printed on */
	   static Logger log = Logger.getLogger(Log4j.class.getName());
	   
	   public static void main(String[] args)throws IOException,SQLException{
	      log.debug("Hello this is a debug message");
	      log.info("Hello this is an info message");
	   }
	}


