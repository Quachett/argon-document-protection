package uk.co.argon.document.backend;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import uk.co.argon.common.exceptions.HttpException;
import uk.co.argon.document.backend.util.PasswordUtil;
import uk.co.argon.document.backend.util.Util;
import uk.co.argon.document.backend.vo.PasswordEntry;

public class DocumentProtection {
	
	public static void main(String...args) throws IOException, HttpException {
		String file = passwordProtectDocIs(new Util().fileToInputStream("Lloyd.Mukwacha-CV.docx"));
		System.out.println("Encrypted File:\n" + file);
	}
	
	private static String passwordProtectDocIs(InputStream is) throws IOException, HttpException {
		return passwordProtectDoc(IOUtils.toByteArray(is), new PasswordEntry(PasswordUtil.SOURCE, PasswordUtil.OWNER,
				PasswordUtil.USER, true));
	}

	private static String passwordProtectDoc(byte[] byteArray, PasswordEntry passwordEntry) throws IOException, HttpException {
		try(ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			return DocumentTypeFactory.getDocumentEncryptor(PasswordUtil.DOCX).protect(byteArray, passwordEntry, out);
		}
	}
}
