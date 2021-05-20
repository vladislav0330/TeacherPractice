public class MedichineCard extends Patients { //extends - наследование
    public String number; // Ввел переменную
    public int treatment_price;
    
        public void set_number (String number){
    this.number = number;
    }
    
        public String get_number() {
    return number;
    }
    
        public void treatment_price (int treatment_price){
    this.number = number;
    }
    
        public int get_treatment_price() {
    return treatment_price;
    }
    
    public MedichineCard (String name, String telephone, String address, String number, String diagnosis) {
    super.name = name;
    super.telephone = telephone;
    super.address = address;
    this.number = number;
    super.diagnosis = diagnosis;
    this.treatment_price = treatment_price;
}
    void output () {
System.out.println("ФИО - " + super.name);
System.out.println("Телефон - " + super.telephone);
System.out.println("Адрес - " + super.address);
System.out.println("Номер записи - " + number);
System.out.println("Диагноз - " + super.diagnosis);
System.out.println("Цена Лечения - " + treatment_price);
    }
}