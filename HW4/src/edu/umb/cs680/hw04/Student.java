package edu.umb.cs680.hw04;

enum StudentStatus{
	in_State,out_State,intl;
}

public class Student {
	
	private float tuition;
	private String Student_name,US_Add,foreign_add;
	private int I20num,yrsinState;
	private StudentStatus status;
	
	private Student(String Student_name,String US_Add,String foreign_add,int I20num,int yrsinState,StudentStatus status)
	{
		this.Student_name=Student_name;
		this.US_Add=US_Add;
		this.foreign_add=foreign_add;
		this.I20num=I20num;
		this.yrsinState=yrsinState;
		this.status=status;
	}
	
	public static Student create_In_State_Student(String Student_name,String US_Add) {
		return new Student(Student_name,US_Add,null,-1,-1,StudentStatus.in_State);
	}
	
	public static Student create_out_State_Student(String Student_name,String US_Add,int yrsinState)
	{
		return new Student(Student_name,US_Add,null,-1,yrsinState,StudentStatus.out_State);
	}
	
	public static Student createintlStudent(String Student_name,String US_Add,int I20num,String foreign_add) {
		return new Student(Student_name,US_Add,foreign_add,I20num,-1,StudentStatus.intl);
	}
	
	public float get_tuition_fees() {
		if(this.status==StudentStatus.in_State)
		{
			this.tuition=10000;
			return tuition;
		}
		
		else if(this.status==StudentStatus.out_State)
		{
			this.tuition=20000;
			return tuition;
		}
		
		else
		{
			this.tuition=30000;
			return tuition;
		}
	}
	
	public String get_Student_name() {
		return this.Student_name;
	}
	
	public String getUS_Add() {
		return this.US_Add;
	}
	
	public String get_foreign_add() {
		return this.foreign_add;
	}
	
	public int getI20num() {
		return this.I20num;
	}
	
	public int getyrsinState() {
		return this.yrsinState;
	}
	
	public StudentStatus get_status() {
		return this.status;
	}
	
	public static void main(String args[]) {
		Student in_State_Student=create_In_State_Student("Rachel Green", "Boston");
		System.out.println("Student name-"+in_State_Student.get_Student_name()+"US Address"+in_State_Student.getUS_Add()+"Tuition:"+in_State_Student.get_tuition_fees());
		
		Student out_State_Student=create_out_State_Student("Anna", "New York", 9);
		System.out.println("Student name-"+out_State_Student.get_Student_name()+"US Address"+out_State_Student.getUS_Add()+"Years in State-"+out_State_Student.getyrsinState()+"Tuition"+out_State_Student.get_tuition_fees());
		
		Student int_Student=createintlStudent("Aisha", "Boston", 526, "Turkey");
		System.out.println("Student name-"+int_Student.get_Student_name()+"US Address"+int_Student.getUS_Add()+"I20 Number"+int_Student.getI20num()+"fees"+int_Student.get_tuition_fees());
		
	}

}
