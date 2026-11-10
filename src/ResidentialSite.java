public class ResidentialSite extends Site {
    private double _units;
    private double _rate;

    //contructor
    public ResidentialSite(double units, double rate){
        _units = units;
        _rate = rate;
    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    private double getBaseAmount() {
        return _units * _rate;
    }

}
