import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
       Singleton s = Singleton.createInstance();
       Singleton y = Singleton.createInstance();
       System.out.println(s.equals(y));
  }
}


class Singleton {
  public int data;
 private static Singleton instance = null;
  
private Singleton()
{
  this.data = 10;
}

public static Singleton createInstance()
{
  if(instance == null){
    instance = new Singleton();
    return instance;
  }
  return instance;
  }
}
  


