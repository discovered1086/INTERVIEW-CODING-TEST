package com.kingshuk.corejava;


import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;

class Bracket {
    private int id;
    private char c;
    private boolean closed;
    private int openSequence;
    private int closeSequence;

    public Bracket(int id, int openSequence, int closeSequence, boolean closed, char c) {
        this.id = id;
        this.openSequence = openSequence;
        this.closeSequence = closeSequence;
        this.closed = closed;
        this.c = c;
    }

    public int getId() {
        return this.id;
    }

    public int getOpenSequence() {
        return this.openSequence;
    }

    public char getCharacter() {
        return this.c;
    }

    public int getCloseSequence() {
        return this.closeSequence;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public void setCloseSequence(int sequence) {
        this.closeSequence = sequence;
    }

    public String toString() {
        return this.id + "--" + this.c + "--" + this.openSequence + "--" +
                +this.closeSequence + "--" + this.closed;
    }

}

public class BracketsPractice {

    public static void main(String[] args) {
        String input = "[([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([([()])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])])]";
        System.out.println(isValid(input));
    }


    public static boolean isValid(String s) {
        List<Bracket> allBrackets = new ArrayList<>();

        boolean breachDetected = false;
        boolean strayDetected = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                allBrackets.add(new Bracket(i, i + 1, 0, false, c));
            }

            if (c == ')' || c == '}' || c == ']') {
                switch (c) {
                    case ')' -> {
                        Bracket openBracket = allBrackets.stream()
                                .filter(b -> {
                                    boolean bracketMatch = '(' == b.getCharacter();
                                    OptionalInt highestSequence = allBrackets.stream()
                                            .filter(b1 -> b1.getCharacter() == '(' && !b1.isClosed())
                                            .mapToInt(Bracket::getOpenSequence)
                                            .max();

                                    boolean openSequenceMatch = highestSequence.isPresent()
                                            && highestSequence.getAsInt() == b.getOpenSequence();

                                    return bracketMatch && openSequenceMatch;
                                })
                                .findFirst().orElse(null);

                        if (openBracket != null) {
                            openBracket.setClosed(true);
                            openBracket.setCloseSequence(i + 1);

                            AtomicInteger index = new AtomicInteger(i);
                            System.out.println(allBrackets);
                            breachDetected = allBrackets.stream()
                                    .anyMatch(b -> b.getId() >= (openBracket.getId() + 1)
                                            && b.getId() < index.get()
                                            && !b.isClosed());
                            allBrackets.remove(openBracket);
                        } else {
                            strayDetected = true;
                        }

                        System.out.println("Breach Detected? " + breachDetected);
                        System.out.println("Stray bracket detected? " + strayDetected);

                    }
                    case '}' -> {
                        Bracket openBracket = allBrackets.stream()
                                .filter(b -> {
                                    boolean bracketMatch = '{' == b.getCharacter();
                                    OptionalInt highestSequence = allBrackets.stream()
                                            .filter(b1 -> b1.getCharacter() == '{' && !b1.isClosed())
                                            .mapToInt(Bracket::getOpenSequence)
                                            .max();

                                    boolean openSequenceMatch = highestSequence.isPresent()
                                            && highestSequence.getAsInt() == b.getOpenSequence();

                                    return bracketMatch && openSequenceMatch;
                                })
                                .findFirst().orElse(null);

                        System.out.println("Current bracket --> " + i + "-->" + c);
                        System.out.println("Open Bracket --> " + openBracket);

                        if (openBracket != null) {
                            openBracket.setClosed(true);
                            openBracket.setCloseSequence(i + 1);

                            AtomicInteger index = new AtomicInteger(i);
                            System.out.println(allBrackets);
                            breachDetected = allBrackets.stream()
                                    .anyMatch(b -> b.getId() >= (openBracket.getId() + 1)
                                            && b.getId() < index.get()
                                            && !b.isClosed());
                            allBrackets.remove(openBracket);
                        } else {
                            strayDetected = true;
                        }

                        System.out.println("Breach Detected? " + breachDetected);
                        System.out.println("Stray bracket detected? " + strayDetected);

                    }
                    case ']' -> {
                        Bracket openBracket = allBrackets.stream()
                                .filter(b -> {
                                    boolean bracketMatch = '[' == b.getCharacter();
                                    OptionalInt highestSequence = allBrackets.stream()
                                            .filter(b1 -> b1.getCharacter() == '[' && !b1.isClosed())
                                            .mapToInt(Bracket::getOpenSequence)
                                            .max();

                                    boolean openSequenceMatch = highestSequence.isPresent()
                                            && highestSequence.getAsInt() == b.getOpenSequence();

                                    return bracketMatch && openSequenceMatch;
                                })
                                .findFirst().orElse(null);

                        System.out.println("Current bracket --> " + i + "-->" + c);
                        System.out.println("Open Bracket --> " + openBracket);

                        if (openBracket != null) {
                            openBracket.setClosed(true);
                            openBracket.setCloseSequence(i + 1);

                            AtomicInteger index = new AtomicInteger(i);
                            System.out.println(allBrackets);
                            breachDetected = allBrackets.stream()
                                    .anyMatch(b -> b.getId() >= (openBracket.getId() + 1)
                                            && b.getId() < index.get()
                                            && !b.isClosed());
                            allBrackets.remove(openBracket);

                        } else {
                            strayDetected = true;
                        }

                        System.out.println("Breach Detected? " + breachDetected);
                        System.out.println("Stray bracket detected? " + strayDetected);
                    }
                }
                ;
            }

            if (breachDetected || strayDetected) {
                break;
            }
        }

        System.out.println("==========FINAL=================");

        System.out.println(allBrackets);

        System.out.println("Breach Detected? " + breachDetected);
        System.out.println("Stray bracket detected? " + strayDetected);

        return !strayDetected
                && allBrackets.stream().allMatch(b -> b.isClosed()) && !breachDetected;

    }
}

