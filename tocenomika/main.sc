import jdk.internal.org.objectweb.asm.util.Printer

import java.net.UnknownServiceException
class Participant(TokenLocked:Int,TokenAvailable:Int){
  private var tokenLocked:Int=TokenLocked;
  private var tokenAvailable:Int=TokenAvailable;

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
class User(NumOfUsers:Int,CoefficientMining:Double,OpportunityToPay:Int,TokenLocked:Int,TokenAvailable:Int,CoursePrice:Int) extends Participant(TokenLocked:Int,TokenAvailable:Int) {

  private var numOfUsers:Int=NumOfUsers;
  private var coefficientMining:Double=CoefficientMining;
  private var opportunityToPay:Int=OpportunityToPay;
  def NumOffUsers=numOfUsers;
  def SetNumOfUsers(NewNum:Int):Unit={
    numOfUsers=NewNum;
  }
  def CoefficientMining=coefficientMining;
  def SetCoefficientOfMining(NewCoefficient:Int):Unit={
    coefficientMining=NewCoefficient;
  }
  def TokenMinus(b:Int):Unit={
    TokenAvailable-CoursePrice;
  }
  def PrintInform(): Unit ={
    println(numOfUsers,coefficientMining,opportunityToPay,TokenLocked,TokenAvailable)
  }
}
class Teacher(CoursePrice:Int,TokenLocked:Int,TokenAvailable:Int) extends Participant(TokenLocked:Int,TokenAvailable:Int) {
  private var coursePrice:Int=CoursePrice;
  def CoursePrice=coursePrice;
  def NewCoursePrice(newValue:Int):Unit={
    coursePrice=newValue;
  }
  def TokensPlus(tokenAvailable:Int):Unit={
    tokenAvailable+coursePrice;
  }
  override def PrintInfo(): Unit = {
    println("Course price:"+coursePrice);
  }
}
class Manager(PriceWork:Int,TokensForAdd:Int,TokensForSalary:Int,TokenLocked:Int,TokenAvailable:Int) extends Participant(TokenLocked:Int,TokenAvailable:Int) {
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
class Node(tokenLocked:Int,tokenAvailable:Int) extends Participant(tokenLocked:Int,tokenAvailable:Int) {
  private var reserv:Int=0;
  def Reserv=reserv;
  def SetReservValue(NewValue:Int):Unit={
    reserv=NewValue;
  }
}
class Exchange(tokenLocked:Int,tokenAvailable:Int) extends Participant(tokenLocked:Int,tokenAvailable:Int) {
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


