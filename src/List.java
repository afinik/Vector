public class List<E> extends Vector {
    public int size;

    public void add(E item){
        int i = size;
        if (obj.length <= size){
            expand();
        }
        obj[i] = (E) item;
        size++;
    }

    public void remove(int indx){
        E[] tmp = (E[]) new Object[size-1];
        System.arraycopy(obj, 0, tmp, 0, indx);
        System.arraycopy(obj, indx + 1, tmp, indx, size - indx - 1);
        obj = tmp;
    }

    public Object[] toArray(){
        return obj;
    }
}
