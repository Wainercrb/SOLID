class Shopping {}

interface NotificationImp {
    public void sendEmail(Shopping shopping);
}

interface DataBaseImp {
    public void saveItem(Shopping shopping);
}

class Email implements NotificationImp {
    @Override
    public void sendEmail(Shopping shopping) {
        System.out.println("Sending email");
    }
}

class SMS implements NotificationImp {
    @Override
    public void sendEmail(Shopping shopping) {
        System.out.println("Sending sms");
    }
}

class SqlDatabase implements DataBaseImp {
    @Override
    public void saveItem(Shopping shopping) {
        System.out.println("Saving on sql database");
    }
}

class MongoDatabase implements DataBaseImp {
    @Override
    public void saveItem(Shopping shopping) {
        System.out.println("Saving on mongo database");
    }
}

class ShoppingCard {
    private DataBaseImp persistence;
    private NotificationImp notification;

    public ShoppingCard(DataBaseImp persistence, NotificationImp notification) {
        this.persistence = persistence;
        this.notification = notification;
    }
    public void buy(Shopping shopping) {
        persistence.saveItem(shopping);
        notification.sendEmail(shopping);
    }
}

public class Main {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();

        SqlDatabase sqlDatabase = new SqlDatabase();
        Email email = new Email();

        MongoDatabase  mongoDatabase = new MongoDatabase();
        SMS sms = new SMS();


        ShoppingCard shoppingCard = new ShoppingCard(mongoDatabase, sms);
        shoppingCard.buy(shopping);
    }
}