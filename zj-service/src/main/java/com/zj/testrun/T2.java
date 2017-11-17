package com.zj.testrun;

public class T2 {
    public static void main(String[] args) {
        String bb = "HX11\n" +
                "HX51\n" +
                "HXJ1\n" +
                "JJ21\n" +
                "JJ51\n" +
                "JJ81\n" +
                "JJJ1\n" +
                "JJJY\n" +
                "JJY2\n" +
                "JJY8\n" +
                "MS11\n" +
                "MS12\n" +
                "MS13\n" +
                "MS21\n" +
                "MS22\n" +
                "MS23\n" +
                "MS2T\n" +
                "MS31\n" +
                "MS32\n" +
                "MS51\n" +
                "MS52\n" +
                "MS53\n" +
                "MS81\n" +
                "MS82\n" +
                "MSJ1\n" +
                "MSJ2\n" +
                "MSJ4\n" +
                "MSJ5\n" +
                "MSJ6\n" +
                "MSJ7\n" +
                "MSJ8\n" +
                "MSL1\n" +
                "MSL2\n" +
                "MSS1\n" +
                "MSW1\n" +
                "MSW2\n" +
                "MSY1\n" +
                "MSY2\n" +
                "MSY5\n" +
                "MSY8\n" +
                "MSZ1\n" +
                "MSZ2\n" +
                "MSZ3\n" +
                "MSZ4\n" +
                "MSZ5\n" +
                "MSZW\n" +
                "MX11\n" +
                "MX12\n" +
                "MX81\n" +
                "MXT1\n" +
                "MXT2\n" +
                "MXY8\n" +
                "MY25\n" +
                "SS11\n" +
                "SS12\n" +
                "SS21\n" +
                "SS51\n" +
                "SS81\n" +
                "SY11\n" +
                "SY13\n" +
                "SY31\n" +
                "SY51\n" +
                "TL12\n" +
                "TL51\n" +
                "TL81\n" +
                "TL82\n" +
                "TL83\n" +
                "TLL1\n" +
                "WC11\n" +
                "WC81\n" +
                "WCL1\n" +
                "ZT11\n" +
                "ZT21\n" +
                "ZTT1";

        String[] as = bb.split("\n");
        String result = "";
        for (String a : as) {
            result += result.isEmpty() ? "'" + a + "'" : ",'" + a + "'";

        }
        System.out.println(result);



    }
}
