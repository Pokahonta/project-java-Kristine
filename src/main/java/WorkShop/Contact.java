package WorkShop;

public class Contact {
    //-------params-------//
    private String firstName;
    private String lastName;
    private String phoneNumber;

    //-----Constructor------//
    public Contact(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName == null ? "" : lastName; //uslovie// - //chto budet esli null "pustota" : chto budet esli ne raven null(lastName//)
        this.phoneNumber = phoneNumber;
    }
        public Contact() {}

    //------Getters / Setters -----//
    //---- Alt + Insert----//
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            this.lastName = "";
        } else {
             this.lastName = lastName;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        //peredelaet v stroku i zapiwet v string//
        this.phoneNumber = String.valueOf(phoneNumber);
    }

        //--------Additional Methods-------//
    public String getFullInfo(){
        return firstName + " " + lastName + ": " + phoneNumber;
    }


}
