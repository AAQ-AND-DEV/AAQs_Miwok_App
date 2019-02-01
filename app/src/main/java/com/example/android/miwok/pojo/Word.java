package com.example.android.miwok.pojo;

/**
 * {@link Word} represents a vocab word
 * contains a default translation and a miwok translation
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    /**
     * get default translation of the word
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get Miwok translation of the word
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
