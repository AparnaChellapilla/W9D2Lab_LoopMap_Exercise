package com.tts;

import java.util.*;
import java.util.Map.Entry;



public class carDealer {
       public void  carDealer(){
        HashMap<String, String> vehicles = new HashMap<>();

        vehicles.put("Civic", "Honda");
        vehicles.put("Camry", "Toyota");
        vehicles.put("Rogue", "Nissan");
        vehicles.put("Sonata", "Hyundai");
        vehicles.put("CRV", "Honda");
        vehicles.put("Accord", "Honda");
        vehicles.put("Corolla", "Toyota");

        System.out.println("selection of vehicles we have now are: "
                + vehicles.size());
        System.out.println(vehicles);


        Scanner scanner = new Scanner(System.in);
        System.out.println("what are you interested to see today?");
        String userInput = scanner.next();


        // Check if a key is present and if
        // present, print value

        for (Entry<String, String> entry : vehicles.entrySet()) {

            if (userInput.equals(entry.getKey())) {
                String make = entry.getValue();
                System.out.printf("Oh you are looking for a %s ? Our %s selection is right over here", userInput, make);


            }

        }
    }
}





