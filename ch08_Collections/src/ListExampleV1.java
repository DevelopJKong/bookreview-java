import java.util.ArrayList;
import java.util.List;

public class ListExampleV1 {
    static List<String> preparePlanetList() {
        List<String> p = new ArrayList<>();
        p.add("수정");
        p.add("금성");
        p.add("지구");
        return p;
    }



    public static void main(String[] args) {
        //0. 데이터 준비
        List<String> planets = preparePlanetList();

        //1. add(index, E) 메서드
        planets.add(3, "화성");
        System.out.println("화성 추가 후: " + planets);
        

        //2. addAll() 메서드
        List<String> otherPalnets = new ArrayList<>();
        otherPalnets.add("목성");
        otherPalnets.add("토성");
        otherPalnets.add("천왕성");
        planets.addAll(otherPalnets);
        System.out.println("행성 추가 후: " + planets);

        //3. clear() 메서드
        System.out.println("clear() 후: " + planets);

        //4. isEmpty() 메서드
        boolean isEmpty = planets.isEmpty();
        int size = planets.size();
        System.out.println("planets 리스트는 비어있는가? " + isEmpty + " > size? " + size);
        
    }
}
