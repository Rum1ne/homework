public class BinarySearchTest {
    public static void main(String[] args) {
//        String[] massive = {"apple", "brave", "chat", "demo", "echo",
//                "fox", "great", "hotel", "inn", "july", "kilt", "lmao"};
        Integer[] massive = {1, 2, 3, 4, 5, 999, 6845, 1};
        BinarySearch<Integer> searcher = new BinarySearch<>(massive);
        System.out.println(searcher.search(6845));
        System.out.println(searcher.search(7));
    }
}
