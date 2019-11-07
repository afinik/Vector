public class Stack<E> extends Vector {
    public int size;

    public void push(E e){
        int i = size;
        if (obj.length <= size){
            expand();
        }
        if (size == 0) {
            obj[i] = (E) e;
            size++;
        }else {
            do {
                obj[i] = (E) obj[i-1];
                i--;
            }
            while (i > 0);
            obj[i] =(E) e;
            size++;
        }
    }

    public E pop(){
        if (size == 0){
            return null;
        }
        E tmp = (E) obj[size - 1];
        return tmp;
    }

}
