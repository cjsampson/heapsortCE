package heapsort;


import java.util.Random;

public class Mail {
    String mailCode;
    DeliveryType type;

    Mail(DeliveryType type, String mailCode) {
        this.type = type;
        this.mailCode = mailCode;
    }

    Mail() {
        this.type = this.randomType();
        this.mailCode = this.randomMailCode();
    }

    private String randomMailCode() {
        return "";
    }

    private DeliveryType randomType() {
        Random random = new Random();

        return DeliveryType.values()[
            random.nextInt(DeliveryType.values().length)
        ];
    }

    @Override
    public String toString() {
        return this.type.toString();
    }
}
