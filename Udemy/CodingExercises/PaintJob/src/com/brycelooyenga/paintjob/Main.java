package com.brycelooyenga.paintjob;

import static CodingExercises.CodingExercise30.PaintJob.getBucketCount;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount
                (-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount
                (3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount
                (2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount
                (-3.4, 2.1, 1.5));
        System.out.println(getBucketCount
                (3.4, 2.1, 1.5));
        System.out.println(getBucketCount
                (7.25, 4.3, 2.35));
        System.out.println(getBucketCount
                (3.4, 1.5));
        System.out.println(getBucketCount
                (6.26, 2.2));
        System.out.println(getBucketCount
                (3.26, 0.75));


    }
}
