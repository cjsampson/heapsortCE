package heapsort;


public class Mail {
    String mailCode;
    DeliveryType type;

    Mail() {
        this.mailCode = this.randomMailCode();
        this.type = this.randomType();
    }

    private String randomMailCode() {
        return null;
    }

    private DeliveryType randomType() {
        return null;
    }

    @Override
    public String toString() {
        return this.type.toString();
    }
}
