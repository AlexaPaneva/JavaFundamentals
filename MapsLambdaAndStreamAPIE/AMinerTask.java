package JavaFundamentals.MapsLambdaAndStreamAPIE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> resourceQuantityMap = new LinkedHashMap<>();

        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {


            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourceQuantityMap.containsKey(resource)) {
                resourceQuantityMap.put(resource, quantity);
            } else {
                int currentQuantity = resourceQuantityMap.get(resource);
                resourceQuantityMap.put(resource, currentQuantity + quantity);
            }


            resource = scanner.nextLine();
        }
         resourceQuantityMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
