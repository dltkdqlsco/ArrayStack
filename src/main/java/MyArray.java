public class MyArray {

    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[10];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public void addElement(int num) {

        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num) {
        if(position < 0 || position > ARRAY_SIZE){
            System.out.println("insert error");
            return;
        }

        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }

        for(int i = count - 1; i >= position; i--){
            intArr[i + 1] = intArr[i];
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {

        int ret = ERROR_NUM;

        if(isEmpty()){
            System.out.println("There is no Element");
            return ret;
        }

        if(position < 0 || position >= count){
            System.out.println("remove Error");
            return ret;
        }

        ret = intArr[position];

        for(int i = position; i < count - 1; i++){
            intArr[i] = intArr[i + 1];
        }

        count--;

        return ret;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        if(count == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int getElement(int position) {

        if(position < 0 || position >= count){
            System.out.println("get Error");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll() {
        for(int i = 0; i < count; i++){
            System.out.println(i+1 + " : " + intArr[i]);
        }
    }

    public void removeAll(){
        for(int i = 0; i < count; i++){
            intArr[i] = 0;
        }

        count = 0;
    }

}