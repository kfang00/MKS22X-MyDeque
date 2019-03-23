public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked") 
  public MyDeque(){
    data = (E[])new Object[10];
    int size = 0;
    int start = 0;
    int end = 0;
  }

  @SuppressWarnings("unchecked") 
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    int size = 0;
    int start = 0;
    int end = 0;
  }

  public int size(){
    return size;
  }

  public String toString(){
    String s = "{";
    if (size() == 0) {
      return "{}";
    }
    if (end < start) {
      for (int a = start; a < size(); a++) {
        s += data[a] + " ";
      }
      for (int b = 0; b <= end; b++) {
        s += data[b] + " ";
      }
    }
    else {
      for (int c = start; c <= end; c++) {
        s += data[c] + " ";
      }
    }
    return s + "}";

  }

  public void addFirst(E element){
    if (element == null) {
      throw new NullPointerException();
    }
    if (size() == 0) {
      data[start] = element;
      size += 1;
    }
    else if (start == 0) {
      if (end != (data.length - 1)) {
	data[data.length - 1] = element;
        start = (data.length - 1);
        size += 1;
      }
      else {
	resize();
        data[data.length - 1] = element;
        start = (data.length - 1);
        size += 1;
      }
    }
    else if (end < start) {
      if ((start - 1) != end) {
	data[start - 1] = element;
        start = start - 1;
        size += 1;
      }
      else {
	resize();
        data[data.length - 1] = element;
        start = (data.length - 1);
        size += 1;
      }
    }
    else {
      data[start - 1] = element;
      start = start - 1;
      size += 1;
    }

  }

  public void addLast(E element){
    if (element == null) {
      throw new NullPointerException();
    }
    if (size() == 0) {
      data[end] = element;
      size += 1;
    }
    else if (end == (data.length - 1)) {
      if (start != 0) {
	data[0] = element;
        end = 0;
        size += 1;
      }
      else {
	resize();
        data[end + 1] = element;
        end += 1;
        size += 1;
      }
    }
    else if (end < start) {
      if ((end + 1) != start) {
	data[end + 1] = element;
        end = end + 1;
        size += 1;
      }
      else {
	resize();
        data[end + 1] = element;
        end += 1;
        size += 1;
      }
    }
    else {
      data[end + 1] = element;
      end += 1;
      size += 1;
    }
  }

  public E removeFirst(){

  }

  public E removeLast(){

  }

  public E getFirst(){

  }

  public E getLast(){

  }

  private void resize(){

  }

}
