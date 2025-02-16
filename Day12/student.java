package Day12;

public class student {
    private int rollno;
    private String name;
    private int age;
    private float salary;
    
	public student(int rollno, String name, int age, float salary) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("initializing parameter constructor");
	}
   
	public student() {
		System.out.println("initializing default constructor");
	}
	

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
