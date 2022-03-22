package model;

import java.io.Serializable;

public class Statement {
    protected Number a;
    protected Number b;
    protected String text;
    protected StatementType type;
    protected Runnable print = (Runnable & Serializable)() -> System.out.print(text);

    public Statement() {
        a = 0;
        b = 0;
        text = "";
        type = StatementType.PRINT;
    }

    public Statement(Number a, Number b, String text, StatementType type) {
        this.a = a;
        this.b = b;
        this.text = text;
        this.type = type;
    }

    public Runnable getPrint() {
        return print;
    }

    public void setPrint(Runnable print) {
        this.print = print;
    }

    public Number getA() {
        return a;
    }

    public void setA(Number a) {
        this.a = a;
    }

    public Number getB() {
        return b;
    }

    public void setB(Number b) {
        this.b = b;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public StatementType getType() {
        return type;
    }

    public void setType(StatementType type) {
        this.type = type;
    }
}

