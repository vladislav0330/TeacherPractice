public class Receptions {
    private int ID_reception;
    private String number;
    private String name;
    private String address;
public void set_ID_reception (int ID_reception){
    this.ID_reception = ID_reception;
    }
public void set_name (String name){
    this.name = name;
    }
            public int get_ID_reception() {
        return ID_reception;
        }
            public String get_name() {
        return name;
        }
public void printAboutObject() {
System.out.println("ID Регистратора - " + ID_reception);
System.out.println("ФИО - " + name);
    }
}