package uk.co.argon.document.backend.document;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.hc.client5.http.utils.Base64;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.ProtectionType;

import uk.co.argon.document.backend.util.Util;
import uk.co.argon.document.backend.vo.PasswordEntry;
import uk.co.argon.common.encryption.EncryptionUtil;
import uk.co.argon.common.exceptions.HttpException;

public class DocumentTypeDOCX implements DocumentType {

	@Override
	public String protect(byte[] data, PasswordEntry pe, ByteArrayOutputStream out) throws HttpException,IOException {
		EncryptionUtil eu = new EncryptionUtil();
		
		String userPw = (pe.isEncrypted())? eu.decrypt(pe.getUserPassword()): pe.getUserPassword();
		//String ownerPw = (pe.isEncrypted())? eu.decrypt(pe.getOwnerPassword()): pe.getOwnerPassword();
		Document doc = new Document(new ByteArrayInputStream(data));
		doc.encrypt(userPw);
		doc.protect(ProtectionType.Allow_Only_Reading);
		doc.saveToStream(out, FileFormat.Auto);
		doc.saveToFile(Util.FILE_PATH + "popia/potected.docx");

		return Base64.encodeBase64String(out.toByteArray());
	}
}
