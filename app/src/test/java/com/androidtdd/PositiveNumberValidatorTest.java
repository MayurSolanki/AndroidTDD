package com.androidtdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 08/09/20, 8:15 PM.
 */
public class PositiveNumberValidatorTest {

    PositiveNumberValidator SUT;

    @Before
    public void setUp() throws Exception {
      SUT = new PositiveNumberValidator();

    }

    @Test
    public void test1(){
        boolean result = SUT.isPositiveNumber(-1);
        Assert.assertThat(result,is(false));
    }


    @After
    public void tearDown() throws Exception {
    }
}