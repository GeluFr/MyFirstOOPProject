public class Human implements Vietate, InterfataA {
    private String email;
    private String address;

    public static String planet;

    public Human(String email, String address) {
        this.email = email;
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }


    public void verify(){
        System.out.println("Verifies email");
    }
    public void sendEmail(){
        System.out.println("Sends email");
    }

    @Override
    public void metodaInterfata() {
        System.out.println("Metoda din interfata Vietate");
    }

    @Override
    public void metodaInterfataA() {

    }
}
