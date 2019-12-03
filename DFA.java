import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class DFA {

	 public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String s=br.readLine().toString();
		 StringTokenizer st1 = 
	             new StringTokenizer(s);
		 ArrayList<String> id=new ArrayList<>();
		 id.add("main");
		 id.add("var");
		 ArrayList<String> arth=new ArrayList<>();
		 arth.add("+");
		 arth.add("-");
		 arth.add("*");
		 arth.add("/");
		 arth.add("%");
		 ArrayList<String> logi=new ArrayList<>();
		 logi.add("||");
		 logi.add("&&");
		 logi.add("!");
		 logi.add("==");
		 ArrayList<String> data=new ArrayList<>();
		 data.add("integer");
		 data.add("float");
		 data.add("string");
		 data.add("char");
	     String pattern = "^[a-z][A-Za-z0-9]*$";
		 while(st1.hasMoreElements()) {
			String st=st1.nextToken();
			if(id.contains(st)) {
				System.out.println("<Keywords,"+st+">");
			}
			
			else if(arth.contains(st)) {
				System.out.println("<Arithmetic Operator,"+st+">");
			}
			else if(logi.contains(st)) {
				System.out.println("<Logical Operators,"+st+">");
			}
			else if(st.equals("=")) {
				System.out.println("<Assignment Operator>");
			}
			else if(st.equals("(")) {
				System.out.println("<Left Parenthesis>");
			}
			else if(st.equals(")")) {
				System.out.println("<Right Parenthesis>");
			}
			else if(st.equals("{")) {
				System.out.println("<Left Curly Braces>");
			}
			else if(st.equals("}")) {
				System.out.println("<Right Curly Braces>");
			}
			else if(st.equals("input")) {
				System.out.println("<Input Function>");
			}
			else if(st.equals("output")) {
				System.out.println("<Output Function>");

			}
			else if(data.contains(st)) {
				System.out.println("<datatypes,"+st+">");
			}
			else if(st.matches(pattern)) {
				System.out.println("<Identifiers,"+st+">");
			}
		 }
	}
}
