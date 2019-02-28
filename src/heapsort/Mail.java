package heapsort;


import java.util.Random;

public class Mail implements Comparable<Mail> {
    String mailCode;
    DeliveryType type;

    public Mail(DeliveryType type, String mailCode) {
        this.type = type;
        this.mailCode = mailCode;
    }

    public Mail() {
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

    // Used to sort movies by year
    public int compareTo(Mail mail)
    {
        if (this.type == mail.type) {
            if ( Integer.parseInt(this.mailCode) > Integer.parseInt(mail.mailCode) ) {
                return -1;
            }

            if ( Integer.parseInt(this.mailCode) == Integer.parseInt(mail.mailCode) ) {
                return 0;
            }

            if ( Integer.parseInt(this.mailCode) < Integer.parseInt(mail.mailCode) ) {
                return 1;
            }
        }

        if ( this.type > mail.type ) {
            
        }
    }

    @Override
    public String toString() {
        return this.type.toString();
    }
}
