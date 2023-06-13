package S2_N3_DependencyInjection;

import java.util.List;

public class EurToLempira implements IConversor {

    @Override
    public double converse(double price) {
        return price*26.61;
    }
}
