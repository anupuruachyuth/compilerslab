import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class DFA1 {

	 public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String s=br.readLine().toString();
		 StringTokenizer st1 = 
	             new StringTokenizer(s);
	     String pattern = "^[a-z][A-Za-z0-9]*$";
		 while(st1.hasMoreElements()) {
			String st=st1.nextToken();
			if(st.matches("main|var")) {
				System.out.println("<Keywords,"+st+">");
			}
			
			else if(st.matches("[+|-|*|/|%]")) {
				System.out.println("<Arithmetic Operator,"+st+">");
			}
		
			else if(st.matches("^[=]$")) {
				System.out.println("<Assignment Operator>");
			}
			else if(st.matches("^[(]$")) {
				System.out.println("<Left Parenthesis>");
			}
			else if(st.matches("^[)]$")) {
				System.out.println("<Right Parenthesis>");
			}
			else if(st.matches("^[{]$")) {
				System.out.println("<Left Curly Braces>");
			}
			else if(st.matches("^[}]$")) {
				System.out.println("<Right Curly Braces>");
			}
			else if(st.matches("input")) {
				System.out.println("<Input Function>");
			}
			else if(st.matches("output")) {
				System.out.println("<Output Function>");

			}
			else if(st.matches("integer|float|char|string")) {
				System.out.println("<datatypes,"+st+">");
			}
			else if(st.matches(pattern)) {
				System.out.println("<Identifiers,"+st+">");
			}
		 }
	}
}
