package uk.co.argon.document.backend.util;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;

public class PasswordUtil {
	public static final String SOURCE = "SOURCE";
	public static final String SYNAPSE = "SYNAPSE";
	public static final String USER = "VT0ziOpk0N4vfygD/zCn0g==";
	public static final String USER_PASSWORD = "USER_PASSWORD";
	public static final String OWNER = "3i2tJSSS2lfHatikBM1QTQ==";
	public static final String OWNER_PASSWORD = "OWNER_PASSWORD";
	public static final String PAYLOAD_NULL = "{\"error\": \"payload must not be null\"}";
	public static final String SOURCE_NULL = "{\"error\": \"Source parameter must not be null\"}";
	public static final String DELETED = "{\"message\": \"Source deleted Successfully\"}";
	public static final String NOT_DELETED = "{\"error\": \"Source not deleted\"}";
	public static final String UPDATED = "{\"message\": \"Records updated Successfully\"}";
	public static final String NOT_UPDATED = "{\"message\": \"Records not updated\"}";
	public static final String NO_CONTENT = "{\"message\": \"Content not found\"}";
	public static final String MAIL_SENT = "{\"message\": \"Email sent, please check your inbox\"}";
	public static final String MAIL_SENT_FAIL = "Failed to send email with error: ";
	public static final String PROTECTION_FAIL = "Failed to protect: ";
	public static final String WITH_ERROR = " file with error: ";
	public static final String DO_NOT_REPLY = "noreply@ominsure.co.za";
	public static final String DOT = ".";
	public static final String PDF = "PDF";
	public static final String DOCX = "DOCX";
	public static final String XLSX = "XLSX";
	public static final boolean MASK = true;

    public static String getLineOfQs(int num) {
        return Joiner.on(", ").join(Iterables.limit(Iterables.cycle("?"), num));
    }
}
