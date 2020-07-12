package e_poo;

import java.util.*;


public class JavaIterator{

    static Iterator func(ArrayList mylist){
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)//Hints: use instanceof operator
                break;
        }
        return it;
    }

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}

/*
En este problema, debe completar un método func. El método toma una ArrayList como entrada. En esa ArrayList hay uno o más números enteros, luego hay una cadena especial "###", después de eso hay una o más cadenas adicionales. Un ejemplo de ArrayList puede verse así:
element[0]=>42
element[1]=>10
element[2]=>"###"
element[3]=>"Hello"
element[4]=>"Java"

Debe modificar el método func editando como máximo 2 líneas para que el código solo imprima los elementos después de la cadena especial "###". Para la muestra anterior, la salida será:
Hello
Java

Nota: El stdin no contiene la cadena "###", se agrega en el método principal.
Para restaurar el código original en el editor, haga clic en el icono superior izquierdo en el editor y cree un nuevo búfer.
 */