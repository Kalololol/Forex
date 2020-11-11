package logic;

public enum Option {
    EXIT(0, "Wyjście z programu"),
    NEW_REPORT(1, "Nowy raport"),
    SAFED_REPORTS(2, "Zapisane raporty"),
    INFO(3, "Informacje o programie");


    private int value;
    private String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return value +
                " - " + description ;
    }

    static Option createFromInt(int option) {
        return Option.values()[option];
    }
}
