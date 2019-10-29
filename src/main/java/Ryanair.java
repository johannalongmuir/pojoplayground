import java.util.HashMap;
import java.util.Map;

public abstract class Ryanair {

    private Map<String, Eurocar> eurocars;



    String rateCode;

    public Ryanair(String rateCode) {
        this.rateCode = rateCode;
    }

    // POJO should not extend
    // should not use interface

}
