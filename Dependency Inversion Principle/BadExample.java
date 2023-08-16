class Shopping {}

class ShoppingCard {
    void buy(Shopping Shopping) {
        sqlDatabase db = new sqlDatabase();
        db.saveItem(Shopping);
        
        Notification notification = new Notification();
        notification.sendEmail(shopping);
    }
}


class Notification {

    void sendEmail(Shopping Shopping) {
        
    }
}

class sqlDatabase {
    void saveItem(Shopping Shopping) {

    }
}


class main  {
    void run () {
        Shopping shopping = new Shopping();
        ShoppingCard shoppingCard = new ShoppingCard();
        shoppingCard.buy(shopping);
    }
}