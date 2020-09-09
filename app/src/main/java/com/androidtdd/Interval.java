package com.androidtdd;

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 09/09/20, 12:17 PM.
 */
public class Interval {

    private final int mStart;
    private final int mEnd;

    public Interval(int start, int end){
        if(start >= end){
            throw new IllegalArgumentException("Invalid Interval range");
        }

        mStart = start;
        mEnd = end;
    }

    public int getStart(){
        return mStart;
    }

    public int getEnd(){
        return mEnd;
    }

}
