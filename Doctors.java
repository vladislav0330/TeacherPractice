public class Doctors {
    private int ID_doctor;
    private String position;
    private String name;

public void set_ID_doctor (int ID_doctor) {
    this.ID_doctor = ID_doctor;
    }
public void set_position (String position){
    this.position = position;
    }
public void set_name (String name){
    this.name = name;
    }
            public int get_ID_doctor() {
        return ID_doctor;
        }
            public String get_position() {
        return position;
        }
            public String get_name() {
        return name;
        }
public void printAboutObject() {
System.out.println("ID Врача - " + ID_doctor);
System.out.println("Должность - " + position);
System.out.println("ФИО - " + name);
    }
}