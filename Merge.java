

package raj;
import java.util.Scanner;
import java.io.*;

public class Merge extends Concatenate {
    public static void main(String args[])throws IOException
    {
        Concatenate r = new Concatenate();
        Scanner con= new Scanner(System.in); 
     File f6 =new File("C:\\Users\\RAJ\\Desktop\\raj\\shekhawat.mp3");
        FileOutputStream f4 = new FileOutputStream(f6);
           
 int j=0;
 System.out.println("Enter name of file to store ");
	String Str = con.nextLine();
        String s,str1;
       str1 = "C:\\Users\\RAJ\\Desktop\\raj\\";
	int ch1;
	
     
	while(f6.exists()){
		s=str1+j+Str;
		
		
		FileInputStream f5 = new  FileInputStream(s);
                
	
	while((ch1=f5.read())!=-1){
		f4.write(ch1);
              
	}
	j++;
             
                
        f5.close();
                
	}System.out.println("Now merging Files");

}

}

 