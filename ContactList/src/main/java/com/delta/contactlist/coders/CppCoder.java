package com.delta.contactlist.coders;

import com.delta.contactlist.Contact.Contact;

/**
 * Created by jint3i on 8/13/13.
 */
public class CppCoder extends Contact.Person implements Coder {
    private static final String myLanguage = "C++";

    public CppCoder(String id, String name, String occupation, String yearsCoding) {
        super(id, name, occupation, yearsCoding);

        String content = echoHelloWorld()
                + "\nname: " + this.name
                + "\noccupation: " + this.occupation
                + "\nexperience: " + this.yearsCoding + " years";

        this.setContent(content);
    }
    @Override
    public Boolean knowsLanguage(Language language) {
        Boolean result = false;

        switch (language) {
            case CPP_98:
                result = true;
                break;
            default:
                result = false;
                break;
        }

        return false;
    }

    @Override
    public String writeCode(Language language) {
        String result = "";

        if (knowsLanguage(language)) {
            result = "I can do it!";
        } else {
            result = "I don't know that language.";
        }

        return result;
    }

    @Override
    public String echoHelloWorld() {
        return "Hello world! I code in " + myLanguage + ".";
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
