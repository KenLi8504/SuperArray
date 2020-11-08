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
 }
}
