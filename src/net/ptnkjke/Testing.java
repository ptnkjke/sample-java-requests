package net.ptnkjke;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lopatin on 14.07.2014.
 */
public class Testing {

    public static void main(String[] args) {
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("data","привет");

        String response = Utils.executePost("http://localhost:8080/data",parameters);

        response = Utils.executeGet("http://localhost:8080/data",parameters);
    }
}
