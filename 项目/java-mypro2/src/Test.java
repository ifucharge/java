import com.lzx.data.Student;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		Student ste=new Student();
		System.out.println(ste.getClass().getName());
		System.out.println(ste.getClass().getSuperclass());
		System.out.println(ste.getClass().getFields());
		System.out.println(Student.class.getName());
		Class cc=Class.forName("com.lzx.data.Student");
		
	}
			

}
