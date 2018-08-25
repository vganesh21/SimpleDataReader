package com.vg.doc;

import com.vg.doc.util.PrintHelper;
import com.vg.tika.TikaParser;


public class MetadataReaderApp {
	
	public static void main (String[] args) {

	    //Parser method parameters
	    
		try {
			String filename = "C://Varun//Data//filePDF.pdf";
			if (args.length >= 1) {
				filename = args[0];
			}
			TikaParser tp = new TikaParser();
			System.out.println(tp.fileParse(filename).toString());
			
			
			
			
		} catch (Exception e) {
			PrintHelper.logException(e);
		}
	    
	}
	
	
}
