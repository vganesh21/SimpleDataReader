package com.vg.doc.util;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;

import com.vg.doc.domain.DocMetadata;
import com.vg.doc.domain.MusicMetadata;

public class Factory {
	public static MusicMetadata createMusicMetadata (Metadata metadata, FileInputStream inputstream) {
		
		String str = metadata.getValues(metadata.names()[5])[0];
	    String createBy = metadata.getValues(metadata.names()[2])[0];
	    String album = metadata.getValues(metadata.names()[3])[0];
	    String title = metadata.getValues(metadata.names()[11])[0];
		MusicMetadata musics = new MusicMetadata(createBy, str, str, createBy, album, title);
		return musics;
	}
	public static DocMetadata createDocMetadata (Metadata metadata, FileInputStream inputstream) throws IOException {
		
		Tika checker = new Tika();
		String fileType = "";
		String extensionType = "";
		fileType = checker.detect(inputstream, metadata);
	    if(fileType.length() >= 3) {
	    	extensionType = fileType.substring(fileType.length()-3);
	    }
		String str = metadata.getValues(metadata.names()[7])[0];
	    String modifyDate = metadata.getValues(metadata.names()[8])[0];
	    
		DocMetadata docs = new DocMetadata(metadata.getValues(metadata.names()[5])[0], str, modifyDate, null, extensionType);
		return docs;
	}
}
