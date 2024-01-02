package edu.training.js.task_university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends UniversityMember implements Research{
	
    private String department;
    private List<String> coursesTeaching = new ArrayList<String>();

    public Faculty(String name, int id, String email, String department) {
        super(name, id, email);
        this.department = department;
    }
        
    public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<String> getCoursesTeaching() {
		return coursesTeaching;
	}

	public void addCourse(String assignCourse) {
        coursesTeaching.add(assignCourse);
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(coursesTeaching, department);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		return Objects.equals(coursesTeaching, other.coursesTeaching) && Objects.equals(department, other.department);
	}

	@Override
	public String toString() {
		return "Faculty [department=" + department + ", coursesTeaching=" + coursesTeaching + ", toString()="
				+ super.toString() + "]";
	}
    
    
    
}
