A simple repo for jni demo on Ubuntu. It may not be applicable for other Op systems like windows, centos or os x. So use with caution.

The demo function is add1(int a), return a+1


#how to use

## generate java bytecode file

   java JNIDemo.java

   javah JNIDemo

thus we get a JNIDemo.h 

## write c codes

rename JNIDemo.h to jni-demo.h for java and c follow different file name conventions.

implement add1(int) in jni-demo.c  and compile:

   gcc -shared -fpic -o libfoo.so -I/usr/lib/jvm/jdk1.7.0_67/include -I/usr/lib/jvm/jdk1.7.0_67/include/linux jni-demo.c

1.the jdk path varies, so change "/usr/lib/jvm/jdk1.7.0_67/" to your computer's jdk path.

2.notice that libfoo.so is forced required, just conventions in java on ubuntu if you want the java code {System.loadLibrary("foo") } function well. So if you want to load xxx in java, name the c binary to libxxx.so


## final

   java -Djava.library.path JNIDemo 1

console then shows :

2



