package com.brycelooyenga.paintjob;

public class PaintJob {

    //a program that calculates how many buckets of paint you will need for a given area

    public static int getBucketCount
            (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double bucketsneeded = area / areaPerBucket;
        double finalbuckets = Math.ceil(bucketsneeded - extraBuckets);
        return (int) finalbuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double bucketsneeded = Math.ceil(area / areaPerBucket);
        return (int) bucketsneeded;

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucketsneeded = Math.ceil(area / areaPerBucket);
        return (int) bucketsneeded;
    }

}
