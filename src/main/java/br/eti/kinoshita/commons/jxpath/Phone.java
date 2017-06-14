package br.eti.kinoshita.commons.jxpath;

public class Phone {

    private final long number;

    public Phone(long number) {
        super();
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone [number=" + number + "]";
    }

}
