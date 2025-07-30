package hafta_3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLinebyLine {
    public static void main(String[] args) {
        Map<String, Integer> gameScores = new LinkedHashMap<>();

        gameScores.put("The Legend of Zelda: Ocarina of Time" , 91);

        gameScores.put("SoulCalibur", 76 );

        gameScores.put("Grand Theft Auto IV" , 83 );

        gameScores.put("Red Dead Redemption 2" , 89) ;

        gameScores.put("Resident Evil 4 (2005)" , 90 );

        System.out.println("Oyun isimleri ve puanları:");

        for (Map.Entry<String, Integer> entry : gameScores.entrySet()) { // Bu döngü Map içindeki her key-value çiftini (entry) tek tek dolaşır
            System.out.println(entry.getKey() + " - " + entry.getValue()); // getKey oyunun ismini veriyor getValue oyunun puanını
        }
    }

}
