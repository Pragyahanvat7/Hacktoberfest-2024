public class App {
    static int solve(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,4,5,6};
        for(int i=0; i<arr.length-1; i++){
            System.out.println(solve(arr[i], arr[i+1]));   
        }

    }
}
