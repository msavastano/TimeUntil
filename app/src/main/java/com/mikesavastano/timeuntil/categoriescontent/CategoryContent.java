package com.mikesavastano.timeuntil.categoriescontent;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by michael on 12/15/14.
 */
public class CategoryContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<CategoryItem> ITEMS = new ArrayList<CategoryItem>();



    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, CategoryItem> ITEM_MAP = new HashMap<String, CategoryItem>();

    static {

        addItem(new CategoryItem("1", "Holidays"));
        addItem(new CategoryItem("2", "Contact Birthdays"));
        addItem(new CategoryItem("3", "Calendar Items"));
        addItem(new CategoryItem("4", "Custom Events"));
    }

    private static void addItem(CategoryItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class CategoryItem {
        public String id;
        public String category;

        public CategoryItem(String id, String category) {
            this.id = id;
            this.category = category;
        }


        @Override
        public String toString() {
            return category;
        }
    }

    public static class Holidays{
        public List<Holidays> HOLIDAYS = new ArrayList<Holidays>();
        public String holId;
        public String name;
        public int month;
        public int day;

        public Holidays(String holId, String name, int month, int day) {
            this.holId = holId;
            this.name = name;
            this.month = month;
            this.day = day;

            HOLIDAYS.add(new Holidays("1", "Christmas", 12, 25));
            HOLIDAYS.add(new Holidays("1", "Holloween", 10, 31));
        }

    }
}
