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

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
    @Override
    public double getBaseAmount() {
        return _units * _rate;
    }

}
