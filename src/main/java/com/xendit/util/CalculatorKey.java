package com.xendit.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author in-vinaykumar.gupta on 14/03/21
 * @project IntelliJ IDEA
 */
public class CalculatorKey {

    public static HashMap<String, List<Integer>> getKeysOffsets() {
        return keysOffsets;
    }

    public static void setKeysOffsets() {
        keysOffsets.put("0",Arrays.asList(-(174/5)*4,(255/6)*4));
        keysOffsets.put("1",Arrays.asList(-(174/5)*4,(255/6)*3));
        keysOffsets.put("2", Arrays.asList(-(174/5)*2,(255/6)*3));
        keysOffsets.put("3",Arrays.asList(0,(255/6)*3));
        keysOffsets.put("4",Arrays.asList(-(174/5)*4,(255/6)*1));
        keysOffsets.put("5",Arrays.asList(-(174/5)*2,(255/6)*1));
        keysOffsets.put("6",Arrays.asList(0,(255/6)*1));
        keysOffsets.put("7",Arrays.asList(-(174/5)*4,-(255/6)*1));
        keysOffsets.put("8",Arrays.asList(-(174/5)*2,-(255/6)*1));
        keysOffsets.put("9",Arrays.asList(0,-(255/6)*1));
        keysOffsets.put("+",Arrays.asList((174/5)*2,(255/6)*4));
        keysOffsets.put("-",Arrays.asList((174/5)*2,(255/6)*3));
        keysOffsets.put("*",Arrays.asList((174/5)*2,(255/6)*1));
        keysOffsets.put("/",Arrays.asList((174/5)*2,-(255/6)*1));
        keysOffsets.put("=",Arrays.asList((174/5)*4,(255/6)*4));
        keysOffsets.put("C",Arrays.asList((174/5)*4,-(255/6)*2));
        keysOffsets.put(".",Arrays.asList(-(174/5)*2,(255/6)*4));
    }

    public static HashMap<String, List<Integer>>keysOffsets = new HashMap<String, List<Integer>>();

}
