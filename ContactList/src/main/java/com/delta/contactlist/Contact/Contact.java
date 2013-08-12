package com.delta.contactlist.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by macrobius on 8/11/13.
 */
public class Contact {
    /**
     * An array of sample (dummy) items.
     */
    public static List<Person> ITEMS = new ArrayList<Person>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, Person> ITEM_MAP = new HashMap<String, Person>();

    static {
        // Add 3 sample items.
        addItem(new Person("1", "Dennis Ritchie", "C Developer", "41"));
        addItem(new Person("2", "Bjarne Stroustrup", "C++ Developer", "30"));
        addItem(new Person("3", "James Arthur Gosling", "Java Developer", "18"));
    }

    private static void addItem(Person person) {
        ITEMS.add(person);
        ITEM_MAP.put(person.id, person);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Person {
        public String id;
        public String name;
        public String occupation;
        public String yearsCoding;
        public String content;

        public Person(String id, String name, String occupation, String yearsCoding) {
            this.id = id;
            this.name = name;
            this.occupation = occupation;
            this.yearsCoding = yearsCoding;

            this.content = "name: " + this.name
                    + "\noccupation: " + this.occupation
                    + "\nexperience: " + this.yearsCoding + " years";
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
