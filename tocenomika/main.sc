import jdk.internal.org.objectweb.asm.util.Printer

import java.net.UnknownServiceException
class Participant(a:Int,b:Int){
  private var tokenLocked:Int=a;
  private var tokenAvailable:Int=b;

  def TokenLocked=tokenLocked;
  def SetTokenLocked(NewTokenLocked:Int):Unit={
    tokenLocked=NewTokenLocked;
  }
  def TokenAvailable=tokenAvailable;
  def SetTokenAvailable(NewTokenAvailable:Int):Unit={
    tokenAvailable=NewTokenAvailable;
  }

  def PrintInfo(): Unit ={
    println(tokenLocked,tokenAvailable)
  }
}
class User(x:Int,y:Double,z:Int,a:Int,b:Int) extends Participant(a:Int,b:Int) {

  private var numOfUsers:Int=x;
  private var coefficientMining:Double=y;
  private var opportunityToPay:Int=z;
  def NumOffUsers=numOfUsers;
  def SetNumOfUsers(NewNum:Int):Unit={
    numOfUsers=NewNum;
  }
  def CoefficientMining=coefficientMining;
  def SetCoefficientOfMining(NewCoefficient:Int):Unit={
    coefficientMining=NewCoefficient;
  }
  def PrintInform(): Unit ={
    println(numOfUsers,coefficientMining,opportunityToPay,a,b)
  }
}
class Teacher(a:Int,b:Int) extends Participant(a:Int,b:Int) {
  private var coursePrice:Int=0;
  def CoursePrice=coursePrice;
  def NewCoursePrice(newValue:Int):Unit={
    coursePrice=newValue;
  }

  override def PrintInfo(): Unit = {
    println("Course price:"+coursePrice);
  }
}
class Manager(a:Int,b:Int) extends Participant(a:Int,b:Int) {
  private var priceWork:Int=0;
  private var tokensForAdd:Int=0;
  private var tokensForSalary:Int=0;
  def PriceWork=priceWork;
  def SetPriceWork(NewPriceWork:Int):Unit={
    priceWork=NewPriceWork;
  }
  def TokensForAdd=tokensForAdd;
  def SetTokensForAdd(AddPrice:Int):Unit={
    tokensForAdd=AddPrice;
  }
  def TokensForSalary=tokensForSalary;
  def SetTokensForSalary(NewSalary:Int):Unit={
    tokensForSalary=NewSalary;
  }
  def PrintInfoManager():Unit={
    println(priceWork,tokensForAdd,tokensForSalary);
  }
}
class Node(a:Int,b:Int) extends Participant(a:Int,b:Int) {
  private var reserv:Int=0;
  def Reserv=reserv;
  def SetReservValue(NewValue:Int):Unit={
    reserv=NewValue;
  }
}
class Exchange(a:Int,b:Int) extends Participant(a:Int,b:Int) {
}

class Operations(){}


  val ThisMonth:Int=0;
  val LastMonth:Int=36;
var user1=new User(1,1.1,1,10,5);
var teacher1=new Teacher(10,5);
def Monthly(monthly:Int,lastMonth:Int):Unit= {
  user1.SetTokenAvailable(5)
  teacher1.SetTokenAvailable(5)
  user1.PrintInform()
  teacher1.PrintInfo()
  while(monthly<lastMonth){
    monthly+1;
    println("Monthly:"+monthly)
  }
}

Monthly(1,36);


