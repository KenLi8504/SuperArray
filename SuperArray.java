public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){
    data = new String [10] ;
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public int size (){
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
    return data[index];
  }

  public String set(int index, String element){
    String a = data[index];
    data[index] = element;
    return a;
  }

  private void resize (){
    String data2 [] = new String [size + data.length/2];
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
    String [] data2 = new String [data.length];
    if (index == 0){
      
    }
    for (int i = 0; i < index; i++){
      data2[i] = data[i];
    }
    for (int i = index + 1; i < data.length; i++){
      data2[i-1] = data[i];
    }
    String a = data[index];
    data = data2;
    size = size - 1;
    return a;
  }

  public int indexOf(String s){
    int a = -1;
    for (int i = 0; i < size; i++){
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
}
