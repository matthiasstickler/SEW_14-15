/**
 * 
 */
package stickler;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Matthias
 *
 */
public class UppercaseInputStream  extends FilterInputStream{

	/**
	 * 
	 */
	public UppercaseInputStream(InputStream in) {
		super(in);
	}
	public int read() throws IOException{
		int c  = super.read();
		return(c == -1 ? c : Character.toUpperCase((char)c));
	}
	public int read(byte[] b, int off, int len)throws IOException{
		int result = super.read(b, off, len);
		for(int i = off; i<off+result; i++){
			b[i] = (byte)Character.toUpperCase((char)b[i]);
		}
		return result;
	}
}
