package reforco_poo.lista03.bloco04.entities;

import reforco_poo.lista03.bloco04.enums.Modality;

public class Freight {

    private FreightCalculator freightCalculator;
    private Modality modality;

    public Freight(FreightCalculator freightCalculator, Modality modality) {
        this.freightCalculator = freightCalculator;
        this.modality = modality;
    }

    public FreightCalculator getFreightCalculator() {
        return freightCalculator;
    }

    public void setFreightCalculator(FreightCalculator freightCalculator) {
        this.freightCalculator = freightCalculator;
    }

    public Modality getModality() {
        return modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }
}
