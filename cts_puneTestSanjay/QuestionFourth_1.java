package com.cts.testmarch3;

import java.util.ArrayList;
import java.util.List;
public class QuestionFourth_1 {
		
		
		ArrayList<Subject> students = null;
		{	students = new ArrayList<>();
			Subject std1 = new Subject(1, "Vijay", 50, 60, 70);
			students.add(std1);
			Subject std2 = new Subject(2, "Ram", 50, 60, 70);
			students.add(std2);
			Subject std3 = new Subject(3, "Shayam", 50, 60, 70);
			students.add(std3);
				
		}
		public void addStudent(Subject student){
			students.add(student);
		}
		public List<Subject> getAllStudent() 
		{
			return students;
		}
}