/*
name (string)
Ic (string)
address (string)
number of years teaching (integer)
qualifications (string)
*/
public class Teacher {
    // data attributes
    public Name name;
    private String ic;
    private String address;
    private int yearsInCenter;
    private int yearsExp;
    private String qualification;
    private StudentList[] team;
    private int currentsz;

    public Teacher(String ic, String address, int maxteams) {
        this.ic = ic;
        this.address = address;
        team = new StudentList[maxteams];
    }
    // methods or operation
    public void setName1(Name thename) {  //avoid direct access
        name = thename;
    }
    public String getName(){
        return name.getfname();
    }
    public void addTeam(StudentList student){
        if (currentsz == team.length)
            return;
        this.team[currentsz] = student;
        currentsz++;
    }
    public void dispBackground(int yearsExp, int numOfYear, String qualification){
        this.yearsExp = yearsExp;
        this.yearsInCenter = numOfYear;
        this.qualification = qualification;
        System.out.println("Number of years in the industry: " + yearsExp);
        System.out.println("Number of years in the center: " + numOfYear);
        System.out.println("Qualifications: " + qualification);
    }

}