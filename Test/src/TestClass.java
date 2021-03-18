



	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class TestClass {


		public static void main(String[] args)throws IOException 
		{
			File f=new File("text.txt");
			if(!f.exists())
			{
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			FileWriter fw1;
			BufferedWriter writer2;
			
				fw1 = new FileWriter(f);
			
			writer2=new BufferedWriter(fw1);
			System.out.println("Enter the text");
			Scanner sc1=new Scanner(System.in);
			String text1=sc1.nextLine();
			writer2.write(text1);
			writer2.newLine();
			writer2.close();
			fw1.close();
			sc1.close();
			System.out.println("Your input is saved");
			
			
	}
	}

