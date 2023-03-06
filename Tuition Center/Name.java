
public class Name {
    
    private String fname;
    private String mname;
    private String lname;
    
    //constructors
    //no return, same name as class
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    public void setFname(String fname) {
        //'this' means current object (refers to class attributes)
        this.fname = fname;
    }
    public String getfname(){
        return fname;
    }
    public void setMname(String mname){
        //'this' means current object (refers to class attributes)
        this.mname = mname;                
    }
    public String getmname(){
        return mname;
    }
    public void setLname(String lname){
        this.lname = lname;                
    }
    public String getlname(){
        return lname;
    }
}