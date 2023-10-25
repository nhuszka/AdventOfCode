package org.aoc.y2015;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

// Challenge implementation: https://adventofcode.com/2015/day/4
// https://en.wikipedia.org/wiki/MD5
// https://en.wikipedia.org/wiki/Hexadecimal
public abstract class Advent2015Day04 {


    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        long startTime = System.currentTimeMillis();
        List<String> a = new ArrayList<>();
        a.size();
        int u = 7;
        float x = u;
        System.out.println(new String("a") == new String("a"));
        System.out.println(Double.NaN == Double.NaN);
        System.out.println("--------");

        System.out.println(Integer.valueOf(2048) == Integer.valueOf(2048));
        System.out.println(Integer.valueOf(2047) == Integer.valueOf(2047));
        System.out.println(Integer.valueOf(1024) == Integer.valueOf(1024));
        System.out.println(Integer.valueOf(511) == Integer.valueOf(511));
        System.out.println(Integer.valueOf(256) == Integer.valueOf(256));
        System.out.println(Integer.valueOf(250) == Integer.valueOf(250));
        System.out.println(Integer.valueOf(129) == Integer.valueOf(129));
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127));
        System.out.println(Integer.valueOf(100) == Integer.valueOf(100));
        System.out.println(Integer.valueOf(10) == Integer.valueOf(10));
        System.out.println(Integer.valueOf(4) == Integer.valueOf(4));
        System.out.println("--------");

        System.out.println(Math.min(0.0d, Double.MIN_VALUE));


        System.out.println(Math.min(0.0d, Double.MIN_VALUE));
        System.out.println(Math.min(0.0d, Double.MIN_VALUE));
        System.out.println(Math.min(0.0d, Double.MIN_VALUE));
        System.out.println(Math.min(0.0d, Double.MIN_VALUE));

        float y = 3;
        float i = x / y;
        var v = new Object();

        System.out.println(i);
        System.out.println(Integer.valueOf(10) == Integer.valueOf(10));

    }
    private static String toMd51(String str) throws NoSuchAlgorithmException {
        byte[] bytesOfMessage = str.getBytes();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] theMD5digest = md.digest(bytesOfMessage);
        return new String(theMD5digest);
    }

    private static String toMd52(String str) {
        return DigestUtils.md5Hex(str).toUpperCase();
    }

    public static String toHex(String arg) {
        return String.format("%040x", new BigInteger(1, arg.getBytes()));
    }

    private static boolean startsWithFiveZeros(String hexaDecimalFormat) {
        return hexaDecimalFormat.startsWith("00000");
    }
}
