package fciteaa;

import java.io.*;
import java.util.*;

/**
 *
 * @author Rawan
 */
public class FCITEAA {
    static Course[] course;
    static Instructor[] instructor;
    static Student[] student;
    static Section[] section;
    static int levelId = 0;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputFile = "infciteaa.txt";
        String outputFile = "fciteaa.txt";

        try {
            //output file
            File file = new File(outputFile);
            PrintWriter output = new PrintWriter (file);
            //

            //scan from input file
            Scanner input = new Scanner(new File(inputFile));

            while(input.hasNext()) {
                input.next();
                int nuOfCourses = input.nextInt();
                course = new Course[nuOfCourses];

                for(int i = 0; i < nuOfCourses; i++) {
                    String firstWord = input.next();

                    if(firstWord.equals("Level")) {
                        levelId = input.nextInt();
                        i--;
                        continue;
                    }

                    course[i] = new Course(firstWord,
                        input.nextInt(),
                        input.next(),
                        levelId,
                        input.nextInt(),
                        input.next(),
                        input.next());
                }
                output.println("Department Plan(Courses) Data has been Inserted\n");
                output.println("============================================================");

                input.next();
                int nuOfInstructors = input.nextInt();
                instructor = new Instructor[nuOfInstructors];

                for(int i = 0; i < nuOfInstructors; i++) {
                    instructor[i] = new Instructor(input.next(),
                        input.nextInt(),
                        input.nextInt(),
                        input.next());
                }
                output.println("Department Instructor's Data has been Inserted\n");
                output.println("============================================================");

                input.next();
                int nuOfStudents = input.nextInt();
                student = new Student[nuOfStudents + 2];

                for(int i = 0; i < nuOfStudents; i++) {
                    student[i] = new Student(input.next(),
                        input.nextInt(),
                        input.nextInt(),
                        input.nextDouble(),
                        input.nextInt());

                    input.next();
                }
                output.println("Department Students Data has been Inserted\n");
                output.println("============================================================");

                input.next();
                int nuOfSections = input.nextInt();
                section = new Section[nuOfSections];

                for(int i = 0; i < nuOfSections; i++) {
                    section[i] = new Section(input.nextInt(),
                        input.next(),
                        getCourseInfo(input.next(), input.nextInt()),
                        input.nextInt(),
                        input.next(),
                        input.next(),
                        input.next(),
                        input.next());
                }
                output.println("Department Schedule (Sections) has been Inserted\n");
                output.println("============================================================");


                input.next();
                int nuOfRegisters = input.nextInt();
                
                for(int i = 0; i < nuOfRegisters; i++) {
                    input.nextInt();
                    output.println("Student: " + student[i].memName + "   stdID: " + student[i].memId +
                            "   Total Credit Hours: " + student[i].totalCredit);
                    output.printf("%10s%15s%15s%20s%20s \r\n","SecId","SecName","Course","Time","Location");

                    for(int j = 0; j < 10; j++) {
                        int next = input.nextInt();

                        if(next == -1) {
                            break;
                        }

                        student[i].Registers(j, getSection(next));
                        output.printf("%10s%15s%10s%15s%10s%15s%10s%15s\r\n",student[i].sSchedule[j].secID, student[i].sSchedule[j].secName,
                                student[i].sSchedule[j].courseInfo.cCode, student[i].sSchedule[j].courseInfo.cNum,
                                student[i].sSchedule[j].slotForTheory, student[i].sSchedule[j].slotForLab,
                                student[i].sSchedule[j].secRoomNo, student[i].sSchedule[j].secLabNo);
                    }
                    output.println("__________________________________________________________");
                    output.println("Registration Validity Report\r\n\r\n");

                }
                
                input.next();
                int nuOfRequests = input.nextInt();
                
                for(int i = 0; i < nuOfRequests; i++) {
                    input.nextInt();
                    output.println("Instructor: " + instructor[i].memName + "   Instructor ID: " + instructor[i].memId +
                            "   Total Number Of Courses: " + instructor[i].InstSchedule.length);
                    output.printf("%10s%15s%20s%30s%20s \r\n","SecId","SecName","Course","Time","Location");

                    for(int j = 0; j < 10; j++) {
                        int next = input.nextInt();

                        if(next == -1) {
                            break;
                        }

                        instructor[i].Requests(j, getSection(next));
                        output.printf("%10s%15s%10s%15s%10s%15s%10s%15s\r\n",instructor[i].InstSchedule[j].secID,
                                instructor[i].InstSchedule[j].secName,
                                instructor[i].InstSchedule[j].courseInfo.cCode, instructor[i].InstSchedule[j].courseInfo.cNum,
                                instructor[i].InstSchedule[j].slotForTheory, instructor[i].InstSchedule[j].slotForLab,
                                instructor[i].InstSchedule[j].secRoomNo, instructor[i].InstSchedule[j].secLabNo);
                    }
                    output.println("__________________________________________________________\r\n\r\n");
                }
                output.close();

                break;
            }
        }//end try
        catch(FileNotFoundException exception) {
            System.out.println("The file is not found in this path");
        }
    }

    static Course getCourseInfo(String code, int num) {
        for(int i = 0; i < course.length; i++) {
            if(course[i].cCode.equals(code)) {
                return course[i];
            }
        }

        return null;
    }

    static Section getSection(int ID) {
        for(int i = 0; i < section.length; i++) {
            if(section[i].secID == ID) {
                return section[i];
            }
        }

        return null;
    }
        
 
    
}
