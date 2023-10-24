public class ResizableArray {

    private Integer[] arr;
    private int capacity;
    private int size;

    public ResizableArray(){
        this.arr = new Integer[2];
        this.capacity = 2;
        this.size = 0;
    }

    public void push (int elementToPush){

        if (size < capacity){
            arr[size] = elementToPush;
            size++;
        }

        else {
            Integer[] newArr = new Integer[capacity*2];
            for (int i = 0; i<size;i++){
                newArr[i] = arr[i];
            }

            capacity = capacity*2;
            newArr[size] = elementToPush;
            size++;
            this.arr = newArr;
        }

    }

    public void printArray(){
        for (Integer num: arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }


}
