 class MinusException extends Exception{}
 class EmptyData extends Exception{}

  
 public class ExceptionExample2 {
  public static void main(String[] args) {
    try {
      int num;
      if(args.length == 0 )
	throw new EmptyData();
      num = Integer.parseInt(args[0]);
      if ( num < 0) 
	throw new MinusException();
      System.out.println("읽어들인 숫자는" + num);
    } catch (EmptyData e) {
      System.out.println("데이터가 입력되지 않았어요!");
    } catch (MinusException e ) {
      System.out.println("양수를 입력하세요!");
    } catch (NumberFormatException e) {
      System.out.println("숫자를 입력하시오!");  
    }
 }
}
 	