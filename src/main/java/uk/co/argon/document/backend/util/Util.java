package uk.co.argon.document.backend.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Util {

	public static final String FILE_PATH = "D:/payloads/";
	
	public InputStream fileToInputStream(String filename) throws FileNotFoundException {
		return (InputStream) new FileInputStream(new File(FILE_PATH + filename));
	}
	
	public String fileToString(String filename) throws IOException {
		return Files.readString(Paths.get(FILE_PATH + filename), StandardCharsets.UTF_8);
	}
	
	public ArrayList<String> loadPayloads(String filename) throws IOException {
		return (ArrayList<String>) Files.lines(Paths.get(FILE_PATH + filename)).collect(Collectors.toList());
	}
	
	public void writeTOFile(String data, String file) throws IOException {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH + file, true))){
        	bw.write(data + "\n");
        } 
	}
}
