
 class ThreadExample extends Thread {
  public ThreadExample (String name) {
    super(name);
  }

  public void run () {
    System.out.println(getName() + " �������Դϴ�.");
  }
 }

 public class TestThread {
  public static void main(String[] args) {
    ThreadExample t = new ThreadExample("�ڹ� ������");
    System.out.println("������ ���� ��");
    t.start();
    System.out.println("������ ���� ��");
  }
 }
