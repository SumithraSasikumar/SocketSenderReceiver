import java.security.SecureRandom;
import java.util.Base64;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class cc {

	public static void main(String[] args) {
		final SecureRandom secureRandom = new SecureRandom(); //threadsafe
		final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe

			
		    byte[] randomBytes = new byte[24];
		    secureRandom.nextBytes(randomBytes);
		    System.out.println(base64Encoder.encodeToString(randomBytes));
	
		//	return base64Encoder.encodeToString(randomBytes);

		    long longToken = Math.abs( secureRandom.nextLong() );
		    String random = Long.toString( longToken,16);
		    System.out.println(random  + "   " +"generation");
		    
		    String password="nova";
		   String bcryptPassword="$2a$10$AfWeU9JnF2iP.PX3UdJ9I.fFPBVBHoTNVolPSBp67.LPzDB1T/tYu";
		    
		    BCryptPasswordEncoder b = new BCryptPasswordEncoder();
		   System.out.println(b.matches(password, bcryptPassword));
		   
	}

}

