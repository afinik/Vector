public class Stack<E> extends Vector {
    public int size;

/*    public void push(E e){
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
    }*/

    public void push(E e){
        int i = size;
        if (obj.length <= size){
            expand();
        }
            obj[i] = (E) e;
            size++;

    }

    public E pop(){
        if (size == 0){
            return null;
        }else {
            E result = (E) obj[size - 1];
            E[] tmp = (E[]) new Object[size-1];
            System.arraycopy(obj, 0, tmp, 0, size - 1);
            E[] obj = tmp;
            return result;
        }
    }

    public E peek(){
        if (size == 0){
            return null;
        }else {
            E result = (E) obj[size - 1];
            return result;
        }
    }





}
