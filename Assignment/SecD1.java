/**
 * 1.Create a Student class to simulate a student's profile. 
 * The class should have the following attributes: student ID, name, and GPA. Include methods to updateGPA() and printProfile().
 *  Implement functionality to create new student profiles, update GPAs, and print student profiles.
 */
public class SecD1{
    public static void main(String[] args){
        
        Student st= new Student();
        st.id=2;
        st.name="I";
        st.gpa=3.30;
        st.updateGPA(4.00);
        st.printProfile();
    }
}
class Student{
    int id;
    String name;
    double gpa;
    public void updateGPA(double gpa){
        this.gpa=gpa;
    }
    public void printProfile(){
        System.out.println("ID:" +id+"\nName:"+name+"\nGPA:"+gpa);
    }
}