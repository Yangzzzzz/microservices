package com.microservices;

import org.junit.Test;

public class StrrTest {

    @Test
    public void ttTest(){
        String str = "41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,144,244,344,444,445,446,547,548,552,553,554,555,556,557,558,559,560,561,644,645,646,647,744,844,845,944,945,946,947,948,1044,1045,1046,1047,1048,1049,1144,1244,1344,1345,1346,1347,1348,1444,1445,1446,1447,1448,1449,1450,1451,1452,1544,1545,1546,1644,1744,1745,1746,1747,1844,1944,1945,1946,1947,1948,1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,2044,2045,2046,2047,2048,2049,2050,2051,2052,2053,2054,2144,2244,2344,2345,2346,2347,2348,2349,2350,2351,2352,2353,2354,2355,2356,2357,2358,2359,2360,2361,2362,2363,2364,2365,2366,2367,2368,2369,2370,2444,2445,2446,2447,2448,2449,2450,2451,2452,2453,2454,2455,2456,2457,2458,2459,2460,2461,2462,2463,2464,2465,2466,2467,2468,2469,2470,2471,2472,2473,2474,2475,2476,2477,2478,2479,2480,2481,2482";
        String [] st = str.split(",");

        System.out.print(st.length);
    }
}