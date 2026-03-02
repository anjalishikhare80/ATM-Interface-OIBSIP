public class User {
    private String userId;
    private int pin;

    public User(String userId, int pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public boolean validate(String uid, int enteredPin) {
        return userId.equals(uid) && pin == enteredPin;
    }
}
