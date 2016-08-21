package pl.com.bottega.documentmanagement.utils;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by ulvar on 20.08.2016.
 */
public class Assert {

    private static Long EPS = 2L * 1000L;

    public static void assertDatesEqual(Date expected, Date actual) {
        assertTrue(String.format("Expected %1tc, got %2tc", expected, actual), Math.abs(actual.getTime() - expected.getTime()) < EPS);
    }

}