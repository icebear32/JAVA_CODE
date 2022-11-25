public class StringExercise03 {
        public static void main(String[] args) {
                String s1 = "ygh";	//指向常量池的 "ygh"
                String s2 = "java";	//指向常量池的 "java"
                String s3 = "java";	//指向常量池的 "java"
                String s4 = new String("java");	//指向堆中对象

                System.out.println(s2 == s4);   //false
                System.out.println(s2 == s3);   //true
                System.out.println(s2.equals(s4));      //true
                System.out.println(s1 == s2);   //false
        }
}