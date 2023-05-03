package shak;

public class Main {

	public static void main(String[] args) {
			
		Course course = new Course();
		course.setCourseName("Software Construction");
				
		System.out.println(course.getCourseName());
		
		course.setCourseName("Программ хангамжийн бүтээлт");
		System.out.println(course.getCourseName());
	}

}
