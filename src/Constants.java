import java.util.HashMap;
import java.util.Map;

public class Constants {
	
    public static final int BIKRAM_SAMBAT_MAX_LIMIT = 2110;
    public static final int BIKRAM_SAMBAT_MIN_LIMIT = 1957;
    
	public static String []nepali_months= {"बैशाख","जेठ","असार","श्रावण","भाद्र","असोज","कार्तिक","मंसिर","पौष","माघ","फागुन","चैत्र"};

	
    static int []yearsWithBaishakh1stAsSunday= {1970,1976,1981,1987,1998,2009,2015,2020,2026,2031,2037,2048,2054,2059,2065,2070,2076,2087,2092,2098};

    public static String[] nepaliNumerals = {"०", "१", "२", "३", "४", "५", "६", "७", "८", "९", "१०", "११", "१२", "१३", "१४", "१५", "१६", "१७", "१८", "१९", "२०", "२१", "२२", "२३", "२४", "२५", "२६", "२७", "२८", "२९", "३०", "३१", "३२", "३३", "३४", "३५", "३६", "३७", "३८", "३९", "४०", "४१", "४२", "४३", "४४", "४५", "४६", "४७", "४८", "४९", "५०","५१", "५२", "५३", "५४", "५५", "५६", "५७", "५८", "५९", "६०"};

    
    static HashMap<Integer, TempLookUpModel> adEquivalentDatesForNewNepaliYear = new HashMap<>();
    static public Map<Integer, Integer[]> numberOfDaysInNepaliMonth = new HashMap<>();

    static {
        // Data Source: Drik panchang 

        adEquivalentDatesForNewNepaliYear.put(1900,new TempLookUpModel(1900,1957,12));
        adEquivalentDatesForNewNepaliYear.put(1901,new TempLookUpModel(1901,1958,13));
        adEquivalentDatesForNewNepaliYear.put(1902,new TempLookUpModel(1902,1959,13));
        adEquivalentDatesForNewNepaliYear.put(1903,new TempLookUpModel(1903,1960,13));
        adEquivalentDatesForNewNepaliYear.put(1904,new TempLookUpModel(1904,1961,12));
        adEquivalentDatesForNewNepaliYear.put(1905,new TempLookUpModel(1905,1962,13));
        adEquivalentDatesForNewNepaliYear.put(1906,new TempLookUpModel(1906,1963,13));
        adEquivalentDatesForNewNepaliYear.put(1907,new TempLookUpModel(1907,1964,13));
        adEquivalentDatesForNewNepaliYear.put(1908,new TempLookUpModel(1908,1965,12));
        adEquivalentDatesForNewNepaliYear.put(1909,new TempLookUpModel(1909,1966,13));
        adEquivalentDatesForNewNepaliYear.put(1910,new TempLookUpModel(1910,1967,13));
        adEquivalentDatesForNewNepaliYear.put(1911,new TempLookUpModel(1911,1968,13));
        adEquivalentDatesForNewNepaliYear.put(1912,new TempLookUpModel(1912,1969,13));

        adEquivalentDatesForNewNepaliYear.put(1913,new TempLookUpModel(1913,1970,13)); // April 1913 = 1970 Baisakh
        adEquivalentDatesForNewNepaliYear.put(1914,new TempLookUpModel(1914,1971,13));
        adEquivalentDatesForNewNepaliYear.put(1915,new TempLookUpModel(1915,1972,13));
        adEquivalentDatesForNewNepaliYear.put(1916,new TempLookUpModel(1916,1973,13));
        adEquivalentDatesForNewNepaliYear.put(1917,new TempLookUpModel(1917,1974,13));
        adEquivalentDatesForNewNepaliYear.put(1918,new TempLookUpModel(1918,1975,12));
        adEquivalentDatesForNewNepaliYear.put(1919,new TempLookUpModel(1919,1976,13));
        adEquivalentDatesForNewNepaliYear.put(1920,new TempLookUpModel(1920,1977,13));
        adEquivalentDatesForNewNepaliYear.put(1921,new TempLookUpModel(1921,1978,13));
        adEquivalentDatesForNewNepaliYear.put(1922,new TempLookUpModel(1922,1979,13));
        adEquivalentDatesForNewNepaliYear.put(1923,new TempLookUpModel(1923,1980,13));
        adEquivalentDatesForNewNepaliYear.put(1924,new TempLookUpModel(1924,1981,13));
        adEquivalentDatesForNewNepaliYear.put(1925,new TempLookUpModel(1925,1982,13));
        adEquivalentDatesForNewNepaliYear.put(1926,new TempLookUpModel(1926,1983,13));
        adEquivalentDatesForNewNepaliYear.put(1927,new TempLookUpModel(1927,1984,13));
        adEquivalentDatesForNewNepaliYear.put(1928,new TempLookUpModel(1928,1985,13));
        adEquivalentDatesForNewNepaliYear.put(1929,new TempLookUpModel(1929,1986,13));
        adEquivalentDatesForNewNepaliYear.put(1930,new TempLookUpModel(1930,1987,13));
        adEquivalentDatesForNewNepaliYear.put(1931,new TempLookUpModel(1931,1988,13));
        adEquivalentDatesForNewNepaliYear.put(1932,new TempLookUpModel(1932,1989,13));
        adEquivalentDatesForNewNepaliYear.put(1933,new TempLookUpModel(1933,1990,13));// 1990 Baisakh 1
        adEquivalentDatesForNewNepaliYear.put(1934,new TempLookUpModel(1934,1991,13));
        adEquivalentDatesForNewNepaliYear.put(1935,new TempLookUpModel(1935,1992,13));
        adEquivalentDatesForNewNepaliYear.put(1936,new TempLookUpModel(1936,1993,13));
        adEquivalentDatesForNewNepaliYear.put(1937,new TempLookUpModel(1937,1994,13));
        adEquivalentDatesForNewNepaliYear.put(1938,new TempLookUpModel(1938,1995,13));
        adEquivalentDatesForNewNepaliYear.put(1939,new TempLookUpModel(1939,1996,13));
        adEquivalentDatesForNewNepaliYear.put(1940,new TempLookUpModel(1940,1997,13));
        adEquivalentDatesForNewNepaliYear.put(1941,new TempLookUpModel(1941,1998,13));
        adEquivalentDatesForNewNepaliYear.put(1942,new TempLookUpModel(1942,1999,13));
        adEquivalentDatesForNewNepaliYear.put(1943,new TempLookUpModel(1943,2000,14));// 2000 Baisakh 1
        adEquivalentDatesForNewNepaliYear.put(1944,new TempLookUpModel(1944,2001,13));// 2001 Baisakh 1
        adEquivalentDatesForNewNepaliYear.put(1945,new TempLookUpModel(1945,2002,13));
        adEquivalentDatesForNewNepaliYear.put(1946,new TempLookUpModel(1946,2003,13));
        adEquivalentDatesForNewNepaliYear.put(1947,new TempLookUpModel(1947,2004,14));// 2004
        adEquivalentDatesForNewNepaliYear.put(1948,new TempLookUpModel(1948,2005,13));
        adEquivalentDatesForNewNepaliYear.put(1949,new TempLookUpModel(1949,2006,13));
        adEquivalentDatesForNewNepaliYear.put(1950,new TempLookUpModel(1950,2007,13));
        adEquivalentDatesForNewNepaliYear.put(1951,new TempLookUpModel(1951,2008,14));
        adEquivalentDatesForNewNepaliYear.put(1952,new TempLookUpModel(1952,2009,13));
        adEquivalentDatesForNewNepaliYear.put(1953,new TempLookUpModel(1953,2010,13));
        adEquivalentDatesForNewNepaliYear.put(1954,new TempLookUpModel(1954,2011,13));
        adEquivalentDatesForNewNepaliYear.put(1955,new TempLookUpModel(1955,2012,14));
        adEquivalentDatesForNewNepaliYear.put(1956,new TempLookUpModel(1956,2013,13));
        adEquivalentDatesForNewNepaliYear.put(1957,new TempLookUpModel(1957,2014,13));
        adEquivalentDatesForNewNepaliYear.put(1958,new TempLookUpModel(1958,2015,13));
        adEquivalentDatesForNewNepaliYear.put(1959,new TempLookUpModel(1959,2016,14));
        adEquivalentDatesForNewNepaliYear.put(1960,new TempLookUpModel(1960,2017,13));
        adEquivalentDatesForNewNepaliYear.put(1961,new TempLookUpModel(1961,2018,13));
        adEquivalentDatesForNewNepaliYear.put(1962,new TempLookUpModel(1962,2019,13));
        adEquivalentDatesForNewNepaliYear.put(1963,new TempLookUpModel(1963,2020,14));// 2020
        adEquivalentDatesForNewNepaliYear.put(1964,new TempLookUpModel(1964,2021,13));
        adEquivalentDatesForNewNepaliYear.put(1965,new TempLookUpModel(1965,2022,13));
        adEquivalentDatesForNewNepaliYear.put(1966,new TempLookUpModel(1966,2023,13));
        adEquivalentDatesForNewNepaliYear.put(1967,new TempLookUpModel(1967,2024,14));
        adEquivalentDatesForNewNepaliYear.put(1968,new TempLookUpModel(1968,2025,13));
        adEquivalentDatesForNewNepaliYear.put(1969,new TempLookUpModel(1969,2026,13));
        adEquivalentDatesForNewNepaliYear.put(1970,new TempLookUpModel(1970,2027,14));
        adEquivalentDatesForNewNepaliYear.put(1971,new TempLookUpModel(1971,2028,14));
        adEquivalentDatesForNewNepaliYear.put(1972,new TempLookUpModel(1972,2029,13));
        adEquivalentDatesForNewNepaliYear.put(1973,new TempLookUpModel(1973,2030,13));
        adEquivalentDatesForNewNepaliYear.put(1974,new TempLookUpModel(1974,2031,14));
        adEquivalentDatesForNewNepaliYear.put(1975,new TempLookUpModel(1975,2032,14));
        adEquivalentDatesForNewNepaliYear.put(1976,new TempLookUpModel(1976,2033,13));
        adEquivalentDatesForNewNepaliYear.put(1977,new TempLookUpModel(1977,2034,13));
        adEquivalentDatesForNewNepaliYear.put(1978,new TempLookUpModel(1978,2035,14));
        adEquivalentDatesForNewNepaliYear.put(1979,new TempLookUpModel(1979,2036,14));
        adEquivalentDatesForNewNepaliYear.put(1980,new TempLookUpModel(1980,2037,13));
        adEquivalentDatesForNewNepaliYear.put(1981,new TempLookUpModel(1981,2038,13));
        adEquivalentDatesForNewNepaliYear.put(1982,new TempLookUpModel(1982,2039,14));
        adEquivalentDatesForNewNepaliYear.put(1983,new TempLookUpModel(1983,2040,14));
        adEquivalentDatesForNewNepaliYear.put(1984,new TempLookUpModel(1984,2041,13));
        adEquivalentDatesForNewNepaliYear.put(1985,new TempLookUpModel(1985,2042,13));
        adEquivalentDatesForNewNepaliYear.put(1986,new TempLookUpModel(1986,2043,14));
        adEquivalentDatesForNewNepaliYear.put(1987,new TempLookUpModel(1987,2044,14));
        adEquivalentDatesForNewNepaliYear.put(1988,new TempLookUpModel(1988,2045,13));
        adEquivalentDatesForNewNepaliYear.put(1989,new TempLookUpModel(1989,2046,13));
        adEquivalentDatesForNewNepaliYear.put(1990,new TempLookUpModel(1990,2047,14));
        adEquivalentDatesForNewNepaliYear.put(1991,new TempLookUpModel(1991,2048,14));
        adEquivalentDatesForNewNepaliYear.put(1992,new TempLookUpModel(1992,2049,13));
        adEquivalentDatesForNewNepaliYear.put(1993,new TempLookUpModel(1993,2050,13));
        adEquivalentDatesForNewNepaliYear.put(1994,new TempLookUpModel(1994,2051,14));// 2051
        adEquivalentDatesForNewNepaliYear.put(1995,new TempLookUpModel(1995,2052,14));// 2052
        adEquivalentDatesForNewNepaliYear.put(1996,new TempLookUpModel(1996,2053,13));
        adEquivalentDatesForNewNepaliYear.put(1997,new TempLookUpModel(1997,2054,13));
        adEquivalentDatesForNewNepaliYear.put(1998,new TempLookUpModel(1998,2055,14));
        adEquivalentDatesForNewNepaliYear.put(1999,new TempLookUpModel(1999,2056,14));
        adEquivalentDatesForNewNepaliYear.put(2000,new TempLookUpModel(2000,2057,13));
        adEquivalentDatesForNewNepaliYear.put(2001,new TempLookUpModel(2001,2058,14));
        adEquivalentDatesForNewNepaliYear.put(2002,new TempLookUpModel(2002,2059,14));
        adEquivalentDatesForNewNepaliYear.put(2003,new TempLookUpModel(2003,2060,14));// 2060
        adEquivalentDatesForNewNepaliYear.put(2004,new TempLookUpModel(2004,2061,13));
        adEquivalentDatesForNewNepaliYear.put(2005,new TempLookUpModel(2005,2062,14));
        adEquivalentDatesForNewNepaliYear.put(2006,new TempLookUpModel(2006,2063,14));
        adEquivalentDatesForNewNepaliYear.put(2007,new TempLookUpModel(2007,2064,14));
        adEquivalentDatesForNewNepaliYear.put(2008,new TempLookUpModel(2008,2065,13));
        adEquivalentDatesForNewNepaliYear.put(2009,new TempLookUpModel(2009,2066,14));
        adEquivalentDatesForNewNepaliYear.put(2010,new TempLookUpModel(2010,2067,14));
        adEquivalentDatesForNewNepaliYear.put(2011,new TempLookUpModel(2011,2068,14));
        adEquivalentDatesForNewNepaliYear.put(2012,new TempLookUpModel(2012,2069,13));
        adEquivalentDatesForNewNepaliYear.put(2013,new TempLookUpModel(2013,2070,14));// 2070
        adEquivalentDatesForNewNepaliYear.put(2014,new TempLookUpModel(2014,2071,14));
        adEquivalentDatesForNewNepaliYear.put(2015,new TempLookUpModel(2015,2072,14));
        adEquivalentDatesForNewNepaliYear.put(2016,new TempLookUpModel(2016,2073,13));
        adEquivalentDatesForNewNepaliYear.put(2017,new TempLookUpModel(2017,2074,14));
        adEquivalentDatesForNewNepaliYear.put(2018,new TempLookUpModel(2018,2075,14));
        adEquivalentDatesForNewNepaliYear.put(2019,new TempLookUpModel(2019,2076,14));
        adEquivalentDatesForNewNepaliYear.put(2020,new TempLookUpModel(2020,2077,13));
        adEquivalentDatesForNewNepaliYear.put(2021,new TempLookUpModel(2021,2078,14));
        adEquivalentDatesForNewNepaliYear.put(2022,new TempLookUpModel(2022,2079,14));
        adEquivalentDatesForNewNepaliYear.put(2023,new TempLookUpModel(2023,2080,14));// 2080
        adEquivalentDatesForNewNepaliYear.put(2024,new TempLookUpModel(2024,2081,13));// 2081

        // Need to look
        adEquivalentDatesForNewNepaliYear.put(2025,new TempLookUpModel(2025,2082,14));// 2082
        adEquivalentDatesForNewNepaliYear.put(2026,new TempLookUpModel(2026,2083,14));// 2083
        adEquivalentDatesForNewNepaliYear.put(2027,new TempLookUpModel(2027,2084,14));// 2084
        adEquivalentDatesForNewNepaliYear.put(2028,new TempLookUpModel(2028,2085,14));// 2085
        adEquivalentDatesForNewNepaliYear.put(2029,new TempLookUpModel(2029,2086,14));// 2086
        adEquivalentDatesForNewNepaliYear.put(2030,new TempLookUpModel(2030,2087,14));// 2087
        adEquivalentDatesForNewNepaliYear.put(2031,new TempLookUpModel(2031,2088,14));// 2088
        adEquivalentDatesForNewNepaliYear.put(2032,new TempLookUpModel(2032,2089,14));// 2089
        adEquivalentDatesForNewNepaliYear.put(2033,new TempLookUpModel(2033,2090,14));// 2090
        adEquivalentDatesForNewNepaliYear.put(2034,new TempLookUpModel(2034,2091,14));// 2091
        adEquivalentDatesForNewNepaliYear.put(2035,new TempLookUpModel(2035,2092,14));// 2092
        adEquivalentDatesForNewNepaliYear.put(2036,new TempLookUpModel(2036,2093,14));// 2093
        adEquivalentDatesForNewNepaliYear.put(2037,new TempLookUpModel(2037,2094,14));// 2094
        adEquivalentDatesForNewNepaliYear.put(2038,new TempLookUpModel(2038,2095,14));// 2095
        adEquivalentDatesForNewNepaliYear.put(2039,new TempLookUpModel(2039,2096,14));// 2096
        adEquivalentDatesForNewNepaliYear.put(2040,new TempLookUpModel(2040,2097,14));// 2097
        adEquivalentDatesForNewNepaliYear.put(2041,new TempLookUpModel(2041,2098,14));// 2098
        adEquivalentDatesForNewNepaliYear.put(2042,new TempLookUpModel(2042,2099,14));// 2099
        adEquivalentDatesForNewNepaliYear.put(2043,new TempLookUpModel(2043,2100,14));// 2100
        adEquivalentDatesForNewNepaliYear.put(2044,new TempLookUpModel(2044,2101,14));// 2101 B.s
        adEquivalentDatesForNewNepaliYear.put(2045,new TempLookUpModel(2045,2102,14));
        adEquivalentDatesForNewNepaliYear.put(2046,new TempLookUpModel(2046,2103,14));
        adEquivalentDatesForNewNepaliYear.put(2047,new TempLookUpModel(2047,2104,14));
        adEquivalentDatesForNewNepaliYear.put(2048,new TempLookUpModel(2048,2105,14));
        adEquivalentDatesForNewNepaliYear.put(2049,new TempLookUpModel(2049,2106,14));
        adEquivalentDatesForNewNepaliYear.put(2050,new TempLookUpModel(2050,2107,14));
        adEquivalentDatesForNewNepaliYear.put(2051,new TempLookUpModel(2051,2108,14));
        adEquivalentDatesForNewNepaliYear.put(2052,new TempLookUpModel(2052,2109,14));// 2109 B.s
        adEquivalentDatesForNewNepaliYear.put(2053,new TempLookUpModel(2053,2110,14));// 2110 B.s





    }

    static {

        // Source: Drik panchang 

        numberOfDaysInNepaliMonth.put(1957, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31}); //1900 ad & 1957 bs
        numberOfDaysInNepaliMonth.put(1958, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1959, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1960, new Integer[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1961, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(1962, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1963, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1964, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1965, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(1966, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1967, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1968, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(1969, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});

        numberOfDaysInNepaliMonth.put(1970, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 1970
        numberOfDaysInNepaliMonth.put(1971, new Integer[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});// 1971
        numberOfDaysInNepaliMonth.put(1972, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});// 1972
        numberOfDaysInNepaliMonth.put(1973, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});// 1973
        numberOfDaysInNepaliMonth.put(1974, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 1974
        numberOfDaysInNepaliMonth.put(1975, new Integer[]{31, 31, 32, 32, 30, 31, 30, 29, 30, 29, 30, 30});// 1975
        numberOfDaysInNepaliMonth.put(1976, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});// 1976
        numberOfDaysInNepaliMonth.put(1977, new Integer[]{30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31});// 1977
        numberOfDaysInNepaliMonth.put(1978, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 1978
        numberOfDaysInNepaliMonth.put(1979, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});// 1979
        numberOfDaysInNepaliMonth.put(1980, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});// 1980
        numberOfDaysInNepaliMonth.put(1981, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});// 1981
        numberOfDaysInNepaliMonth.put(1982, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 1982
        numberOfDaysInNepaliMonth.put(1983, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});// 1983
        numberOfDaysInNepaliMonth.put(1984, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});// 1984
        numberOfDaysInNepaliMonth.put(1985, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});// 1985
        numberOfDaysInNepaliMonth.put(1986, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 1986
        numberOfDaysInNepaliMonth.put(1987, new Integer[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});// 1987
        numberOfDaysInNepaliMonth.put(1988, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});// 1988
        numberOfDaysInNepaliMonth.put(1989, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});// 1989
        numberOfDaysInNepaliMonth.put(1990, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 1990
        numberOfDaysInNepaliMonth.put(1991, new Integer[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});// 1991
        numberOfDaysInNepaliMonth.put(1992, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});// 1992
        numberOfDaysInNepaliMonth.put(1993, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});// 1993
        numberOfDaysInNepaliMonth.put(1994, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 1994
        numberOfDaysInNepaliMonth.put(1995, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});// 1995
        numberOfDaysInNepaliMonth.put(1996, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});// 1996
        numberOfDaysInNepaliMonth.put(1997, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1998, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(1999, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2000 ,new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2001, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2002, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2003, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2004, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2005, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2006, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2007, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2008, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        numberOfDaysInNepaliMonth.put(2009, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2010, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2011, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2012, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2013, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2014, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2015, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2016, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2017, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2018, new Integer[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2019, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2020, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2021, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2022, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2023, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2024, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2025, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2026, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2027, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2028, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2029, new Integer[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2030, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2031, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2032, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2033, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2034, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2035, new Integer[]{30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31}); //2035
        numberOfDaysInNepaliMonth.put(2036, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 2036
        numberOfDaysInNepaliMonth.put(2037, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2038, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2039, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});//2039
        numberOfDaysInNepaliMonth.put(2040, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2041, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30}); // 2041
        numberOfDaysInNepaliMonth.put(2042, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2043, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2044, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2045, new Integer[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2046, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2047, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2048, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 2048
        numberOfDaysInNepaliMonth.put(2049, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2050, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2051, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2052, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});// 2052
        numberOfDaysInNepaliMonth.put(2053, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30}); //2053
        numberOfDaysInNepaliMonth.put(2054, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2055, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2056, new Integer[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2057, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2058, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2059, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2060, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});// 2060
        numberOfDaysInNepaliMonth.put(2061, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2062, new Integer[]{30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2063, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2064, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2065, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2066, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        numberOfDaysInNepaliMonth.put(2067, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2068, new Integer[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2069, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2070, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});// 2070
        numberOfDaysInNepaliMonth.put(2071, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2072, new Integer[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2073, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2074, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2075, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2076, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2077, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2078, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2079, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2080, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});// 2080
        numberOfDaysInNepaliMonth.put(2081, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2082, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30}); //2082
        numberOfDaysInNepaliMonth.put(2083, new Integer[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2084, new Integer[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2085, new Integer[]{31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2086, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2087, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2088, new Integer[]{30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2089, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2090, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2091, new Integer[]{31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2092, new Integer[]{30, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2093, new Integer[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2094, new Integer[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2095, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2096, new Integer[]{30, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2097, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2098, new Integer[]{31, 31, 32, 31, 31, 31, 29, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2099, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 29, 30, 30, 30});
        numberOfDaysInNepaliMonth.put(2100, new Integer[]{31, 32, 31, 32, 30, 31, 30, 29, 30, 29, 30, 30});
        // Source: Drik panchang (2101-2110)
        numberOfDaysInNepaliMonth.put(2101, new Integer[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2102, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2103, new Integer[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2104, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        numberOfDaysInNepaliMonth.put(2105, new Integer[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2106, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2107, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2108, new Integer[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        numberOfDaysInNepaliMonth.put(2109, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        numberOfDaysInNepaliMonth.put(2110, new Integer[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});

      
    }


}
