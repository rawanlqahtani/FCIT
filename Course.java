/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fciteaa;

public class Course {
    String cName, cCode;
    int cNum , cLevel  , cCredit;
    boolean hasTheory , hasLab;

    public Course(String cCode, int cNum, String cName, int cLevel, int cCredit, String hasTheory, String hasLab){
        this.cCode = cCode;
        this.cNum = cNum;
        this.cName = cName;
        this.cLevel = cLevel;
        this.cCredit = cCredit;
        if(hasTheory.equals("theory")) this.hasTheory = true;
        else this.hasTheory = false;

        if(hasLab.equals("lab")) this.hasLab = true;
        else this.hasLab = false;
        
        /*System.out.println("Code: " + this.cCode);
        System.out.println("Num: " + this.cNum);
        System.out.println("Name: " + this.cName);
        System.out.println("Level: " + this.cLevel);
        System.out.println("Credit: " + this.cCredit);
        System.out.println("Theory: " + this.hasTheory);
        System.out.println("Lab: " + this.hasLab);
        System.out.println("\r\n");*/
    }
}
