package org.example;

public class Main {
    public static void main(String[] args) {

        MyStringBuilder builder = new MyStringBuilder();

        builder.append("Java");
        builder.append(" Developer");
        builder.append(" Middle");

        System.out.println(builder);

        builder.undo();
        System.out.println(builder);

        builder.undo();
        System.out.println(builder);

        builder.undo();
        System.out.println(builder);
    }
}
