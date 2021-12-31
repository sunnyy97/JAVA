abstract class PT {   			   //추상클래스 사용
  int money;    			  //money = 시급 ( 멤버객체 생성)
  String name; 		                      //PT 구별은 이름으로 한다.
  int total;        			 //total은 누적된 근무 시간을 뜻함.
  int total_money;     			 //이번 달 총 급여


 public PT(String name, int money) {      //생성자 생성(PT 이름, 본인 시급)
    this.name = name;
    this.money = money;
    
 }

 abstract void total_money();  	 //총 급여 출력 메소드.

 void work_time(int time) {
    this.total += time;         		//일한 시간은 누적!!
  }

 }

 

class higher_PT extends PT {
   higher_PT (String name, int money) {
      super(name,money);        		 //생성자 오버로딩
   }

   void total_money(){         		//메소드 오버라이딩을 통해 추상메소드 탈출!
      total_money = total * money;

     System.out.println(name + " 알바생의 이번 달 총 급여는 " + total_money + "원 입니다." );
   }
}

class middle_PT extends PT{
    middle_PT(String name, int money) {
      super(name,money);    		     //생성자 오버로딩
    }

   void total_money() {        		 //메소드 오버라이딩을 통해 추상메소드 탈출!
     total_money = total * money;

     System.out.println(name + " 알바생의 이번 달 총 급여는 " + total_money + "원 입니다." );
   }
 }



class lower_PT extends PT{
    lower_PT(String name, int money) {
      super(name,money);    		     //생성자 오버로딩
    }

   void total_money() {        		 //메소드 오버라이딩을 통해 추상메소드 탈출!
     total_money = total * money;

     System.out.println(name + " 알바생의 이번 달 총 급여는 " + total_money + "원 입니다." );
   }
 }



    


class Twosome {
  public static void main(String[] args) {

System.out.println("--------------------------------------------------");
 
   higher_PT sun = new higher_PT("이선희", 9000);      //높은 시급을 받는 알바생 객체
   
   sun.work_time(25);   //첫번째 주 일한 시간
   sun.work_time(20);   //두째 주 일한 시간
   sun.work_time(32);   //세번째 주 일한 시간
   sun.work_time(15);   //네번째 주 일한 시간
   sun.total_money();   //총 급여 출력
    

   middle_PT kim = new middle_PT("김명민", 7500);      //낮은 시급을 받는 알바생 객체
   
   kim.work_time(25);   //첫번째 주 일한 시간
   kim.work_time(20);   //두째 주 일한 시간
   kim.work_time(32);   //세번째 주 일한 시간
   kim.work_time(15);   //네번째 주 일한 시간
   kim.total_money();   //총 급여 출력



   lower_PT hong = new lower_PT("홍길동", 6000);      //낮은 시급을 받는 알바생 객체
   
   hong.work_time(25);   //첫번째 주 일한 시간
   hong.work_time(20);   //두째 주 일한 시간
   hong.work_time(32);   //세번째 주 일한 시간
   hong.work_time(15);   //네번째 주 일한 시간
   hong.total_money();   //총 급여 출력

System.out.println("--------------------------------------------------");

   }
}                 //Twosome 클래스 끝.

    