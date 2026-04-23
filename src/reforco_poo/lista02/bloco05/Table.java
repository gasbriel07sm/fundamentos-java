package reforco_poo.lista02.bloco05;

public class Table {

    private Integer number;
    private TableSector sector;

    public Table(Integer number, TableSector sector) {
        this.number = number;
        this.sector = sector;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public TableSector getSector() {
        return sector;
    }

    public void setSector(TableSector sector) {
        this.sector = sector;
    }
}
