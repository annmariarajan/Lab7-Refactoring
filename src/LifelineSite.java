public class LifelineSite extends Site{

    private double _units;
    private double _rate;

    //contructor
    public LifelineSite(double units, double rate){
        _units = units;
        _rate = rate;
    }

    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

}
