package uk.co.argon.document.backend;

import uk.co.argon.document.backend.document.DocumentType;
import uk.co.argon.document.backend.document.DocumentTypeDOCX;
import uk.co.argon.document.backend.document.DocumentTypePDF;
import uk.co.argon.document.backend.document.DocumentTypeXLSX;
import uk.co.argon.document.backend.util.PasswordUtil;

public class DocumentTypeFactory {
	public static DocumentType getDocumentEncryptor(String format) {
		switch (format.toUpperCase()) {
			case PasswordUtil.PDF:
				return new DocumentTypePDF();
	
			case PasswordUtil.DOCX:
				return new DocumentTypeDOCX();
				
			case PasswordUtil.XLSX:
				return new DocumentTypeXLSX();
			default:
				throw new IllegalArgumentException("Unexpected filetype: " + format);
		}
	}
}
