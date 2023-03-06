public class TuitionCenterList {
    private TuitionCenter[] listOfCenter = new TuitionCenter[2];
    int currentSz = 0;
    public void addCenter(TuitionCenter tutor){
        listOfCenter[currentSz++] = tutor;
    }
}
