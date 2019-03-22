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
    String s = "";
    if (e < a) {
      for (int a = start; a < size(); a++) {
        s += data[a];
      }
      for (int b = 0; b < e; b++) {
        s += data[b];
      }
    }
    else {
      for (int c = start; c < e; c++) {
        s += data[c];
      }
    }
    return s;

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
