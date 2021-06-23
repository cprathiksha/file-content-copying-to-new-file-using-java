
import java.io.*; import java.util.Scanner;
class copyfile
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String dest,str;
		int c;
		try
		{
				FileReader file1=new FileReader("test.txt");
				System.out.println("Enter Destination file name to copy the contents :");
				dest=sc.next();
				FileWriter file2=new FileWriter(dest+".txt");
				while((c=file1.read())!=-1)
				{
					file2.write(c);
				}
				System.out.println("Content copied to "+(dest+".txt")+" file");
				file1.close();
				file2.close();
				
		}catch(IOException e){
			System.out.println("File io exception occured");
		}
	}
}