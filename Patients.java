public class Patients {
    protected String name;
    protected String telephone;
    protected String address;
    protected String diagnosis;

public void set_name (String name){
    this.name = name;
}
public void set_telephone (String telephone){
    this.telephone = telephone;
}
public void set_address (String address){
    this.address = address;
}
public void set_diagnosis (String diagnosis){
    this.diagnosis = diagnosis;
}
public String get_name() {
    return name;
}
public String get_telephone() {
    return telephone;
}
public String get_address() {
    return address;
}
public String get_diagnosis() {
    return diagnosis;
}
}