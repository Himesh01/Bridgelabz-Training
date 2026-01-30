package lambdaExpression.NotificationFiltering;

public class Alert {
    String type;
    String message;

    public Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + " Alert → " + message;
    }
}