package com.rzw.test;

import java.util.HashMap;

/**
 * @Author rzw
 * @Date 2018/12/28 - 15:09
 */
public class TestPoint {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
