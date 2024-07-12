public class HelloJNI { // Save as HelloJNI.java
    static {
      System.loadLibrary("hello");
      // Load native library hello.dll (Windows) or libhello.so (Unix)
      // This library contains a native method called sayHello()
    }
    
    // Declare a native method sayHello() which receives no parameters and returns void
    private native void sayHello();
    
    // Test Driver
    public static void main(String[] args) {
        // Create an instance and invoke the native method
      new HelloJNI().sayHello(); 
    }
   }
   