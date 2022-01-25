package core.program;

import java.io.FileReader;
import java.io.FileWriter;

public class readwriteappendfile {

	public static void main(String[] args)
	{
		char[] array = new char[60];
	       String data = "This is the data in the output file";
		    
			    try {
			      FileWriter output = new FileWriter("C:\\Users\\Nozrul\\Desktop\\note.txt");
			      FileReader input = new FileReader("C:\\Users\\Nozrul\\Desktop\\note.txt");
			      output.write(data);
		          input.read(array);
		          System.out.println("Data is written to the file.");
			      
			      System.out.println("Data in the file:");
			      System.out.println(array);
			      
			      StringBuffer str=new StringBuffer("i am the sting");
			      str.append("i am the only sting");
	              System.out.println(str);
			     
			      input.close();
			    }
			    catch(Exception e) {
			      e.getStackTrace();
			    }

	}

}

