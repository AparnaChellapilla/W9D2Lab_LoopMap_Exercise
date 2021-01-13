package com.tts;

import java.util.*;
import java.util.Map.Entry;



public class carDealer {

    public static void main(String[] args) {

        HashMap<String, String> vehicles = new HashMap<>();

        vehicles.put("Honda", "Civic");
        vehicles.put("Toyota", "camry");
        vehicles.put("Nissan", "Rogue");
        vehicles.put("Hyundai", "Sonata");

        System.out.println("selection of vehicles we have now are: "
                + vehicles.size());
        System.out.println(vehicles);


        Scanner scanner = new Scanner(System.in);
        System.out.println("what are you interested to see today?");
        String userInput = scanner.next();


        // Check if a key is present and if
        // present, print value

        for (Entry<String, String> entry : vehicles.entrySet()) {

            if (userInput.equals(entry.getValue())) {
                String make = entry.getKey();
                System.out.printf("Oh you are looking for a %s ? Our %s selection is right over here", userInput, make);
            }


        }

            }
        }





