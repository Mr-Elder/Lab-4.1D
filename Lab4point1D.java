//Max De George Period 8 Lab4point1D

// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************

public class Lab4point1D
{
    public static void main(String[] args)
    {
	Student student1 = new Student("Mary");
	//create student2, "Mike"

	Student student2 = new Student("Mike");	

	//input grades for Mary
	
	student1.inputGrades();
	student1.getAverage();	
	
	//print average for Mary

	GetInfo.showMessage("Student 1 average:\n" + student1.getName());
	
	GetInfo.showMessage("Student 1:\n" + student1);
	
	//input grades for Mike
	
	student2.inputGrades();
	student2.getAverage();
	
	//print average for Mike

	GetInfo.showMessage("Student 2 average:\n" + student2.getName());
	
	GetInfo.showMessage("Student 2:\n" + student2);



    }
}
