public class Main {

    public static void main (String args[]){

VipCustomer Giorgos = new VipCustomer("Giorgos", 1000.0, "gio@email.com");
VipCustomer Giannis = new VipCustomer();
VipCustomer petros = new VipCustomer("petros", 800.0);

System.out.println(Giorgos.getCreditlimit());
System.out.println(Giannis.getEmailaddress());
System.out.println(petros.getName());

System.out.println();



    }
}
