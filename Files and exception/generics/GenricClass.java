class Test<T>{
    T obj;
    Test( T obj){
        this.obj = obj;
    }
    public T getObject(){
        return obj;
    }
}

class GenricClass {
    public static void main(String[] args){
        Test<Integer> ob1 = new Test<Integer>(15);
        System.out.println(ob1.getObject());

        Test<String> ob2 = new Test<String>("Hello");
        System.out.println(ob2.getObject());
    }
}
