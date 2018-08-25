package com.vg.doc.util;

import com.vg.doc.domain.ObjectMetadata;

public class PrintHelper {

	public static void logException (Exception e) {
		System.out.println(e);
	}
	
	public static void printMetadata(ObjectMetadata metadata) {
		metadata.toString();
	}
}
