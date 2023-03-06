public class TuitionCenter {
    private String address;
    private String headMaster;
    private TeacherList[] teamTutors;
    private int currentSz = 0;

    public TuitionCenter(String address, String headMaster, int maxteamsz){
        this.address = address;
        this.headMaster = headMaster;
        teamTutors = new TeacherList[maxteamsz];
    }
    public void addTutors(TeacherList tutors){
        if (currentSz == teamTutors.length)
            return;
        this.teamTutors[currentSz] = tutors;
        currentSz++;
    }
}
