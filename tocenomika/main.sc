import jdk.internal.org.objectweb.asm.util.Printer

import java.net.UnknownServiceException
import scala.util.Random

class Participant(TokenAvailable:Int,TokenLocked:Int){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  def SetTokenLocked(newToken:Int):Unit={
      tokenLocked=newToken
  }
  def SetTokenAvailable(newTokenA:Int):Unit={
      tokenAvailable=newTokenA
  }
  def GetTokenLocked():Int={
    return tokenLocked
  }
  def GetTokenAvailable():Int={
    return tokenAvailable
  }
  def PrintInfoParticipant():Unit={
    println("Token available: "+tokenAvailable+"\nToken locked: "+tokenLocked)
  }
}

class User(TokenLocked:Int,TokenAvailable:Int,CoursePriCe:Int,CoefficientMining:Double,OpportunityToPay:Int) extends Participant(TokenLocked,TokenAvailable){
  private var coefficientMining:Double=CoefficientMining
  private var coursepriCe:Int=CoursePriCe
  private var opportunityToPay:Int=OpportunityToPay
  private var tokenAvailable:Double=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  private val coefficients=Array(1.1,1,0.8,0.5,0.1)
  def SetCoefficientMining(newCoeff:Double):Unit={
    coefficientMining=newCoeff
  }
  def SetCoursePriCe(newPrice:Int):Unit={
    coursepriCe=newPrice
  }
  def SetOpportunityToPay(newValue:Int):Unit={
    opportunityToPay=newValue
  }
  def GetCoefficientMining():Double={
    return coefficientMining
  }
  def GetCoursePriCe():Int= {
    return coursepriCe
  }
  def GetOpportunityToPay():Double={
    return opportunityToPay
  }
  def PrintInfoUser():Unit={
    println("Token available: "+tokenAvailable+"\nToken locked: "+tokenLocked+"\nCoefficient mining: "+coefficientMining)
  }
  def ThisMonth():Unit={
    tokenAvailable=tokenAvailable-coursepriCe+opportunityToPay*coefficientMining
    coefficientMining=Random.shuffle(coefficients.toList).head
    println("Coefficient: "+coefficientMining)
    println("This month tokens: "+tokenAvailable)
  }
}

class Teacher(TokenLocked:Int,TokenAvailable:Int,CoursePrice:Int,TokensForManager:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Double=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  private var coursePrice:Int=CoursePrice
  private var tokensForManager:Int=TokensForManager
  def SetCoursePrice(newPrice:Int):Unit={
    coursePrice=newPrice
  }
  def SetTokensForManager(newManager:Int):Unit={
    tokensForManager=newManager
  }
  def GetTokensForManager():Int={
    return tokensForManager
  }
  def GetCoursePrice():Int={
    return coursePrice
  }
  def ThisMonth():Unit={
    tokenAvailable=tokenAvailable+coursePrice-tokensForManager
    println("This month tokens: "+tokenAvailable+"\t")
  }
  def PrintInfoUser():Unit={
    println("Token available: "+tokenAvailable+"\nToken locked: "+tokenLocked+"\nCourse price: "+coursePrice+"\n")
  }
}

class Manager(PriceWork:Int,TokensForAdd:Int,TokensForSalary:Int,TokenLocked:Int,TokenAvailable:Int) extends Participant(TokenLocked:Int,TokenAvailable:Int) {
  private var priceWork:Int=PriceWork;
  private var tokensForAdd:Int=TokensForAdd;
  private var tokensForSalary:Int=TokensForSalary;
  private var tokenAvailable:Double=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  def SetPriceWork(NewPriceWork:Int):Unit={
    priceWork=NewPriceWork;
  }
  def SetTokensForAdd(AddPrice:Int):Unit={
    tokensForAdd=AddPrice;
  }
  def SetTokensForSalary(NewSalary:Int):Unit={
    tokensForSalary=NewSalary
  }
  def GetTokensForSalary():Unit={
    return tokensForSalary
  }
  def GetTokensForAdd():Unit={
    return tokensForAdd
  }
  def GetPriceWork():Unit={
    return priceWork
  }
  def ThisMonth():Unit={
    tokenAvailable=tokenAvailable+priceWork-tokensForAdd+tokensForSalary
    println("This month tokens: "+tokenAvailable+"\n")
  }
  def PrintInfoManager():Unit={
    println("Work price: "+priceWork+"\nTokens for add: "+tokensForAdd+"\nTokens for salary: "+tokensForSalary);
  }
}
class Exchange(TokenLocked:Int,TokenAvailable:Int) extends Participant(TokenLocked:Int,TokenAvailable:Int) {
}
class Node(Reserv:Int,TokenLocked:Int,TokenAvailable:Int) extends Participant(TokenLocked:Int,TokenAvailable:Int) {
  private var reserv:Int=Reserv
  def SetReservValue(NewValue:Int):Unit={
    reserv=NewValue
  }
  def GetReservValue(): Unit ={
    return reserv
  }

}
var user1=new User(10,12,5,1.1,10)
var i=0
for (i<-0 to 3){
  user1.ThisMonth()
}