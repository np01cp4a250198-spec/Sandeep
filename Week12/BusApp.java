package Week12;
public class BusApp
{
    public static void main(String[] args)
    {
        BusCompany company = new BusCompany();
        Bus b1 = new Bus("BA101", "red", "R1", "Ram", true, 600);
        Bus b2 = new Bus("BA102", "green", "R2", "Hari", false, 400);
        Bus b3 = new Bus("BA103", "blue", "R3", "Sita", true, 700);
        company.addBus(b1);
        company.addBus(b2);
        company.addBus(b3);
        company.rateMoreThan500.add(b1);
        company.rateMoreThan500.add(b3);
        company.redOrBlueBuses.add(b1);
        company.redOrBlueBuses.add(b3);
        company.displayAll();
        company.removeBus(1);
        company.displayAll();
        company.displayRateMoreThan500();
        company.displayRedOrBlue();

    }
}