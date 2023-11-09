package javaFundamentals.finalExam;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> heroes = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];
            String heroName = commandParts[1];

            switch (command) {
                case "Enroll":
                    if (!heroes.containsKey(heroName)) {
                        heroes.put(heroName, new ArrayList<>());
                    } else {
                        System.out.printf("%s is already enrolled.%n", heroName);

                    }
                    break;

                case "Learn":
                    String spell = commandParts[2];
                    if (heroes.containsKey(heroName)) {
                        List<String> spellbook = heroes.get(heroName);
                        if (!spellbook.contains(spell)) {
                            spellbook.add(spell);
                        } else {
                            System.out.printf("%s has already learnt %s.%n", heroName, spell);
                        }
                    } else {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    }
                    break;

                case "Unlearn":
                    spell = commandParts[2];
                    if (heroes.containsKey(heroName)) {
                        List<String> spellbook = heroes.get(heroName);
                        if (spellbook.contains(spell)) {
                            spellbook.remove(spell);
                        } else {
                            System.out.printf("%s doesn't know %s.%n", heroName, spell);
                        }
                    } else {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    }
                    break;
            }

            input = scanner.nextLine();

        }
        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> entry : heroes.entrySet()) {
            String heroName = entry.getKey();
            List<String> spellbook = entry.getValue();
            if (spellbook.isEmpty()) {
                System.out.printf("== %s: %n", heroName);
            } else {
                System.out.printf("== %s: %s %n", heroName, String.join(", ", spellbook));
            }
        }
    }
}
