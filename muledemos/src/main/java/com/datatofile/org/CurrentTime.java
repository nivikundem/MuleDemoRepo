package com.datatofile.org;

import java.util.*;
import java.text.*;

public class CurrentTime {
	
	public String GetCurrentTime()
	{
		Date presentDate = new Date();		
		SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		String currentDateTime = ft.format(presentDate);
		return currentDateTime;	    
	}

}
