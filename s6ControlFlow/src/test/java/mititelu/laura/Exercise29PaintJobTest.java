package mititelu.laura;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise29PaintJobTest {

    @ParameterizedTest
    @CsvSource({"-3.4,2.1,1.5,2,-1", "3.4,2.1,1.5,2,3", "2.75,3.25,2.5,1,3"})
    void shouldReturnCorrectValuesWhenGetBucketCount4Params(Double w, Double h, Double aPB, Integer eB, Integer result) {
        //given
        double width = w;
        double height = h;
        double areaPerBucket = aPB;
        int extraBuckets = eB;
        int expected = result;

        //when
        int actual = Exercise29PaintJob.getBucketCount(width, height,areaPerBucket,extraBuckets);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"-3.4,2.1,1.5,-1", "3.4,2.1,1.5,5", "7.25,4.3,2.35,14"})
    void shouldReturnCorrectValuesWhenGetBucketCount3Params(Double w, Double h, Double aPB, Integer result) {
        //given
        double width = w;
        double height = h;
        double areaPerBucket = aPB;
        int expected = result;

        //when
        int actual = Exercise29PaintJob.getBucketCount(width, height,areaPerBucket);

        //then
        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({"3.4,1.5,3", "6.26,2.2,3", "3.26,0.75,5"})
    void shouldReturnCorrectValuesWhenGetBucketCount2Params(Double a, Double aPB, Integer result) {
        //given
        double area = a;
        double areaPerBucket = aPB;
        int expected = result;

        //when
        int actual = Exercise29PaintJob.getBucketCount(area,areaPerBucket);

        //then
        assertEquals(expected, actual);
    }
}