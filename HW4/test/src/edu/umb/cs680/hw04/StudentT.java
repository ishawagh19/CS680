package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentT {

@Test
public void StatusOfInstateStudentisInstate() {
Student s1=Student.create_In_State_Student("Jennifer", "Boston");
assertEquals(StudentStatus.in_State, s1.get_status());
}

@Test
public void StatusOfOutstateStudentisOutState() {
Student s2=Student.create_out_State_Student("Rihana", "Colorado", 7);
assertEquals(StudentStatus.out_State, s2.get_status());
}

@Test
public void StatusOfINTLStudentisINTL() {
Student s3=Student.createintlStudent("Kiron Polard","Boston", 785, "Singapore");
assertEquals(StudentStatus.intl, s3.get_status());
}

@Test
public void tuitionForIntlStudent30000() {
Student s4=Student.createintlStudent("Nysa", "Boston", 5, "India");
assertEquals(30000, s4.get_tuition_fees());
}

@Test
public void tuitionForOutStudent20000() {
Student s4=Student.create_out_State_Student("Chandler", "NewYork", 20);
assertEquals(20000, s4.get_tuition_fees());
}

@Test
public void tuitionForInStateStudent10000() {
Student s5=Student.create_In_State_Student("Aron", "Boston");
assertEquals(10000, s5.get_tuition_fees());
}

@Test
public void InStateTuitionLessthanOutState() {
Student s6=Student.create_In_State_Student("Ira", "Boston");
float expected=10000;
assertEquals(expected, s6.get_tuition_fees());
}



@Test
public void OutStateLessIntl() {
Student s8=Student.create_out_State_Student("Mike", "Los Angeles", 7);
float expected=20000;
assertEquals(expected, s8.get_tuition_fees());
}



@Test
public void IntlStudentMoreFeeThanInState() {
Student s10=Student.createintlStudent("Sam", "Boston", 345, "Thailand");
float expected=30000;
assertEquals(expected, s10.get_tuition_fees());
}



}




