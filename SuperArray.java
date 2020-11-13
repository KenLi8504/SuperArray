public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){
    data = new String [10] ;
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new IllegalArgumentException("Your capacity " +  initialCapacity+ " is negative");
    }
    data = new String[initialCapacity];
    size = 0;
  }

  int size (){
    return size;
  }

  public boolean add (String element){
    if (size != data.length){
      data[size] = element;
      size = size + 1;
      return true;
    }
    else {
      resize ();
      data[size] = element;
      size = size + 1;
      return true;
    }
  }

  public String get(int index){
    if (index < 0){
      throw new IndexOutOfBoundsException("Your index " + index + " is negative");
    }
    if (index >= size()){
      throw new IndexOutOfBoundsException("Your index " + index + " is larger than the size");
    }
    return data[index];
  }

  public String set(int index, String element){
    if (index < 0){
      throw new IndexOutOfBoundsException("Your index " + index + " is negative");
    }
    if (index >= size()){
      throw new IndexOutOfBoundsException("Your index " + index + " is larger than the size");
    }
    String a = data[index];
    data[index] = element;
    return a;
  }

  private void resize (){
    String data2 [] = new String [size + data.length/2 + 1];
    for (int i = 0; i < size; i ++){
      data2[i] = data[i];
    }
    data = data2;
  }

  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    return false;
  }

  public void clear(){
    String data2 [] = new String[10];
    data = data2;
    size = 0;
  }

  public String toString(){
    String a = "[";
    if ( size != 0){
      a = a + data[0];
    }
    for (int i = 1; i < size; i ++){
      a = a + ", " + data[i];
    }
    a = a + "]";
    return a;
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i ++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element){
    if (index < 0){
      throw new IndexOutOfBoundsException("Your index " + index + " is negative");
    }
    if (index > size()){
      throw new IndexOutOfBoundsException("Your index " + index + " is larger than the size");
    }
    String [] data2;
    if (data.length == size){
      data2 = new String [data.length * 3 / 2];
    }
    else {
      data2 = new String [data.length];
    }
    for (int i = 0; i < index; i ++){
      data2[i] = data[i];
    }
    data2[index] = element;
    for (int i = index; i < data.length - 1; i ++){
      data2[i + 1] = data[i];
    }
    data = data2;
    size = size + 1;
  }

  public String remove(int index){
    if (index < 0){
      throw new IndexOutOfBoundsException("Your index " + index + " is negative");
    }
    if (index >= size()){
      throw new IndexOutOfBoundsException("Your index " + index + " is larger than the size");
    }
    String [] data2 = new String [data.length];
    int j = 0;
    for (int i = 0; i < size; i++){
      if (i != index){
        data2[j] = data[i];
        j++;
      }
    }
    String removed = data[index];
    data = data2;
    size = size - 1;
    return removed;
  }

  public int indexOf(String s){
    int a = -1;
    for (int i = size - 1; i >= 0; i--){
      if (data[i].equals(s)){
        a = i;
      }
    }
    return a;
  }

  public String [] toArray (){
    String [] data2 = new String [size];
    for (int i = 0; i < size; i++){
      data2 [i] = data[i];
    }
    return data2;
  }

  public int lastIndexOf(String value){
    int a = -1;
    for (int i = 0; i < size; i++){
      if (data[i].equals(value)){
        a = i;
      }
    }
    return a;
  }

  public boolean equals(SuperArray other){
    int CountDiffElements = 0;
    if (size == other.size()){
      for (int i = 0; i < size; i++){
        if (data[i].equals(other.get(i))){
          CountDiffElements = CountDiffElements;
        }
        else{
          CountDiffElements++;
        }
      }
    }
    return CountDiffElements == 0;
  }
}
