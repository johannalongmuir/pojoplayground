public class Main {
    public static void main(String[] args) {

        EurocarStandardDefault newEurocarStandardDefault = new EurocarStandardDefault();
        System.out.println(newEurocarStandardDefault.rateCode);
        System.out.println(newEurocarStandardDefault.accountNumber);
        System.out.println(newEurocarStandardDefault.getRateCode());
        System.out.println(newEurocarStandardDefault.getAccountNumber());

        EurocarStandardGB newEurocarStandardGB = new EurocarStandardGB();
        System.out.println(newEurocarStandardGB.rateCode);
        System.out.println(newEurocarStandardGB.accountNumber);
        System.out.println(newEurocarStandardGB.getRateCode());
        System.out.println(newEurocarStandardGB.getAccountNumber());

        EurocarStandardDomestic eurocarStandardDomestic  = new EurocarStandardDomestic();
        System.out.println(eurocarStandardDomestic.getAccountNumber());
        System.out.println(eurocarStandardDomestic.getRateCode());


    }

}
