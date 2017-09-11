import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup O=new StudentGroup(10);

	Date dt=new Date(1996,10,9);
	Student std1=new Student(20,"mani",dt,81.5);



                O.addFirst(std1);

              System.out.println(O.getStudent(0).getId());






	}

}
