/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_017 {
	public static void main(String[] args) throws IOException{
		File file = new File("t.txt");
		BitOutputStream t = new BitOutputStream(file);
		t.writeBit("010000100100001001101");
	}

}

class BitOutputStream{
	private File file;
	public BitOutputStream(File file){
		this.file = file;
	}
	
	public void writeBit(char bit) throws IOException{
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(this.file));
		output.writeObject(bit);
		output.close();
	}
	
	public void writeBit(String bit) throws IOException{
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(this.file));
		output.writeObject((String)bit);
		output.close();
	}
	
	public void close(){
		this.close();
	}
}
