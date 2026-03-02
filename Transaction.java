import java.util.ArrayList;

public class Transaction {
    private ArrayList<String> history = new ArrayList<>();

    public void add(String record) {
        history.add(record);
    }

    public void show() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String s : history) {
                System.out.println(s);
            }
        }
    }
}
