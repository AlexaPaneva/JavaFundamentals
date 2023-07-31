import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] loots = scanner.nextLine().split("\\|");
        List<String> treasureChest = new ArrayList<>(List.of(loots));

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        String loot = commandParts[i];
                        if (!treasureChest.contains(loot)) {
                            treasureChest.add(0, loot);
                        }
                    }
                    break;

                case "Drop":
                    int dropIndex = Integer.parseInt(commandParts[1]);
                    if (dropIndex >= 0 && dropIndex < treasureChest.size()) {
                        String currentLoot = treasureChest.remove(dropIndex);
                        treasureChest.add(currentLoot);
                    }
                    break;

                case "Steal":
                    int stealCount = Integer.parseInt(commandParts[1]);
                    int endIndex = Math.min(stealCount, treasureChest.size());
                    List<String> stolenLoot = new ArrayList<>(treasureChest.subList(treasureChest.size() - endIndex, treasureChest.size()));
                    treasureChest.subList(treasureChest.size() - endIndex, treasureChest.size()).clear();
                    System.out.println(String.join(", ", stolenLoot));
                    break;
            }

            command = scanner.nextLine();
        }

        if (!treasureChest.isEmpty()) {
            double averageGain = calculateAverageGain(treasureChest);
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }

    private static double calculateAverageGain(List<String> treasureChest) {
        double totalLength = 0;
        for (String item : treasureChest) {
            totalLength += item.length();
        }
        return totalLength / treasureChest.size();
    }
}
