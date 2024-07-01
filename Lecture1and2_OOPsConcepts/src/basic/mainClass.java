package basic;

public class mainClass {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.age=23;
		p1.name="Piju";
		System.out.println(p1.age+" "+p1.name);

	}

}
class Person{
    String name;
    int age;
}