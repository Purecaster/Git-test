package currmonth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class Program {

	public static void main(String[] args) throws IOException{
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
String str = reader.readLine().toUpperCase();
int i = 0;
for(Month month: Month.values()){
		i++;
		if (month.toString().equals(str)){
			System.out.println(str + " is " + i + " month!");
		}
	}
	}

}
