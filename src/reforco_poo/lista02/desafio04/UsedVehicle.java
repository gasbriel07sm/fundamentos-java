package reforco_poo.lista02.desafio04;

public class UsedVehicle extends Vehicle {

    private int mileage; // km
    private int previousOwners;

    public UsedVehicle(String plate, String brand, String model, Double basePrice, VehicleColor color, int yearManuf, int mileage, int previousOwners) {
        super(plate, brand, model, basePrice, color, yearManuf);
        this.mileage = mileage;
        this.previousOwners = previousOwners;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPreviousOwners() {
        return previousOwners;
    }

    public void setPreviousOwners(int previousOwners) {
        this.previousOwners = previousOwners;
    }

    @Override
    public double finalPrice() {
        double porcentagemDepreciacaoKm = (mileage / 10000) * 0.02;
        double porcentagemDepreciacaoDonos = previousOwners * 0.05;
        double totalPorcentagemDepreciacao = porcentagemDepreciacaoKm + porcentagemDepreciacaoDonos;
        double valorDesconto = getBasePrice() * totalPorcentagemDepreciacao;
        return getBasePrice() - valorDesconto;
    }

    @Override
    public String vehicleTag() {
        double porcentagemDepreciacaoKm = (((double) mileage / 10000) * 0.02) * 100;
        double porcentagemDepreciacaoDonos = (previousOwners * 0.05) * 100;
        double totalPorcentagemDepreciacao = porcentagemDepreciacaoKm + porcentagemDepreciacaoDonos;
        return String.format("""
                [NEW] %s | %s %s %d | %s
                Base: $ %.2f | %d km | %d prev. owners
                Depreciation: km(%.2f%%) + owners(%.2f%%) = -%.2f%%
                Final price: $ %.2f
                """, getPlate(), getBrand(), getModel(), getYearManuf(), getColor()
                , getBasePrice(), mileage, previousOwners, porcentagemDepreciacaoKm,
                porcentagemDepreciacaoDonos, totalPorcentagemDepreciacao, finalPrice());
    }
}
