package com.androidtdd;

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 09/09/20, 12:17 PM.
 */
class IntervalOverlapDetector {

    public boolean isOverlap(Interval interval1, Interval interval2){
        return interval1.getEnd() > interval2.getStart() && interval1.getStart() < interval2.getEnd();
    }

}
