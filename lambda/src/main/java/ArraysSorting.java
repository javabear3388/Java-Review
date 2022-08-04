public class ArraysSorting {

    public static void main(String[] args) {

        ArraysSorting as = new ArraysSorting();
//        as.sort();

        QuickSort qs = new QuickSort();
        BubleSort bs = new BubleSort();
        as.sort(qs);
        as.sort(bs);

    }


    private void sort(Sorting sorting){
        sorting.sort();
    }

}

