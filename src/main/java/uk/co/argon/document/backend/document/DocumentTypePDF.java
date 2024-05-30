package uk.co.argon.document.backend.document;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import uk.co.argon.common.exceptions.HttpException;
import uk.co.argon.document.backend.vo.PasswordEntry;

public class DocumentTypePDF  implements DocumentType {

	@Override
	public String protect(byte[] data, PasswordEntry pe, ByteArrayOutputStream out) throws HttpException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
