package org.prasanna.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class Readcsv1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str1="C:\\Users\\Prasanna\\workspace\\Test_app\\SamplePageobjectmodel\\src\\org\\prasanna\\res\\data.csv";
        FileReader r=new FileReader(str1);
        
		CSVReader reader=new CSVReader(r);
		String[] next;
		

		
		List<String[]> l=reader.readAll();
		Object[][] data1=new Object[l.size()][1];

		

		for(int i=0;i<l.size();i++)
		{
			String [] temp=l.get(i);
			
			for(int j=0;j<temp.length;j++)
			{
				switch (j)
				{
				case 0:data1[j][j]=temp[j];
				        break;
				case 1:data1[i][j]=temp[j];
		        break;
				case 2:data1[i][j]=temp[j];
		        break;
				case 3:data1[i][j]=temp[j];
		        break;
				case 4:data1[i][j]=temp[j];
		        break;
				}
				
			}
	}
		
		for(int i=0;i<data1.length;i++)
		{
			for(int j=0;j<1;j++)
			{
				System.out.println(data1[i][j]);
			}
		}

}
}
