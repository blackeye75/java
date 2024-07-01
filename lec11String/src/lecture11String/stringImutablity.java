package lecture11String;

public class stringImutablity {

	public static void main(String[] args) {
		 String str="abc";
	      String str1="abc";
	      String str2=new String("abc");
	      str="xyz";
	      str1=str1+"def";
	      
	      String str3="abc";
	      System.out.println(str1);

	}

}
