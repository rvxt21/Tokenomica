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
class Student(TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class ExcellentStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=1.1
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked

}
class GoodStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=1.0
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class GoodWithMinusStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=0.9
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class TreyStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=0.8
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class TwoStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=0.7
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class OneStudent(TokenAvailable:Int,TokenLocked:Int) extends Student(TokenLocked,TokenAvailable){
  private val miningRate:Double=0.1
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class Coaches(TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class Manager(TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class OwnersNodes(TokenAvailable:Int,TokenLocked:Int,TokenSkillMining:Int,NodeReserve:Int,Income:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
  private  var tokenSkillMining=TokenSkillMining
  private var nodeReserve=NodeReserve
  private var income=Income
}
class OwnerPlatform(SMInvestToken:Int,TokenICOStageEmission:Int,TokenICOStageForSale:Int,Reserve:Int,TokenSkillMining:Int,Income:Int,HolderEmission:Int){
  private var SMInvestoken=SMInvestToken
  private var tokenICOStageEmission=TokenICOStageEmission
  private var tokenICOStageForSale=TokenICOStageForSale
  private var reserve=Reserve
  private var tokenSkillMining=TokenSkillMining
  private var income=Income
  private var holderEmission=HolderEmission

}
class  Holders(TokenAvailable:Int,TokenLocked:Int) extends Participant(TokenLocked,TokenAvailable){
  private var tokenAvailable:Int=TokenAvailable
  private var tokenLocked:Int=TokenLocked
}
class StockExchange(Bought:Int,Sold:Int,Tokens:Int){
  private var bought=Bought
  private var sold=Sold
  private var tokens=Tokens
}
class Atribut(){
  private val Funds:Int=20
  private val allMonth:Int=43
  private val basicNeeds:Int=0
  private val coefSoundnessDownBuy:Double=0.1
  private val coefSoundnessDownSell:Double=0.1
  private val coefSoundnessUpBuy:Double=0.05
  private val coefSoundnessUpSell:Double=0.05
  private val fundPrice:Int=20
  private val holdRation2:Double=0.1
  private val holderEmssionMonth:Int=1
  private val holderRation:Double=0.3
  private val holdersUnlock:Any=0
  private val koefNeeds:Double=0.9
  private val koefSM:Double=0.5






}
