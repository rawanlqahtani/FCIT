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
public class Section {
    int secID , secSize ;
    String secName,  slotForTheory, slotForLab, secRoomNo, secLabNo;
    Course courseInfo;
    Instructor secInstructor;
    Student[] studentList;

    Section(int secID , String secName , Course courseInfo , int secSize , String slotForTheory ,
            String slotForLab , String secRoomNo , String secLabNo ){
       this.secID = secID ;
       this.secName = secName ;
       this.courseInfo = courseInfo ;
       this.secSize = secSize ;
       this.slotForTheory =slotForTheory;
       this.slotForLab =slotForLab;
       this.secRoomNo = secRoomNo ;
       this.secLabNo =secLabNo ;

   
        /*System.out.println("secID: " + this.secID);
        System.out.println("secName: " + this.secName);
        System.out.println("courseInfo code: " + this.courseInfo.cCode);
        System.out.println("courseInfo num: " + this.courseInfo.cNum);
        System.out.println("secSize: " + this.secSize);
        System.out.println("slotForTheory: " + this.slotForTheory);
        System.out.println("slotForLab: " + this.slotForLab);
        System.out.println("secRoomNo: " + this.secRoomNo);
        System.out.println("secLabNo: " + this.secLabNo);
        System.out.println("\r\n");  */
        
        
    }//end section constractor
    
}
