
public class Application {

	public static void main(String[] args) {
		Double Cerealprice = 5.22; //3 A Item Price
		Double Milkprice = 5.71; //3 A Item Price
		Double DebitCardBalance = 40.52; //3 B Amount of Money in Wallet
		Double CashBalance = 42.55; //3 B Amount of Money in Wallet
		int CloseFriends = 30; //3 C Number of friends
		int Acquaintances = 40; //3 C Number of friends
		int FriendsmodeAge = 28;  //3 D Age in years (as a whole number)
		int Personalage = 35; //3 D Age in years (as a whole number)
		String MyFirstName = "Sean"; //3 E First Name
		String BestFriendsFirstName = "Scott"; //3 E First Name
		String MyLastName = "Flaherty"; //3 F Last Name
		String BestFriendsLastName = "Rogers"; //3 F Last Name
		char mymiddleInitial = 'M'; //3 G Middle Initial
		char myBestFriendsmiddleInitial = 'E'; //3 G Middle Initial
				
	
Double NewWalletBalance = (DebitCardBalance + CashBalance) - (Cerealprice + Milkprice); //4 A:	New amount of money in wallet after buying the item
int AveragefriendsPerYear = (CloseFriends + Acquaintances) / (Personalage);	//4 B: Number of friends you’ve made each year based on your age variable and your number of friends variable
String fullName = MyFirstName + " " + mymiddleInitial + " " + MyLastName; //4 C: Full name based on first name, middle initial, and last name

		
		
		
		
		
		System.out.println("The price of cereal is $" + Cerealprice); //5
		System.out.println("The price of milk is $" + Milkprice);
		System.out.println("The amount on the debit card is $" + DebitCardBalance);//5
		System.out.println("The amount of cash on hand is $" + CashBalance);//5
		System.out.println("Number of true friends is " + CloseFriends);//5
		System.out.println("The number of casual friends is " + Acquaintances);//5
		System.out.println("The mode age of my group of friends is " + FriendsmodeAge);//5
		System.out.println("My age is " + Personalage);//5
		System.out.println("My first name is " + MyFirstName);//5
		System.out.println("My best friends name is " + BestFriendsFirstName);//5
		System.out.println("My last name is " + MyLastName);//5
		System.out.println("My best friends last name is " + BestFriendsLastName);//5
		System.out.println("My middle initial is " + mymiddleInitial);//5
		System.out.println("My best friends middle initial is " + myBestFriendsmiddleInitial);//5
		System.out.println("The balance of my wallet after the purchase of milk and cereal is $" + NewWalletBalance);//5
		System.out.println("The average friends I've made each year is " + AveragefriendsPerYear);//5
		System.out.println("My full first, middle initial and last name is " + fullName);//5
		
	}

}
