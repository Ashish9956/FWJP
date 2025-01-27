class Employee{
protected int id;
protected int age;
protected String name;
protected boolean isPermanent;
public static void main(String arg[]){
Employee e=new Employee();
//e.age=35.5;
//we get this error: incompatible types: possible lossy conversion from double to int e.age=35.5;
e.age=(int)35.5;
System.out.println("Successful started");
}
}
