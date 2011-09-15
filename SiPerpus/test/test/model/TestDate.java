/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test.model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author puspa
 */
public class TestDate {
    public static void main(String[] args) {
        Date now = Calendar.getInstance().getTime();
        Date yesterday = new Date(111,8,13);
        System.out.println("now = "+now);
        System.out.println("yesterday = "+yesterday);
    }
}
