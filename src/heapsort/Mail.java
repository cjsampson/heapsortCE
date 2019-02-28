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

    public String randomMailCode() {
        Random random    = new Random();
        String randomStr = "";
        int min = 65;
        int max = 90;

        for ( int i = 0; i < 5; i++ ) {
            randomStr += Character.toString((char)(min + random.nextInt(max - min + 1)));
            System.out.println(randomStr);
        }

        return randomStr;
    }

    public DeliveryType randomType() {
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
