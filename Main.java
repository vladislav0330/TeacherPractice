public class Main {
    public static void main(String[] args) {
        Doctors box1 = new Doctors();
        box1.set_ID_doctor(101);
        box1.set_position("Педиатр");
        box1.set_name("Лисовенкова Надежда Федоровна");
        box1.printAboutObject();
        
        System.out.println();
        
        Receptions box2 = new Receptions();
        box2.set_ID_reception(102);
        box2.set_name("Бойченко Любовь Викторовна");
        box2.printAboutObject();
        
        System.out.println();
        
        MedichineCard record = new MedichineCard("Ефанов Андрей Дмитриевич", "+7 926 423-23-21", "ул. Пушкина 6", "137431", "Пневмания");
        record.output();
    }
}
