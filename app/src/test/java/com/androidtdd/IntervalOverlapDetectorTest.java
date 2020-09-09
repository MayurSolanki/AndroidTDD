package com.androidtdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 09/09/20, 12:22 PM.
 */
public class IntervalOverlapDetectorTest {

    IntervalOverlapDetector SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new IntervalOverlapDetector();

    }
    // interval1 is before interval2
    @Test
    public void isOverlap_interval1BeforeInterval2_falseReturned() throws Exception{
        Interval interval1 = new Interval(-1,5);
        Interval interval2 = new Interval(8,12);

        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(false));
    }

    // interval1 overlap interval2 on start (Left side)
    @Test
    public void isOverlap_interval1OverlapsInterval2OnStart_trueReturned() throws Exception{
        Interval interval1 = new Interval(-1,5);
        Interval interval2 = new Interval(3,12);

        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(true));
    }

    // interval1 is contained within interval2
    @Test
    public void isOverlap_interval1ContainWithinInterval2_trueReturned() throws Exception{
        Interval interval1 = new Interval(-1,5);
        Interval interval2 = new Interval(0,3);

        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(true));
    }

    // interval1 contain interval2
    @Test
    public void isOverlap_interval1ContainsInterval2_trueReturned() throws Exception{
        Interval interval1 = new Interval(-1,5);
        Interval interval2 = new Interval(0,3);

        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(true));
    }

    // interval1 overlaps interval2 on edn (Right Side)
    @Test
    public void isOverlap_interval1ContainsInterval2OnEnd_trueReturned() throws Exception{
        Interval interval1 = new Interval(-1,5);
        Interval interval2 = new Interval(0,3);

        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(true));
    }

    // interval1 is after interval2
    @Test
    public void isOverlap_interval1AfterInterval2_falseReturned() throws Exception{
        Interval interval1 = new Interval(-1,5);
        Interval interval2 = new Interval(-10,-3);

        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(false));
    }


}