package Aug_2024;

class Clients{
    String clientname[];
    String client_city[];
    double client_creditlimit[];
    Clients(String clientname[],String client_city[],double client_creditlimit[]){
        this.clientname=clientname;
        this.client_city=client_city;
        this.client_creditlimit=client_creditlimit;
    }
}
class Orders extends Clients{
    String orderid[];
    int orderno[];
    String location[];
    Orders(String clientname[],String client_city[],double client_creditlimit[],String orderid[], int orderno[],String location[]){
        super(clientname,client_city,client_creditlimit);
        this.orderid=orderid;
        this.orderno=orderno;
        this.location=location;
    }
}
class Creditlimit extends Orders{
    float amount[];
    float gst[];
    float totalamount[];
    float total_credit[];
    Creditlimit(String clientname[],String client_city[],double client_creditlimit[],String orderid[], int orderno[],String location[],float amount[],float gst[],float totalamount[],float total_credit[]){
        super(clientname,client_city,client_creditlimit,orderid,orderno,location);
        this.amount=amount;
        this.gst=gst;
        this.totalamount=totalamount;
    }
    void info() {
        for(int i=0;i<clientname.length;i++){
            System.out.println(clientname[i] + client_city[i] + client_creditlimit[i] +
                    amount[i] + gst[i] + (totalamount[i] = amount[i] + gst[i]) +
                    orderid[i] + orderno[i] + location[i]);
        }
    }
}
public class ClientMain {
    String clientname1[] = {"Moumita", "Jiya", "Onkita", "Priyanka", "Ankita", "Aniket", "Riya", "Anish", "Ashwin", "Krish"};
    String client_city1[] = {"Mumbai", "Delhi", "Karnataka", "Kerala", "Pune", "Kolkata", "Mumbai", "Bihar", "Uttar-pradesh", "Uttarakhand"};
    double client_creditlimit1[] = {50000, 80000, 150000, 45000, 40000, 150000, 80000, 100000, 120000, 75000};
    String orderid1[] = {"M305", "D108", "K200", "A12", "P50", "Kl30", "M200", "B400", "U211", "UK11"};
    int orderno1[] = {002, 100, 321, 432, 123, 345, 244, 344, 221, 233};
    String location1[] = {"Mumbai", "Delhi", "Karnataka", "Kerala", "Pune", "Kolkata", "Mumbai", "Bihar", "Uttar-pradesh", "Uttarakhand"};
    float amount1[] = {50000, 79000, 140000, 45000, 36000, 149000, 75000, 98000, 118000, 72000};
    float gst1[] = {2, 4, 6, 8, 3, 5, 7, 2, 6, 1};
    float totalamount1[];
    float total_credit1[];
    Creditlimit cl = new Creditlimit(clientname1, client_city1, client_creditlimit1, orderid1, orderno1, location1, amount1, gst1, totalamount1, total_credit1);
}
