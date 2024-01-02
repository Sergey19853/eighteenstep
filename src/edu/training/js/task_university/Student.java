package edu.training.js.task_university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends UniversityMember implements Research {
	
	private int averageScore;
	private List<String> courseList = new ArrayList<String>();
	

	public Student(String name, int id, String email, int averageScore) {
		super(name, id, email);
		this.averageScore = averageScore;
	}
	
	public int getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}

	public List<String> getCourseList() {
		return courseList;
	}

	public void addCourse(String courseName) {
		courseList.add(courseName);
	}

	@Override
	public void conductResearch() {
		 System.out.println("research");
	}

	@Override
	public void displayDetails() {
		System.out.println(toString());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return averageScore == student.averageScore && Objects.equals(courseList, student.courseList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(averageScore, courseList);
	}

	@Override
	public String toString() {
		return "Student [averageScore=" + averageScore + ", courseList=" + courseList + ", toString()="
				+ super.toString() + "]";
	}

	
}
