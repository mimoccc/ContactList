package com.delta.contactlist.coders;

/**
 * Created by jint3i on 8/13/13.
 */
public interface Coder {
    public enum Language {
        ANSI_C,
        CPP_98,
        JAVA_SE_6
    }
    public abstract String writeCode(Language language);
    public Boolean knowsLanguage(Language language);
    public String echoHelloWorld();
    public void setContent(String content);
}
