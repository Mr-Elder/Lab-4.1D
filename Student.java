// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and print student's name.
// ****************************************************************

public class Student
{
    //declare instance data 


	String name;	
	String Message;
	
	double testscore1;
	double testscore2;
	double average;	

	boolean repeat;

    //constructor
    public Student(String studentName)
    {
	//add body of constructor
    name = studentName;
    
    }

    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
public void inputGrades()
{
	//add body of inputGrades
    
    do
    {
    
    
    testscore1 = GetInfo.getInt("Please enter " + name + "'s score valid for test 1:\t");
	
		if (testscore1 < 0 || testscore1 > 100)
		{
			repeat = true;
		}
		else
		{
			repeat = false;
		}	
    
    }
    while(repeat);
		    
    do
    {
   
   	testscore2 = GetInfo.getInt("Please enter " + name + "'s valid score for test 2:\t");
    
    	if (testscore2 < 0 || testscore2 > 100)
    	{
    		repeat = true;
   	 	}
   	 	else
    	{
    		repeat = false;
    	}
    
    }
    while (repeat);
    
}

    //getAverage: compute and return the student's test average
    //add header for getAverage
    
    public double getAverage()

    {
	//add body of getAverage
    
    average = (testscore1 + testscore2) / 2;
    
    return average;
    
    }

    //printName: print the student's name
	//add header for printName

	public void printName()

    {
	//add body of printName
    
    System.out.println("The average for " + name + " is " + average);
    
    }
    
    public String getName()
    
    {
    
    Message = ("The average for " + name + " is " + average);
    
    return Message;
    	
    }
    
    public String toString()
    	
    {
    	String name1 = ("Name:  " + name + "     ");
    	
    	String grade1 = ("Test 1:  " + testscore1 + "     ");
    	
    	String grade2 = ("Test 2:  " + testscore2);
    	
    	String all = (name1 + grade1 + grade2);
    	
    	return all;
    	
    }	


}
