
import java.io.*;
public class CSX_351_HW2 {
	public static void main(String[]args)
	{
		try{
		FileReader fr1=new FileReader("C:\\JAVA LAB\\HW2\\HW2-dictionary.txt");
		BufferedReader dr=new BufferedReader(fr1);
		FileReader fr2=new FileReader("C:\\JAVA LAB\\HW2\\HW2-keywords.txt");
		BufferedReader kr=new BufferedReader(fr2);
		File f1=new File("C:\\JAVA LAB\\HW2\\HW2-report.txt");
		f1.createNewFile();
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		String[]arr=new String[16000];
                           String[] arr1=new String[84];
		String s,temp,temp1;
		int i=0,j=0;
		while((s=dr.readLine())!=null)        // dictionary array
		{arr[i++]=s;
		        }
		
		i=0;
		while((s=kr.readLine())!=null)
		{
	          arr1[i++]=s;
		}
		
		for(i=0;i<arr.length;i++)     //bubble sort dictionary
		{
		   for(j=0;j<arr.length-i-1;j++)
		   {
			   if((arr[j].compareTo(arr[j+1]))>0)
			   {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
			   
		   }
		}
		   for(i=0; i<arr1.length;i++)     //bubble sort keyword
			{
			 
			   for(j=0; j<arr1.length-i-1;j++)
			   {
				  
				   if((arr1[j].compareTo(arr1[j+1]))>0)
				   {
					   temp1=arr1[j];
					   arr1[j]=arr1[j+1];
					   arr1[j+1]=temp1;
				   }
				   
			   }
		}
		   
		   int count=0;
				   j=0;
		   for(i=0;i<arr1.length;i++)   // matching words
		   {
			   int comp=0;
			   for(j=0;(j<arr.length) && ((arr1[i].compareTo(arr[j]))>=0);j++)
			       { 
				   
				   if((arr1[i].compareTo(arr[j]))==0)
			               comp=1;
				        
				   }
			   if(comp==0){
	                                       bw.append("keyword not found:"+arr1[i]);
			             count++;
bw.newLine();
			   }
 }
		   bw.append("Number of keywords not found ="+ String.valueOf(count));
	              dr.close();
		kr.close();
		bw.close();
		}
		catch(IOException e){
		}}
		}
	
