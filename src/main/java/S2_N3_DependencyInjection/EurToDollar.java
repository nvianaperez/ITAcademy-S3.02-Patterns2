package S2_N3_DependencyInjection;

import java.util.List;
import java.util.stream.Collectors;

public class EurToDollar implements IConversor {

    public double converse(double price) {
        return price*1.08;
    }
}
