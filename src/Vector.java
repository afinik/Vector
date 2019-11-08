public abstract class Vector<E> {
    private Integer size;
    public E[] obj;

    public Vector(Integer size) {
        obj = (E[]) new  Object[size];

        this.size = size;
    }

    public Vector() {this(10);
    }

    public Integer size() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    void expand(){
        E[] tmp = (E[]) new Object[obj.length*2+1];
        System.arraycopy(obj,0,tmp,0,obj.length);
        obj = tmp;
    }

    public void clear(){
        if (size == 0){
            return;
        }else {
            E[] obj = (E[]) new Object[size];
        }
    }

    public boolean contains(Object element){
        for (Object el: obj) {
            if (el.equals(element)){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        for (Object el: obj) {
            if(el != null){
                return false;
            }
        }
        return true;
    }
}
