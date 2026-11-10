public class LifelineSite extends Site{

    private double _units;
    private double _rate;

    //contructor
    public LifelineSite(double units, double rate){
        _units = units;
        _rate = rate;
    }


    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

    @Override
    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }

}
