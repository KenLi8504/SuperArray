public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){
    data = new String [10] ;
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
    String data2 [] = new String [size + 5];
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
    a = a + data[0];
    for (int i = 1; i < size; i++){
      a = a + "," + data[i];
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
}
