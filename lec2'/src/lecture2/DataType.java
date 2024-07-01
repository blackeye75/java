package lecture2;

import java.security.PublicKey;

public class DataType {

	public static void main(String[] args){
//		char j='A';
//		System.out.println('b'+3);   //98 +3
//		int i='c'+3;
//		System.out.println(i);  99+3=102
//		
//		int i =a;
//		System.out.println(i);    97 ascii value
		char c='a';
		int i= c + 10;
//        char abc = i;   cant put int (4 byte) value to char (2 byte) value.
		i=c;
		long l=i;
//		i=l; not possible cant put long(8byte) to int(4 byte).
//		System.out.pritln(l);
		double d=i;
//		i=d; not possible
//		float f=1.23;    //cannot convert from double to float
		float f=1.23f;    //typ casting.
	}

}
