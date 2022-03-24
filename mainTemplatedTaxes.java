import java.util.ArrayList;
import java.util.Arrays;

public class mainTemplatedTaxes {

    public static void main(String[] args) {

        ArrayList<Visitable> toVisit = new ArrayList<Visitable>();
        Type1 b1 = new Type1("building T1-1");
        Type1 b2 = new Type1("building T1-2");
        Type2 b3 = new Type2("building  T2-1");
        Type2 b4 = new Type2("building T2-2");
        Type3 b5 = new Type3("building T3-1");
        Type3 b6 = new Type3("building T3-2");

        toVisit = new ArrayList<Visitable>(Arrays.asList(b1, b2, b3, b4, b5, b6));

        //Compute municipal and school taxes for each building to visit
        for (Visitable current : toVisit) {
            current.computeAllTaxes();
        }
    }
}
