public class VipCustomer {
    private String name;
    private double creditlimit;
    private String emailaddress;

    public VipCustomer(String name, double creditlimit, String emailaddress){
        System.out.println("Constrauctor with paramteres called");
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;
    }

    public VipCustomer(){
        this("default", 000.0, "deafault" );
        System.out.println("Constructor with no parameters called");
    }
    public VipCustomer(String name, double creditlimit){
        this(name, creditlimit, "default");
        System.out.println("Third constructor called");

    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}
