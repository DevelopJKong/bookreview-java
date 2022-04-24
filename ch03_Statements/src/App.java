public class App {
  public static void main(String[] args) throws Exception {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    //1. 간격을 두고 접근하기 (예: 짝수만 출력)
    for (int i = 0; i < numbers.length; i += 2) {
        System.out.println("짝수: " + numbers[i]);
    }
    
    System.out.println("=================================");
    //2. 역순으로 접근하기
    for (int i = 0; i < numbers.length; i++) {
        int number = numbers[numbers.length - 1 - i];
        System.out.println("숫자: " + number);
    }
  }
}
