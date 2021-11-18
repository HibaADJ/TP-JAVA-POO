import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Map<String, String> lang = new HashMap<>();
        lang.put("1", "Java");
        lang.put("2", "PHP");
        lang.put("3", "Python");
        // Récupérer les valeurs et les clés
        for (Map.Entry<String, String> entry : lang.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Clé: " + key + ", Valeur: " + value);
        }
    }
}