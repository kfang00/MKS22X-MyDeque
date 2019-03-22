public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    E[] data = new E[];
    int size = 0;
    int start = 0;
    int end = 0;
  }
  public MyDeque(int initialCapacity){
    E[] data = new E[initialCapacity];
    int size = initialCapacity;
    int start = 0;
    int end = 0;
  }

  public int size(){
    return size;
  }

  public String toString(){

  }

  public void addFirst(E element){

  }

  public void addLast(E element){

  }

  public E removeFirst(){

  }

  public E removeLast(){

  }

  public E getFirst(){

  }

  public E getLast(){

  }

}
