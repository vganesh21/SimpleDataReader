package com.vg.tika;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import com.vg.doc.domain.ObjectMetadata;
import com.vg.doc.util.Factory;

public class TikaParser {
	
	private AutoDetectParser parser = null;

	public TikaParser() {
		super();
		this.parser = new AutoDetectParser();
	}
	
	public ObjectMetadata fileParse(String filename) throws IOException, SAXException, TikaException {
		
		File file = new File(filename);
		
		
		BodyContentHandler handler = new BodyContentHandler();
	    Metadata metadata = new Metadata();
	    FileInputStream inputstream;
	    inputstream = new FileInputStream(file);
	    ParseContext context = new ParseContext();
	    parser.parse(inputstream, handler, metadata, context);
	    
	    if(filename.endsWith("mp3")) {
	    	return Factory.createMusicMetadata(metadata, inputstream);
	    }
	    else if(filename.endsWith("pdf") || filename.endsWith("doc")) {
	    	return Factory.createDocMetadata(metadata, inputstream);
	    }
	    return null;
	}
	
}
