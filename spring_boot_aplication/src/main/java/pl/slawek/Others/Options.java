package pl.slawek.Others;

enum Options {
    ADD_DEVICE (1, "Dodaj urzadzenie"),
    ADD_CATEGORY(2, "Dodaj kategorie"),
    ADD_CUSTOMER(3, "Dodaj klienta"),
    RENT (4, "Wypożycz urządzenie"),
    REMOVE_DEVICE (5, "Usuń urządzenie"),
    REMOVE_CATEGORY(6, "Usun kategorie"),
    REMOVE_CUSTOMER (7, "Usun klienta"),
    EXIT (8, "Koniec");


    private int number;
    private String name;

    Options(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return  number + "-" + name;
    }

    
}
