package com.tekwill.learning.basics.dec14;
//
public class Income {
    public static void main(String[] args) {
        String line = "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "----------" + "-";
        String seasonallyAdjusted = "Seasonally Adjusted";
        String notSeasonallyAdjusted = "Not Seasonally Adjusted";
        String performanceMeasures = "Performance Measures";
        String totalTaxes = "Total Tax Revenue";
        String property = "Property";
        String income = "Income";
        String sales = "Sales";
        String notApplicable = "(N/A)";
        String straightLine = "||";
        String straightOneLine = "|";
        int ONE_TO_SEVEN = 7895643;
        int FIVE = -7895643;
        float EIGHT = 117.90F;
        float NINE = 85.00000F;
        float TEN = 1.600000F;
        double ELEVEN = 1879.6000;
        System.out.println(line);
        System.out.printf("%s %39s %35s %39s %35s %34s %21s\n", straightLine, seasonallyAdjusted, straightLine, notSeasonallyAdjusted, straightLine, performanceMeasures, straightLine);
        System.out.println(line);
        System.out.printf("%s%s %3s%s %9s%s %11s%s %13s%s %3s%s %9s%s %11s%s %13s%s %9s%s %11s%s %15s\n", straightLine, totalTaxes, straightOneLine, property, straightOneLine, income, straightOneLine, sales, straightLine, totalTaxes, straightOneLine, property, straightOneLine, income, straightOneLine, sales, straightLine, property, straightOneLine, income, straightOneLine, sales, straightLine);
        System.out.println(line);
        System.out.printf("%s%s %15s%s %12s%s %12s%s %13s%s %15s%s %12s%s %12s%s %13s%s %12s%s %12s%s %15s\n", straightLine, notApplicable, straightOneLine, notApplicable, straightOneLine, notApplicable, straightOneLine, notApplicable, straightLine, notApplicable, straightOneLine, notApplicable, straightOneLine, notApplicable, straightOneLine, notApplicable, straightLine, notApplicable, straightOneLine, notApplicable, straightOneLine, notApplicable, straightLine);
        System.out.println(line);
        System.out.printf("%s %,+19d%s (%,14d)%s %,16d%s %,16d%s %,19d%s %,16d%s %,16d%s %16.2f%s %16.5f%s %16.6f%s %,18.4f%s\n", straightLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightLine, FIVE, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, EIGHT, straightLine, NINE, straightOneLine, TEN, straightOneLine, ELEVEN, straightLine);
        System.out.printf("%s %,+19d%s (%,14d)%s %,16d%s %,16d%s %,19d%s %,16d%s %,16d%s %16.2f%s %16.5f%s %16.6f%s %,18.4f%s\n", straightLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightLine, FIVE, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, EIGHT, straightLine, NINE, straightOneLine, TEN, straightOneLine, ELEVEN, straightLine);
        System.out.printf("%s %,+19d%s (%,14d)%s %,16d%s %,16d%s %,19d%s %,16d%s %,16d%s %16.2f%s %16.5f%s %16.6f%s %,18.4f%s\n", straightLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightLine, FIVE, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, EIGHT, straightLine, NINE, straightOneLine, TEN, straightOneLine, ELEVEN, straightLine);
        System.out.printf("%s %,+19d%s (%,14d)%s %,16d%s %,16d%s %,19d%s %,16d%s %,16d%s %16.2f%s %16.5f%s %16.6f%s %,18.4f%s", straightLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightLine, FIVE, straightOneLine, ONE_TO_SEVEN, straightOneLine, ONE_TO_SEVEN, straightOneLine, EIGHT, straightLine, NINE, straightOneLine, TEN, straightOneLine, ELEVEN, straightLine);


    }


}

