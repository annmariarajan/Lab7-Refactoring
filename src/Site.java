public abstract class Site {

    public static final double TAX_RATE = 0.13;

    public abstract double getBaseAmount();

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getTaxAmount();

}
