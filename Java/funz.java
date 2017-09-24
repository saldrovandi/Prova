public class funz{

    private static void blank(){
        System.out.print(" ");
    }

    private static void row(){
        System.out.println();
    }

    private static void print_array(int a[]){
        System.out.print("Array: [");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            blank();
        }
        System.out.print("]");
        row();
    }

    private static int even(int a){
        int check = -1;
        if(a % 2 == 0)
        check = 1;
        else
        check = 0;
        return check;
    }

    private static int odd(int a){
        int check = -1;
        if(a % 2 != 0)
        check = 0;
        else
        check = 1;
        return check;
    }

    private static void before_even(int a[]){
        System.out.print("Before moving even elements to left positions:");
        row();
        print_array(a);
    }

    private static void after_even(int a[]){
        System.out.print("After moving even elements to left positions:");
        row();
        print_array(a);
    }

    private static void before_odd(int a[]){
        System.out.print("Before moving odd elements to left positions:");
        row();
        print_array(a);
    }

    private static void after_odd(int a[]){
        System.out.print("After moving odd elements to left positions:");
        row();
        print_array(a);
    }

    public static void maximum(int max){
        System.out.print("Array's maximum value is: " + max);
        row();
        return;
    }

    public static void minimum(int min){
        System.out.print("Array's minimum value is: " + min);
        row();
        return;
    }

    private static int count_odds(int a[]){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(odd(a[i]) == 0)
            count++;
        }
        return count;
    }

    private static int count_evens(int a[]){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(even(a[i]) == 0)
            count++;
        }
        return count;
    }

    private static void evens(int count){
        System.out.print(count);
        System.out.print(" even elements moved to left positions...");
        row();
    }

    private static void odds(int count){
        System.out.print(count);
        System.out.print(" odd elements moved to left positions...");
        row();
    }

    public static int extract_max(int a[]){
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max)
            max = a[i];
        }
        return max;
    }

    public static int extract_min(int a[]){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min)
            min = a[i];
        }
        return min;
    }

    private static int getposition(int a[], int elem){
        int pos = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == elem)
            pos = i;
        }
        return pos;
    }

    private static void swap(int a[], int elem1, int elem2){
        int pos1 = getposition(a, elem1);
        int pos2 = getposition(a, elem2);
        if(pos1 != -1 && pos2 != -1){
            a[pos1] = elem2;
            a[pos2] = elem1;
        }
    }

    public static void move_evens(int a[]){
        int index = 0; 
        before_even(a);
        for(int i = 0; i < a.length; i++){
            if(even(a[i]) == 0){
                swap(a, a[i], a[index]);
                index++;
            }
        }
        evens(count_evens(a));
        after_even(a);
    }

    public static void move_odds(int a[]){
        int index = 0;
        before_odd(a);
        for(int i = 0; i < a.length; i++){
            if(odd(a[i]) == 0){
                swap(a, a[i], a[index]);
                index++;
            }
        }
        after_odd(a);
        evens(count_evens(a));
    }
}