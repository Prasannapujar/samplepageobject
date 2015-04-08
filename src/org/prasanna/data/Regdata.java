package org.prasanna.data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class Regdata {
	String firstname;
	String lastname;
	String username;
	String password;
	String coinfirmpassword;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCoinfirmpassword() {
		return coinfirmpassword;
	}

	public void setCoinfirmpassword(String coinfirmpassword) {
		this.coinfirmpassword = coinfirmpassword;
	}

	@DataProvider(name = "regdata")
	public static Object[][] givesdata() {
		Regdata d1 = new Regdata();
		d1.setFirstname("prasanna");
		d1.setLastname("pujar");
		d1.setUsername("pup1kor");
		d1.setPassword("123");
		d1.setCoinfirmpassword("123");

		Regdata d2 = new Regdata();
		d2.setFirstname("Mabba");
		d2.setLastname("Gouda");
		d2.setUsername("iammabba");
		d2.setPassword("kehoo");
		d2.setCoinfirmpassword("kheeoo");

		return new Regdata[][] { { d1 }, { d2 } };

	}
/**
 * this is reading CSV file
 * @return
 * @throws IOException
 */
	@DataProvider(name = "readcsv")
	public static Object[][] fromcsv() throws IOException {
		String str1 = "C:\\Users\\Prasanna\\workspace\\Test_app\\SamplePageobjectmodel\\src\\org\\prasanna\\res\\data.csv";
		FileReader r = new FileReader(str1); //create fileraeder
		CSVReader reader = new CSVReader(r); //pass it to csvreader
		List<String[]> l = reader.readAll(); // gets on line as string[] and put's it into list 
		Regdata[][] data1 = new Regdata[l.size()][1]; // created [size][1] coloumn 

		for (int i = 0; i < l.size(); i++) { // goes through the rows 
			String[] temp = l.get(i);

			for (int j = 0; j < temp.length; j++) { // gets the string[] arrays and runs through the all items 
				System.out.println(i + "--" + j + temp[j]);
				if (j == 0) {                      // when enter to the new row create the elemensts and assign
					Regdata d = new Regdata();
					data1[i][0] = d;
				}
				switch (j) { //copies the corresoping values to the object
				case 0:
					data1[i][0].firstname = temp[j];
					break;
				case 1:
					data1[i][0].lastname = temp[j];
					break;
				case 2:
					data1[i][0].username = temp[j];
					break;
				case 3:
					data1[i][0].password = temp[j];
					break;
				case 4:
					data1[i][0].coinfirmpassword = temp[j];
					break;
				}

			}
		}

		return data1; //returns the object

	}

}
