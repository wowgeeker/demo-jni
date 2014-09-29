
public class JNIDemo{
  
  public native int add1(int a);

  static{
    System.loadLibrary("foo");
  }

  public static void main(String[] args){
    int a=Integer.valueOf(args[0]);
    JNIDemo self=new JNIDemo();
    int result=self.add1(a);
    System.out.println(result);
  }

}
