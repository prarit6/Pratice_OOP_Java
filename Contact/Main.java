package Contact;

public class Main {
    public static void demo1(){
        Contact p1 = new Contact();
        p1.setFirstName("petEr"); // Peter
        p1.setLastName("PARKER"); // Parker
        p1.setPhoneNumber("(08)14567890"); //0814567890
        System.out.println(p1.getFirstName() + " " + p1.getLastName() + " " + p1.formatNum());

        Contact person = new Contact("bruce", "lee", "029998881");
        System.out.println(person);

    }
    public static void main(String[] args){
        demo1();
    }
}
