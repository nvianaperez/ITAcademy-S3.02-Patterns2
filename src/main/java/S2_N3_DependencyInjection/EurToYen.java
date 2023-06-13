package S2_N3_DependencyInjection;

import java.util.List;

public class EurToYen implements IConversor {

    public double converse(double price) {
        return price*150.67;
    }
}
