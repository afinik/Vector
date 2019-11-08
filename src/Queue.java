public class Queue<E> extends Vector {
    public int size;

    public void add(E e){
        int i = size;
        if (obj.length <= size){
            expand();
        }
        obj[i] = (E) e;
        size++;
    }

    public E poll(E e){
        if (size == 0){
            return null;
        }else {
            E result = (E) obj[0];
            E[] tmp = (E[]) new Object[size-1];
            System.arraycopy(obj, 1, tmp, 0, size - 1);
            E[] obj = tmp;
            return result;
        }
    }

    public E peek(){
        return (E) obj[0];
    }


}
