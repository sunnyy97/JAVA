abstract class PT {   			   //�߻�Ŭ���� ���
  int money;    			  //money = �ñ� ( �����ü ����)
  String name; 		                      //PT ������ �̸����� �Ѵ�.
  int total;        			 //total�� ������ �ٹ� �ð��� ����.
  int total_money;     			 //�̹� �� �� �޿�


 public PT(String name, int money) {      //������ ����(PT �̸�, ���� �ñ�)
    this.name = name;
    this.money = money;
    
 }

 abstract void total_money();  	 //�� �޿� ��� �޼ҵ�.

 void work_time(int time) {
    this.total += time;         		//���� �ð��� ����!!
  }

 }

 

class higher_PT extends PT {
   higher_PT (String name, int money) {
      super(name,money);        		 //������ �����ε�
   }

   void total_money(){         		//�޼ҵ� �������̵��� ���� �߻�޼ҵ� Ż��!
      total_money = total * money;

     System.out.println(name + " �˹ٻ��� �̹� �� �� �޿��� " + total_money + "�� �Դϴ�." );
   }
}

class middle_PT extends PT{
    middle_PT(String name, int money) {
      super(name,money);    		     //������ �����ε�
    }

   void total_money() {        		 //�޼ҵ� �������̵��� ���� �߻�޼ҵ� Ż��!
     total_money = total * money;

     System.out.println(name + " �˹ٻ��� �̹� �� �� �޿��� " + total_money + "�� �Դϴ�." );
   }
 }



class lower_PT extends PT{
    lower_PT(String name, int money) {
      super(name,money);    		     //������ �����ε�
    }

   void total_money() {        		 //�޼ҵ� �������̵��� ���� �߻�޼ҵ� Ż��!
     total_money = total * money;

     System.out.println(name + " �˹ٻ��� �̹� �� �� �޿��� " + total_money + "�� �Դϴ�." );
   }
 }



    


class Twosome {
  public static void main(String[] args) {

System.out.println("--------------------------------------------------");
 
   higher_PT sun = new higher_PT("�̼���", 9000);      //���� �ñ��� �޴� �˹ٻ� ��ü
   
   sun.work_time(25);   //ù��° �� ���� �ð�
   sun.work_time(20);   //��° �� ���� �ð�
   sun.work_time(32);   //����° �� ���� �ð�
   sun.work_time(15);   //�׹�° �� ���� �ð�
   sun.total_money();   //�� �޿� ���
    

   middle_PT kim = new middle_PT("����", 7500);      //���� �ñ��� �޴� �˹ٻ� ��ü
   
   kim.work_time(25);   //ù��° �� ���� �ð�
   kim.work_time(20);   //��° �� ���� �ð�
   kim.work_time(32);   //����° �� ���� �ð�
   kim.work_time(15);   //�׹�° �� ���� �ð�
   kim.total_money();   //�� �޿� ���



   lower_PT hong = new lower_PT("ȫ�浿", 6000);      //���� �ñ��� �޴� �˹ٻ� ��ü
   
   hong.work_time(25);   //ù��° �� ���� �ð�
   hong.work_time(20);   //��° �� ���� �ð�
   hong.work_time(32);   //����° �� ���� �ð�
   hong.work_time(15);   //�׹�° �� ���� �ð�
   hong.total_money();   //�� �޿� ���

System.out.println("--------------------------------------------------");

   }
}                 //Twosome Ŭ���� ��.

    