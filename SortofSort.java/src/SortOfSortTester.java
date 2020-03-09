class SortOfSortTester {
    //testing an 4 integer array
    @Test
    public void testSortOfSort1(){
        int [] a = new int [];
        a = {2, 9, 5, 1};
        assetEquals({2, 1, 5, 9}, sortOfSort(a));
    }

    //testing an odd integer array
    @Test
    public void testSortOfSort2(){
        int [] a = new int [];
        a = {11, 0, 4, 23, 7};
        assetEquals({7, 4, 0, 11, 23});
    }

    //test an array with negative and positive integers
    @Test
    public void testSortOfSort3(){
        int [] a = new int [];
        a = {-3, 1, -6, 10};
        assetEquals({-3, -6, 1, 10});
    }

    @Test
    public void testSortOfSort4(){
        int [] a = new int [];
        a = {8, 9, 5, -1};
        assetEquals({5, -1, 8, 9});
    }

    @Test
    public void testSortOfSort5(){
        int [] a = new int [];
        a = {1, 0, -4, 8, 17};
        assetEquals({1, 0, -4, 8, 17});
    }
}
