package java.practice;

import java.util.HashMap;

public class LearnHashMap {
    public void addHashMapValue() {
        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("IE", "Internet Explorer");
        hmap.put("Chrome", "Google Chrome");
        hmap.put("Firefox", "Mozilla Firefox");
        hmap.put("Safari", "Macbook Browser");
//        hmap.remove("IE");
        System.out.println(hmap);
        System.out.println(hmap.get("IE"));
    }

}
