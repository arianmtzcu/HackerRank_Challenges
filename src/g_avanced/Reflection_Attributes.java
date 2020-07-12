package g_avanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Reflection_Attributes {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i=0; i<methods.length; i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

    class Student{
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void anothermethod(){  }

        //some more methods

    }

}