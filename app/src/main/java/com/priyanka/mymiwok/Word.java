package com.priyanka.mymiwok;

public class Word {
    private String mDefaultTransition;
    private String mMiwokTransition;

    public Word(String mDefaultTransition, String mMiwokTransition) {
        this.mDefaultTransition = mDefaultTransition;
        this.mMiwokTransition = mMiwokTransition;
    }

    public String getmDefaultTransition() {
        return mDefaultTransition;
    }

    public String getmMiwokTransition() {
        return mMiwokTransition;
    }
}
