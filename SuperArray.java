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
}
