package uk.co.argon.document.backend.document;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import uk.co.argon.document.backend.vo.PasswordEntry;
import uk.co.argon.common.exceptions.HttpException;


public interface DocumentType {
	public String protect(byte[] data, PasswordEntry pe, ByteArrayOutputStream out) throws HttpException, IOException;
}
