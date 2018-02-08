import java.util.Scanner;
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Card Card_card1 = new Card(1,"Spread"); // 1st Type;
Card Card_card2 = new Card(2,"Spread");
Card Card_card3= new  Card(3,"Spread");
System.out.println(Card_card1.Suit+" "+Card_card1.number);
System.out.println(Card_card2.Suit+" "+Card_card2.number);
System.out.println(Card_card3.Suit+" "+Card_card3.number);

Card Card_cardtype2 =new Card(2,"Clover");//2nd type
Card Card_cardtype3=new Card(3,"Clover");
Card Card_cardtype1 =new Card(1,"Clover");
System.out.println(Card_cardtype2.Suit+" "+Card_cardtype2.number);
System.out.println(Card_cardtype3.Suit+" "+Card_cardtype3.number);
System.out.println(Card_cardtype1.Suit+" "+Card_cardtype1.number);

Card Card_cardItype3 = new Card(3,"Diamond");
Card Card_cardItype1 = new Card(1,"Diamond");//3rd
Card Card_cardItype2= new Card(2,"Diamond");
Card Lucky=new Card (4,"Diamond");
System.out.println(Card_cardItype3.Suit+" "+Card_cardItype3.number);
System.out.println(Card_cardItype1.Suit+" "+Card_cardItype1.number);
System.out.println(Card_cardItype2.Suit+" "+Card_cardItype2.number);

Scanner scan= new Scanner(System.in);
System.out.println("Enter Card Suit");
String CardSuit= scan.nextLine();
System.out.println("Enter Card Number");
int CardName=scan.nextInt();

if (CardName==Lucky.number&& CardSuit.equals(Lucky.Suit)) {
System.out.println("You Win");
} else {
	System.out.println("You Lose");
}



}
}
