package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> nedSpanDictionary = new HashMap<String, String>();
        nedSpanDictionary.put("Maandag", "Lunes");
        nedSpanDictionary.put("Dinsdag", "Martes");
        nedSpanDictionary.put("Woensdag", "Miércoles");
        nedSpanDictionary.put("Donderdag", "Jueves");
        nedSpanDictionary.put("Vrijdag", "Viernes");
        nedSpanDictionary.put("Zaterdag", "Sábado");
        nedSpanDictionary.put("Zondag", "Domingo");

        // Retrieve things from dictonary
        System.out.println(nedSpanDictionary.get("Maandag"));
        System.out.println(nedSpanDictionary.get("Dinsdag"));
        System.out.println(nedSpanDictionary.get("Woensdag"));
        System.out.println(nedSpanDictionary.get("Donderdag"));
        System.out.println(nedSpanDictionary.get("Vrijdag"));
        System.out.println(nedSpanDictionary.get("Zaterdag"));
        System.out.println(nedSpanDictionary.get("Zondag"));

        // Print out all keys
        System.out.println(nedSpanDictionary.keySet());

        // Print out all values
        System.out.println(nedSpanDictionary.values());

        // Print out size
        System.out.println("De grootte van de dictionary is: " + nedSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shoppinglist
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);

        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));

        // Kay-Value Pairs Print Out
        System.out.println(shoppingList.toString());
        System.out.println("Is the dictonary empty? " + shoppingList.isEmpty());

        // Remove things
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());

        // Replace things
        shoppingList.replace("Bread", Boolean.FALSE);
        shoppingList.replace("Ham", Boolean.FALSE);
        System.out.println(shoppingList.toString());
        // Clear dicitonary
        shoppingList.clear();
        System.out.println("Is the dictonary empty? " + shoppingList.isEmpty());
        System.out.println(shoppingList.toString());
    }

}
