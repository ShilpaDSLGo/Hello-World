package selelnium;

public class NumpyNinja {

	String courseName;
	int  courseCode;
	
	public void printInfo(String courseName){
		System.out.println(courseName);
	}
	public void printInfo(String courseName, int courseCode) {
		System.out.println(courseName+""+courseCode);
	}
	public void printInfo(int courseCode) {
		System.out.println(courseCode);
	}

public static void main(String[] args) {
	NumpyNinja n1= new NumpyNinja ();
	n1.courseName="SDET";
	n1.courseCode=100;
	
	n1.printInfo(n1.courseName, n1.courseCode);

}
}

