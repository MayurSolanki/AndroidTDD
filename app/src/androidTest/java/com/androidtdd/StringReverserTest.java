package com.androidtdd;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 09/09/20, 12:01 PM.
 */
public class StringReverserTest {

    StringReverser SUT;  // System Under Test = SUT

    @Before
    public void setUp() throws Exception {
        SUT = new StringReverser();
    }

    @Test
    public void reverse_emptyString_emptyStringReturned()  throws Exception{
        String result = SUT.reverse("");
        Assert.assertThat(result, CoreMatchers.is(""));
    }

    @Test
    public void reverse_singleCharacter_sameStringReturned() throws Exception{
        String result = SUT.reverse("a");
        Assert.assertThat(result,CoreMatchers.is("a"));
    }

    @Test
    // functionName_methodName_returnsOfTheMethod
    public void reverse_longString_reversedStringReturned() throws Exception{
        String result = SUT.reverse("Mayur Solanki");
        Assert.assertThat(result,CoreMatchers.is("iknaloS ruyaM"));

    }

}