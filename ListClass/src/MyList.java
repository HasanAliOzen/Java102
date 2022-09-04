import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int index ;
    private int capacity;

    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
        this.index = 0;
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
        this.index = 0;
    }

    public int size() {
        return index;
    }
    public int getCapacity() {
        return capacity;
    }
    public void add(T data){
        if (index == capacity){
            this.capacity *=2;
            T[] newArray = (T[]) new Object[getCapacity()];
            System.arraycopy(this.array, 0, newArray, 0, this.index);
            this.array = newArray;
        }
        this.array[index] = data;
        index++;
    }

    public T get(int index){
        return this.array[index];
    }

    public T remove(int index){
        if (this.array[index] == null){
            return null;
        }
        T removed = this.array[index];
        for (int i = index; i < this.index; i++) {
            this.array[i] = this.array[i+1];
            this.array[i+1] = null;
        }
        this.index--;
        return removed;
    }

    public T set(int index,T data){
        if (this.array[index] == null){
            return null;
        }
        return this.array[index] = data;
    }

    public String toString(){
        StringBuilder strValue = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            if(this.array[i] != null){
                strValue.append(this.array[i] + ",");
            }
        }
        if (strValue.lastIndexOf(",") > -1){
            strValue.deleteCharAt(strValue.lastIndexOf(","));
        }
        strValue.append("]");
        return strValue.toString();
    }

    public int indexOf(T data){
        for (int i = 0; i < index; i++) {
            if (data == this.array[i]){
                return i;
            }
        }
        return  -1;
    }

    public int lastIndexOf(T data){
        for (int i = index-1; i >= 0; i--) {
            if (data == this.array[i]){
                return i;
            }
        }
        return  -1;
    }

    public boolean isEmpty(){
        return this.index == 0;
    }
    public T[] toArray(){
        return this.array;
    }

    public void clear(){
        this.index = 0;
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    public MyList<T> subList(int start,int finish){
        MyList<T> newMyList = new MyList<>();
        for(int i = start; i<=finish; i++){
            newMyList.add(this.array[i]);
        }
        return newMyList;
    }

    public boolean contains(T data){
        for(T arr : this.array){
            if (arr == data) {
                return true;
            }
        }
        return false;
    }




}
