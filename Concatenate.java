

package raj;
import java.io.*;
import java.util.Scanner;
public class Concatenate {

   public static void main(String args[])throws IOException
{
	Scanner con= new Scanner(System.in); 
	File f1 = new File("C:\\Users\\RAJ\\Desktop\\raj\\Daaru Party.mp3");
	FileInputStream f2 = new FileInputStream(f1);
	FileOutputStream f3 =null;
	int ch;
	if(f1.exists()){
	System.out.println("File Length :" +f1.length());
	
	}
	System.out.println("Enter name of file ");
	String Str = con.nextLine();
	String s,str1;
       str1 = "C:\\Users\\RAJ\\Desktop\\raj\\";
	System.out.println("Enter size of files");
	int a =con.nextInt();
	int i=0, j=0;
	
	
	while((ch=f2.read())!=-1)
	{
		
		if(i%a==0){
			
			
		
			s=str1+j+Str;
			f3=new FileOutputStream(s);
			
			j++;
		}
		i++;
f3.write((char)ch);
	}
        System.out.println("File Successfully splited");
        f1.delete();
        f2.close();
        f3.close();
      
        }

}

	