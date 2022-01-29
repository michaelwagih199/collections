package pli;

class One{
    int i = 1;
    public int getInt(){
        return i;
    }
}

class Two extends One{
    int i = 2;
    public int getInt(){
        return i;
    }
}
public class PoliTut{
    public static void main(String[] args) {
        One one = new One();
        Two two = (Two)one;
        System.out.println( two.getInt() );
    }
}