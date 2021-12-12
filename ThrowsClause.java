
class MinusException extends Exception {} // 사용자 지정 예외
class EmptyData extends Exception{}

public class ThrowsClause {
  public static void main(String[] args) {

    try {
      int num;
      num = Integer.parseInt(args[0]);

      if(num < 0 ) 
	throw new MinusException();	
      if(args.length == 0)
	throw new EmptyData();	
      System.out.println("읽어들인 숫자는" + num);

    } catch (MinusException e) {
	System.out.println("양수를 입력하시오.");
    } catch (EmptyData e) {
	System.out.println("데이터가 입력되지 않았습니다");
    }
    
 }
}
