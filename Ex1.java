import java.util.ArrayList;
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add((int)(Math.random()*100));
        }
        System.out.println(list);

        for(int i = list.size()-1; i >= 0; i--){
            if (list.get(i)%2 == 0){
                list.remove(i);
        }
    }
    System.out.println(list);
}
}