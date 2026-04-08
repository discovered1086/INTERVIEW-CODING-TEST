package com.kingshuk.corejava.algorithms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@AllArgsConstructor
class Bracket {
    private int id;
    private int openSequence;
    private int closeSequence;
    private boolean closed;
    private char character;
}



public class BracketTest {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        List<Character> openBracketList = List.of('(', '{', '[');
        List<Character> closedBracketList = List.of(')', '}', ']');

        List<Bracket> allBrackets = new ArrayList<>();

        boolean breachDetected = false;
        boolean strayDetected = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (openBracketList.contains(c)) {
                allBrackets.add(new Bracket(i, i + 1, 0, false, c));
            }

            if (closedBracketList.contains(c)) {
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
