/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fciteaa;

/**
 *
 * @author HP
 */
public class Student extends FCITMember {
    double sGPA;
    int totalCredit;
    Section[] sSchedule;
    int sTotalCourses;

    Student(String memName , int memId , int memStartingYear, double sGPA , int totalCredit){
        this.memId = memId;
        this.memName = memName;
        this.memStartingYear = memStartingYear;
        this.sGPA = sGPA;
        this.totalCredit = totalCredit;
        this.sSchedule = new Section[10];

        /*System.out.println("Id: " + this.memId);
        System.out.println("Name: " + this.memName);
        System.out.println("Year: " + this.memStartingYear);
        System.out.println("GPA: " + this.sGPA);
        System.out.println("Credit: " + this.totalCredit);
        System.out.println("\r\n");*/
    }
    
    public void Registers(int index, Section section) {
        this.sSchedule[index] = section;
        /*System.out.println("sectionId: " + this.sSchedule[index].secID);
        System.out.println("sectionName: " + this.sSchedule[index].secName);*/
    }
}
