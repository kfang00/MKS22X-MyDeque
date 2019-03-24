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
      throw new NullPointerException(); //if the specified element is null (this deque does not permit null elements)
    }
    if (size() == 0) { //if data is empty, add to the 0th index
      data[start] = element;
      size += 1;
    }
    else if (start == 0) {
      if (end != (data.length - 1)) {
	data[data.length - 1] = element; //if the front is full, add to the back if it has space
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
    else {
      if ((start - 1) != end) { //if start and end do not meet
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

  }

  public void addLast(E element){
    if (element == null) {
      throw new NullPointerException(); //if the specified element is null (this deque does not permit null elements)
    }
    if (size() == 0) { //if data is empty, add to the 0th index
      data[end] = element;
      size += 1;
    }
    else if (end == (data.length - 1)) {
      if (start != 0) { //if end is full, add to the front if it has space
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
    else {
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
  }

  public E removeFirst(){
    E hold;
    if (size() == 0) {
      throw new NoSuchElementException(); //if this deque is empty
    }
    if (size() == 1) {
      hold = data[start];
      start = 0;
      end = 0;
      size = size - 1;
    }
    if (start == (data.length - 1)) {
      hold = data[start];
      start = 0;
      size = size - 1;
    }
    else {
      hold = data[start];
      start += 1;
      size = size - 1;
    }
    return hold; //returns the removed element
  }

  public E removeLast(){
    E hold;
    if (size() == 0) {
      throw new NoSuchElementException(); //if this deque is empty
    }
    if (size() == 1) {
      hold = data[end];
      start = 0;
      end = 0;
      size = size - 1;
    }
    if (end == 0) {
      hold = data[end];
      end = data.length - 1;
      size = size - 1;
    }
    else {
      hold = data[end];
      end = end - 1;
      size = size - 1;
    }
    return hold; //returns the removed element
  }

  public E getFirst(){
    if (size() == 0) {
      throw new NoSuchElementException(); //if this deque is empty
    }
    return data[start]; //peek

  }

  public E getLast(){
    if (size() == 0) {
      throw new NoSuchElementException(); //if this deque is empty
    }
    return data[end]; //peek
  }

  private void resize(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[size() * 2]; //doubling the size
    int idx = 0;
    if (end < start) {
      for (int a = start; a < size(); a++) {
        d[idx] = data[a];
        idx++;
      }
      for (int b = 0; b <= end; b++) {
        d[idx] = data[b];
        idx++;
      }
    }
    else {
      for (int c = start; c <= end; c++) {
        d[idx] = data[c];
        idx++;
      }
    }
    start = 0;
    end = size() - 1;
    data = d;
  }

}
