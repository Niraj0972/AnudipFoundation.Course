
class Addition{

    public int add(int a , int b){
        return a+b;
    }

        public int add(int a , int b , int c){
        return a+b+c;
    }

}
class MethodOverloading{
    public static void main(String[] args){
        Addition a = new Addition();
        int sum1 = a.add(10, 2);
        int sum2 = a.add(4, 5, 7);
        System.out.println("Addition of 2 numbers: "+sum1);
        System.out.println("Addition of 3 numbers: "+sum2);
    }
}
