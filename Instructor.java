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
public class Instructor extends FCITMember {
    String InstQualification;
    Section[] InstSchedule;
   
    Instructor(String memName , int memId , int memStartingYear, String InstQualification  ) {
        this.memId = memId;
        this.memName = memName;
        this.memStartingYear = memStartingYear;
         this.InstQualification = InstQualification ;
         this.InstSchedule = new Section[2];

        /* System.out.println("Id: " + this.memId);
        System.out.println("Name: " + this.memName);
        System.out.println("Year: " + this.memStartingYear);
        System.out.println("Qual: " + this.InstQualification);
        System.out.println("\r\n");*/
    }
    
    public void Requests(int index, Section section) {
        this.InstSchedule[index] = section;
        /*System.out.println("sectionId: " + this.InstSchedule[index].secID);
        System.out.println("sectionName: " + this.InstSchedule[index].secName);*/
    }

}
