public class ResidentialSite extends Site {
    private double _units;
    private double _rate;

    //contructor
    public ResidentialSite(double units, double rate){
        _units = units;
        _rate = rate;
    }

    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    private double getBaseAmount() {
        return _units * _rate;
    }

}
