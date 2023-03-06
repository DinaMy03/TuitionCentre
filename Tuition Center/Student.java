public class Student {
    // data/attributes
    public Name name;
    private String ic;
    private String address;
    private String schoolName;
    float marks[] = new float[5];
    float average = 0;
    
    public Student(String ic,String address, String schoolname){
        this.ic = ic;
        this.address = address;
        this.schoolName = schoolname;
    }
    // methods or operations
    public void setName(Name thename) {  //avoid direct access
        name = thename;
    }
    
    public void setMarks(float mark, int i) throws Exception {
        if (mark>=0 && mark<=100){
            marks[i] = mark;
        }
        if (mark < 0){
            throw new Exception("Error in marks detected");     //potentially risky
        }

        if (i > 5){
            throw new Exception("Error in index detected");
        }
    }
    public float calcAvg() {
        float total = 0;
        for(int i = 0; i < 5; i++){
            total += marks[i];
        }
        average = total / 5;
        return average;
    }

    public float calcMin() {
        float lowest = 999;
        for(int i = 0; i < 5; i++){
            if (marks[i] < lowest){
                lowest = marks[i];
            }
        }
        return lowest;
    }
    public float calcMax() {
        float highest = 0;
        for(int i = 0; i < 5; i++){
            if (marks[i] > highest){
                highest = marks[i];
            }
        }
        return highest;
    }
/*
    public static void main(String args[]) {
        Student stud0 = new Student();

        try {           //something can cause exception
            stud0.setMarks(10, 0);
            stud0.setMarks(-10, 0);

        } catch(Exception ex) {      //catch block....action to be taken in case of exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }

        try {           //something can cause exception
            stud0.setMarks(20, 6);

        } catch(Exception except) {      //catch block....action to be taken in case of exception
            System.out.println("Cannot continue");
            except.printStackTrace();
        }

        stud0.displayMarks();
    }
 */
}