public class TeacherList {
    private Teacher listOfTutor[] = new Teacher[2];
    private int currentSz = 0;
    public void addTeacher(Teacher tutor){
        listOfTutor[currentSz++] = tutor;
    }
}
