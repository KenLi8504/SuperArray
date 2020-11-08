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
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("kani");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("toro");
    System.out.println(words.lastIndexOf("kani"));
    System.out.println(words.lastIndexOf("uni"));
    System.out.println(words.lastIndexOf("ebi"));
    System.out.println(words.lastIndexOf("una"));
   System.out.println(words);
   removeDuplicates(words);
   System.out.println(words);
   SuperArray setA = new SuperArray();
   setA.add("9");
   setA.add("1");
   setA.add("2");
   setA.add("2");
   setA.add("3");
   setA.add("4");
   SuperArray setB = new SuperArray();
   setB.add("0");
   setB.add("4");
   setB.add("2");
   setB.add("2");
   setB.add("9");
   System.out.println( findOverlap(setA,setB));
   SuperArray SetC = new SuperArray();
   SuperArray SetD = new SuperArray();
   System.out.println(SetC.equals(SetD));
   System.out.println(words);
   System.out.println(setB);
   words.add("10");
   words.add("10");
   words.add("10");
   words.add("10");
   setB.add("test");
   System.out.println(zip(words,setB) );
 }
}
