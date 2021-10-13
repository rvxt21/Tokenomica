import jdk.internal.org.objectweb.asm.util.Printer

import java.net.UnknownServiceException
class Participant(a:Int,b:Int){
  private var tocenLocked:Int=a;
  private var tocenAvailable:Int=b;

  def TocenLocked=tocenLocked;
  def TocenAvailable=tocenAvailable;
  def PrintInfo(): Unit ={
    println(tocenLocked,tocenAvailable)
  }

}
class User(x:Int,y:Double,z:Int,a:Int,b:Int) extends Participant(a:Int,b:Int) {

  private var numOfUsers:Int=x;
  private var coefficientMining:Double=y;
  private var opportunityToPay:Int=z;
  def NumOffUsers=numOfUsers;
  def CoefficientMining=coefficientMining;
  def PrintInform(): Unit ={
    println(numOfUsers,coefficientMining,opportunityToPay,a,b)
  }
}
var u=new User(10,1.1,50,1,2);
u.PrintInform();