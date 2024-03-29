package Contact;

public class Contact {
    private String firstName, lastName;
    private String phoneNumber;
    public Contact(String firstName, String lastname, String phoneNumber){
        setFirstName(firstName);
        setLastName(lastname);
        setPhoneNumber(phoneNumber);


        // this.firstName = firstName;
        // this.lastName = lastname;
        // this.phoneNumber = phoneNumber;
    }
    
    public Contact(){
        
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + 
        firstName.substring(1).toLowerCase(); // ตัวใหญ่ตำแหน่ง 0 ตัวเดียว + ตัวเล็กตั้งแต่ตำแหน่ง 1
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0,1).toUpperCase() +
        lastName.substring(1).toLowerCase();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        //replaceAll --> \D -> non numeric character "" ลบตัวที่ไม่ใช่ตัวเลข
        this.phoneNumber = phoneNumber.replaceAll("[\\D]",""); //regular ex
    }
    
    public String formatNum(){
        if(phoneNumber.length() == 9){
            return phoneNumber.replaceAll("(\\d{2})(\\d{3})(\\d{4})","($1) $2 $3");
        }else{
            // d{2} --> $1, d{4} --> $2, d{4} --> $3
        return phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3"); //ตัวหนี่งและตัวสองขั้นด้วย - และตัวสามมี whitespace
        }
    }

    @Override
    public String toString(){
        return "Contact " + "firstName ='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", phoneNumber='" + formatNum() + '\'' ;

    }
}
