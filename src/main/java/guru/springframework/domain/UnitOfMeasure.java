package guru.springframework.domain;

import javax.persistence.OneToOne;

public class UnitOfMeasure {
    @OneToOne
    private String uom;

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
}
