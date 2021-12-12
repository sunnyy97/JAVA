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
      System.out.println("�о���� ���ڴ�" + num);
    } catch (EmptyData e) {
      System.out.println("�����Ͱ� �Էµ��� �ʾҾ��!");
    } catch (MinusException e ) {
      System.out.println("����� �Է��ϼ���!");
    } catch (NumberFormatException e) {
      System.out.println("���ڸ� �Է��Ͻÿ�!");  
    }
 }
}
 	