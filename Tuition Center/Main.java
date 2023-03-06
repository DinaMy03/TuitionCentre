import java.util.Scanner;
public class Main {
  public static void main (String[]args) {
    float marks;
    //student object
    Student dina = new Student("000000", "House", "UTP");
    Name stdname = new Name("Nur", "Dina", "Mysarah");
    dina.setName(stdname);

    Student tsukasa = new Student("000001", "Japan", "Yumenosaki");
    Name stdname1 = new Name("Tsukasa", "-", "Suou");
    tsukasa.setName(stdname1);

    Student leo = new Student("000002", "Japan", "Yumenosaki");
    Name stdname2 = new Name("Leo", "-", "Tsukinaga");
    leo.setName(stdname2);

    Student ritsu = new Student("000003", "Japan", "Yumenosaki");
    Name stdname3 = new Name("Ritsu", "-", "Sakuma");
    ritsu.setName(stdname3);

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      try {
        System.out.print("Enter marks for Dina: ");
        marks = scanner.nextInt();
        dina.setMarks(marks, i);
      } catch (Exception ex) {
        System.out.println("Cannot continue");
        ex.printStackTrace();
      }
    }
    for (int i = 0; i < 5; i++) {
      try {
        System.out.print("Enter marks for Tsukasa: ");
        marks = scanner.nextInt();
        tsukasa.setMarks(marks, i);
      } catch (Exception ex) {
        System.out.println("Cannot continue");
        ex.printStackTrace();
      }
    }
    for (int i = 0; i < 5; i++) {
      try {
        System.out.print("Enter marks for Leo: ");
        marks = scanner.nextInt();
        leo.setMarks(marks, i);
      } catch (Exception ex) {
        System.out.println("Cannot continue");
        ex.printStackTrace();
      }
    }
    for (int i = 0; i < 5; i++) {
      try {
        System.out.print("Enter marks for Ritsu: ");
        marks = scanner.nextInt();
        ritsu.setMarks(marks, i);
      } catch (Exception ex) {
        System.out.println("Cannot continue");
        ex.printStackTrace();
      }
    }

    //creating a batch object
    StudentList sb2023 = new StudentList();
    sb2023.add(dina);
    sb2023.add(tsukasa);

    StudentList sb2022 = new StudentList();
    sb2022.add(ritsu);
    sb2022.add(leo);

    //teacher object
    Teacher izumi = new Teacher("010000", "Florence", 2);
    Name tcname = new Name("Izumi", " - ", "Sena");
    izumi.setName1(tcname);
    izumi.addTeam(sb2023);

    Teacher arashi = new Teacher("020000", "Japan", 2);
    Name tcname1 = new Name("Arashi", " - ", "Narukami");
    arashi.setName1(tcname1);
    arashi.addTeam(sb2022);

    //teacher batch object
    TeacherList tc2023 = new TeacherList();
    TeacherList tc2022 = new TeacherList();
    tc2023.addTeacher(izumi);
    tc2022.addTeacher(arashi);

    //tuition center object
    TuitionCenter pandaiKL = new TuitionCenter("KL", "Sagami", 1);
    pandaiKL.addTutors(tc2023);

    TuitionCenter pandaiJB = new TuitionCenter("JB", "Kunugi", 1);
    pandaiJB.addTutors(tc2022);

    TuitionCenterList pandai = new TuitionCenterList();
    pandai.addCenter(pandaiKL);
    pandai.addCenter(pandaiJB);

    String isIn = sb2023.find("Nur");

    System.out.println("KL CENTER");
    System.out.println("Tutor name: " + izumi.getName());
    izumi.dispBackground(10, 5, "Bachelor in Mathematics");
    System.out.println("\n" + "Team performance: " + sb2023.calcPerformance());
    System.out.println("Best performer: " + sb2023.getName(sb2023.bestPerformer()));
    System.out.println("Highest marks achieved: " + sb2023.maximumMarks());
    System.out.println("Lowest marks achieved: " + sb2023.minimumMarks());

    System.out.println("\n" + "JB CENTER");
    System.out.println("Tutor name: " + arashi.getName());
    arashi.dispBackground(10, 5, "Bachelor in Science");
    System.out.println("\n" + "Team performance for JB center: " + sb2022.calcPerformance());
    System.out.println("Best performer for JB center: " + sb2022.getName(sb2022.bestPerformer()));
    System.out.println("Highest marks achieved: " + sb2022.maximumMarks());
    System.out.println("Lowest marks achieved: " + sb2022.minimumMarks());

  }
}
