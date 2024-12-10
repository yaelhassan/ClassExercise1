public class StandardCustomer extends Customer{
    public StandardCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice;
    }
}
