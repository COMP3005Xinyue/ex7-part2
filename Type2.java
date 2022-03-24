public class Type2 implements Visitable{
    private String name;

    public Type2(String n){
        this.name = n;
    }

    @Override
    public int assess() {
        return 2000000;
    }

    @Override
    public double c1() {
        return 0.08;
    }

    @Override
    public double c2() {
        return 0.03;
    }

    @Override
    public double municipalTaxes() {
        double temp = this.assess() * this.c1();
        return temp;
    }

    @Override
    public double schoolTaxes() {
        double temp = this.assess() * this.c2();
        return temp;
    }

    @Override
    public void computeAllTaxes() {
        System.out.println("Municipal taxes for " + this.name + " are: " + this.municipalTaxes());
        System.out.println("School taxes for " + this.name + " are: " + this.schoolTaxes());
    }
}
