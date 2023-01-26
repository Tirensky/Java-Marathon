package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String name) {
        this.username = name;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribe(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return this.isSubscribe(user) && user.isSubscribe(this);
    }

    public void sendMessage(User to, String text) {
        MessageDatabase.sendMessage(this, to, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
