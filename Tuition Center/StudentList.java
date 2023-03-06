import java.lang.constant.Constable;

/*
What is a StudentList?
A StudentList is a list of students registered in a batch
"List of students" = array of students
*/
public class StudentList {
    //data attributes
    private Student list[] = new Student[2];
    private int currentSz = 0;
    
    //methods or operations
    //add a student into a list
    public void add(Student students){
        list[currentSz++] = students;
    }
    public String getName(int i){
        return list[i].name.getfname();
    }
    //find a particular student
    public String find(String name){
        //loop through the array of students
        String result = null;
        for(int i = 0; i < currentSz; i++){
            if(list[i].name.getfname() == name){
                result = "true";
            }
            else{
                result = "false";
            }
        }
        return result;
    }
    public float calcPerformance(){
        float avg;
        float performance = 0;
        for(int i = 0; i < list.length; i++){
            avg = list[i].calcAvg();
            performance += avg;
        }
        performance = performance/ list.length;
        return performance;
    }
    public float maximumMarks(){
        float highest = list[0].calcMin();
        for(int i = 0; i < list.length; i++){
            if(list[i].calcMax() > highest){
                highest = list[i].calcMax();
            }
        }
        return highest;
    }
    public int bestPerformer(){
        int index = 0;
        float highest = list[0].calcAvg();
        for(int i = 0; i < list.length; i++){
            if(list[i].calcAvg() > highest){
                highest = list[i].calcMax();
                index = i;
            }
        }
        return index;
    }
    public float minimumMarks(){
        float lowest = list[0].calcMin();
        for(int i = 0; i < list.length; i++){
            if(list[i].calcMin() < lowest){
                lowest = list[i].calcMax();
            }
        }
        return lowest;
    }
}