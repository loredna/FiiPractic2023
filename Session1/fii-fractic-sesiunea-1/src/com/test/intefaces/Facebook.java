package com.test.intefaces;

public class Facebook implements Website, Action{
    int counterOfNotifications = 0;
    @Override
    public void notification() {
        System.out.println("This is notification number " + counterOfNotifications++);
    }

    @Override
    public String getNotification(int index) {
        return null;
    }

    @Override
    public String getName() {
        return "Facebook";
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "counterOfNotifications=" + counterOfNotifications +
                '}';
    }
}
