package e_poo;

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());
        //String temp=define_me(); //Fix this line
        String temp=super.define_me();
        System.out.println("My ancestor is a cycle who is "+ temp );
    }
}

class MethodOverriding2{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}


 /*
 FIX PARA LOGRAR ESTO!... Adicionar super.!
 Hello I am a motorcycle, I am a cycle with an engine.
 My ancestor is a cycle who is a vehicle with pedals.*/