import java.util.Arrays;
public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i<s.size();){
      if (s.indexOf(s.get(i)) == i){
        i++;
      }
      else{
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray Intersection = new SuperArray();
    for (int i = 0; i < a.size(); i++){
      for (int j = 0; j < b.size(); j++){
        if (a.get(i).equals(b.get(j))){
          Intersection.add(a.get(i));
        }
      }
    }
    removeDuplicates(Intersection);
    return Intersection;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray Alternate = new SuperArray();
    int sizeA = a.size();
    int sizeB = b.size();
    int sizeC = 0;
    if (sizeA >= sizeB){
      sizeC = sizeB;
    }
    else{
      sizeC = sizeA;
    }
    for (int i = 0; i < sizeC; i++){
      Alternate.add(a.get(i));
      Alternate.add(b.get(i));
    }
    if (sizeA > sizeB){
      for (int i = sizeC; i < sizeA; i++){
        Alternate.add(a.get(i));
      }
    }
    else{
      for (int i = sizeC; i < sizeB; i++){
        Alternate.add(b.get(i));
      }
    }
    return Alternate;
  }

  public static void main(String[]args){
    //SuperArray TestForConstructor = new SuperArray(-1);

    //SuperArray TestForGet = new SuperArray (10);
    //TestForGet.add("0");
    //TestForGet.add("1");
    //TestForGet.add("2");
    //TestForGet.add("3");
    //System.out.println(TestForGet.get(4));
    //System.out.println(TestForGet.get(-1));
    //SuperArray TestForGet2 = new SuperArray (0);
    //System.out.println(TestForGet2.get(0));
    //SuperArray TestForGet3 = new SuperArray (4);
    //TestForGet3.add("0");
    //TestForGet3.add("1");
    //TestForGet3.add("2");
    //TestForGet3.add("3");
    //System.out.println(TestForGet3.get(4));

    //SuperArray TestForSet = new SuperArray ();
    //TestForSet.add("0");
    //TestForSet.add("1");
    //TestForSet.add("2");
    //TestForSet.add("3");
    //TestForSet.set(6,"hi");
    //TestForSet.set(-1,"hi");
    //SuperArray TestForSet2 = new SuperArray ();
    //TestForSet2.set(0,"hi");

    //SuperArray TestForAdd = new SuperArray ();
    //TestForAdd.add("hi");
    //TestForAdd.add("hola");
    //TestForAdd.add("ni hao");
    //TestForAdd.add("salve");
    //TestForAdd.add(6,"konichiwa");
    //TestForAdd.add(0,"yeet");
    //TestForAdd.add(-1,"hello");
    //SuperArray TestForAdd2 = new SuperArray ();
    //TestForAdd2.add(0,"hello");

    //SuperArray TestForRemove = new SuperArray ();
    //TestForRemove.add("0");
    //TestForRemove.add("1");
    //TestForRemove.add("2");
    //TestForRemove.add("3");
    //TestForRemove.remove(4);
    SuperArray TestForRemove2 = new SuperArray ();
    TestForRemove2.remove(0);
 }
}
