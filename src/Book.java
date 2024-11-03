//A few assumptions.......

//Words will be separated by spaces. 
//There can be punctuation in a word, we will only add/keep punctuation at the end of a string if it is at the end of a string.
//    for examples: Hello.==> Ellohay.    Good-bye! ==> Ood-byegay!    so... ==> osay...

public class Book
{
  public String pigLatin(String word)
  {
  String vowels = "aeiou";
    String first = word.substring(0,1);
    String second = word.substring(1,2);
    String pWord = "";

    //first letter is a vowel 
    if (vowels.idexOf(Character.toLowerCase(word.charAt(0))) != -1){
     pWord = word + "yay";
  }
      //first letter is a consanant and the second letter is a vowel 
    else if (vowels.IndexOf(first) < 0 && vowels.IndexOf(second) >= 0)
             {
               pWord = word.substring(1,word.length()) + first + "ay";
    }
   else if (vowels.IndexOf(second) < 0 && vowels.IndexOf(first) < 0)
   {
      pWord = word.Substring(2,word.length()) + first + second + "ay";

   }

    
  
  public int endPunctuation(String word)  //return the index of where the punctuation is at the end of a String. If it is all punctuation return 0, if there is no punctuation return -1
  {

    return -1;
  }

  public String translateWord(String word)    //to share with class
  {
    String convertedWord = "";

    return convertedWord;
  }

  public String translateSentence(String sentence)
  {
    String retSentence = "";


    return retSentence;
  }
}  
