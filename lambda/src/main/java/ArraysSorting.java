public class ArraysSorting {

    public static void main(String[] args) {

        ArraysSorting as = new ArraysSorting();
//        as.sort();

        QuickSort qs = new QuickSort();
        BubleSort bs = new BubleSort();
        as.sortThis(qs);
        as.sortThis(bs);

//        MyLambda myLambda = () -> System.out.println("Sorting the array");
//        Sorting myLambda2 = () -> System.out.println("Sorting the array2");

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        System.out.println("===============with Lambda===========");
        Sorting quicksort = () -> System.out.println("Quick sorting with lamb");
        as.sortThis(quicksort);

        Sorting bublesort = () -> System.out.println("Buble sorting with lamb");
        as.sortThis(bublesort);

        System.out.println("=============Another generic method===========");
        as.sortThat(qs);
    }


    private void sortThis(Sorting sorting){
        sorting.sort();
    }

    private <T extends Sorting> void sortThat(T t){
        t.sort();
    }

}

//interface MyLambda{
//    void print();
//}

