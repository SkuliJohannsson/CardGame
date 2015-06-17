package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * Created by skuli on 14.06.15.
 */
public class Util {

    /**
     * An example usage: getArgs("a b c") == "b c"
     *
     * @param cmd A command with arguments. For example "a b c"
     */
    public static String[] getArgs(String cmd) {
        String[] arr = cmd.split(" ");
        return Arrays.copyOfRange(arr, 1, arr.length);
    }

    public static String toSimplerString(List list) {
        return strJoin(list.toArray(), " ");
    }

    public static String toSimplerString(Object[] arr) {
        return strJoin(arr, " ");
    }

    private static String strJoin(Object[] aArr, String sSep) {
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0, il = aArr.length; i < il; i++) {
            if (i > 0)
                sbStr.append(sSep);
            sbStr.append(aArr[i]);
        }
        return sbStr.toString();
    }

    public static boolean IsPositiveNumber(String str) {
        return str.matches("^\\d+$");
    }
}
