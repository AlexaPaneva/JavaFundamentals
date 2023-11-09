package javaFundamentals.listE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> topicsList = Arrays
                .stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("course start")) {

            String[] commandParts = command.split(":");
            String commandName = commandParts[0];
            String topic = commandParts[1];

            switch (commandName) {
                //Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
                //• Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
                //• Remove:{lessonTitle} - remove the lesson, if it exists
                //• Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
                //• Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, if the lesson exists
                //and there is no exercise already, in the following format: "{lessonTitle}-Exercise". If the lesson
                //doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.
                case "Add":
                    if (!topicsList.contains(topic)) {
                        topicsList.add(topic);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if (!topicsList.contains(topic)) {
                        topicsList.add(index, topic);
                    }
                    break;

                case "Remove":
                    if (topicsList.contains(topic)) {
                        int indexTopic = topicsList.indexOf(topic);
                        String exercise = topic + "-Exercise";
                        boolean hasExercise = indexTopic != topicsList.size() - 1 && topicsList.get(indexTopic + 1).equals(exercise);
                        topicsList.remove(topic);
                        if (hasExercise) {
                            topicsList.remove(exercise);
                        }
                    }
                    break;

                case "Swap":
                    String topic2 = commandParts[2];
                    if (topicsList.contains(topic) && topicsList.contains(topic2)) {
                        int indexFirst = topicsList.indexOf(topic);
                        int indexSecond = topicsList.indexOf(topic2);

                        topicsList.set(indexFirst, topic2);
                        topicsList.set(indexSecond, topic);

                        String exFirst = topic + "-Exercise";
                        String exSecond = topic2 + "-Exercise";

                        if (topicsList.contains(exFirst)) {
                            topicsList.remove(exFirst);
                            topicsList.add(topicsList.indexOf(topic) + 1, exFirst);
                        }

                        if (topicsList.contains(exSecond)) {
                            topicsList.remove(exSecond);
                            topicsList.add(topicsList.indexOf(topic2) + 1, exSecond);
                        }
                    }

                    break;

                case "Exercise":

                    String exerciseName = topic + "-Exercise"; //име на упражнението

                    if (topicsList.contains(topic)) {
                        int index1 = topicsList.indexOf(topic);
                        if (index1 == topicsList.size() - 1) {
                            topicsList.add(index1 + 1, exerciseName);
                        } else if (!topicsList.get(index1 + 1).equals(exerciseName)) {
                            topicsList.add(index1 + 1, exerciseName);
                        }
                    } else {
                        topicsList.add(topic);
                        topicsList.add(exerciseName);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        int count = 1;
        for (String topic : topicsList) {
            System.out.println(count + "." + topic);
            count++;
        }
    }
}
