package reflection.BasicLevelProblems;

class Student {
    public Student() {
        System.out.println("Student object created!");
    }
}
public class DynamicallyCreateObjectusingReflection {

	    public static void main(String[] args) throws Exception {

	        Class<?> cls = Class.forName("Student");

	        Object obj = cls.getDeclaredConstructor().newInstance();

	        System.out.println("Object Type: " + obj.getClass().getName());
	    }
	}

