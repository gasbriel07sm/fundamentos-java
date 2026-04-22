package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio03;

public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public Double totalPrice() {
        return getPrice() + customFee;
    }

    @Override
    public String priceTag() {
        StringBuilder s = new StringBuilder();

        s.append(getName()).append(" $ ")
                .append(String.format("%.2f", totalPrice()))
                .append(" (Customs fee: $ ").append(getCustomFee()).append(")");

        return s.toString();
    }
}
