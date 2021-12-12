
class MinusException extends Exception {} // ����� ���� ����
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
      System.out.println("�о���� ���ڴ�" + num);

    } catch (MinusException e) {
	System.out.println("����� �Է��Ͻÿ�.");
    } catch (EmptyData e) {
	System.out.println("�����Ͱ� �Էµ��� �ʾҽ��ϴ�");
    }
    
 }
}
