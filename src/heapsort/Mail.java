package heapsort;


import java.util.Random;

public class Mail {
    String mailCode;
    DeliveryType type;

    Mail() {
        this.mailCode = this.randomMailCode();
        this.type = this.randomType();
    }

    private String randomMailCode() {
        return "AAAAA";
    }

    private DeliveryType randomType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
        return ;
    }

    @Override
    public String toString() {
        return this.type.toString();
    }
}
