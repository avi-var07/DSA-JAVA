// Single File Programming Question
// PROBLEM STATEMENT



// Janice, the principal of a reputed school, wants to register students for a competition. She needs to maintain records of student's personal details, such as their name, age, and grade level.

// Write a program with the following requirements:

// Create a base class SchoolMember that holds common attributes like name and age.
// Create a derived class Student that extends SchoolMember and adds the attribute gradeLevel.
// The program should take user input for name, age, and gradeLevel to register a student, and then display these details.
// Input format :
// The first line of input contains a string, that represents the name of the student.

// The second line of input contains an integer input that represents the age of the student

// The last line of the input contains an integer that represents the grade level of the student.

// Output format :
// The output should display as:

// "Student: <<name>>, Age:<<number>>, Grade Level: <<grade>>".



// Refer to the sample test cases for formatting Specifications.

// Code constraints :
// The inputs should be greater than zero.

// 0 < Age ≤ 150

// 0 < Grade Level ≤ 12

// Sample test cases :
// Input 1 :
// Choza
// 15
// 3
// Output 1 :
// Student: Choza, Age: 15, Grade Level: 3
// Input 2 :
// Sriman
// 18
// 4
// Output 2 :
// Student: Sriman, Age: 18, Grade Level: 4


import java.util.Scanner;

class SchoolMember {
    private String name;
    private int age;
    

    public SchoolMember(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}


class Student extends SchoolMember {
    private int gradeLevel;
    

    public Student(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }
    

    public int getGradeLevel() {
        return gradeLevel;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int gradeLevel = scanner.nextInt();
        
        Student student = new Student(name, age, gradeLevel);
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", Grade Level: " + student.getGradeLevel());
        
        scanner.close();
    }
}
