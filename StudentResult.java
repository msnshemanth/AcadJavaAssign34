
package student.result;


public class StudentResult {

  
    public static void main(String[] args) {
        
        FirstSemester std1 = new FirstSemester("Hemanth", 1, 250);
        std1.setMarks(60,70);
        //System.out.println("\nEnter First Semester Student's Info:");
        std1.getSubject();
        std1.showResult();
                
        SecondSemester std2 = new SecondSemester("Krishna", 2, 249);
        std2.setMarks(70,80);
        //System.out.println("\n\nEnter Second Semester Student's Info:");
        std2.getSubject();
        std2.showResult();
        
        ThirdSemester std3 = new ThirdSemester("Dilip", 3, 248);
        std3.setMarks(69,79);
        //System.out.println("\n\nEnter Third Semester Student's Info:");
        std3.getSubject();
        std3.showResult();
    }
}
