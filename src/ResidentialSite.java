public class ResidentialSite extends Site {
    private double _units;
    private double _rate;

    //contructor
    public ResidentialSite(double units, double rate){
        _units = units;
        _rate = rate;
    }

    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

}
