Public class TheDate
{
	private int month;
	private int year;
	private int day;
	PublicTheDate()
		{
		yea = 0;month = 0; day = 0;
		}
		publicTheDate(int year, int month, int day)
			{
			this.year = year;
			this.month = month;
			this.day = day;
			}
		public String goString()
			{
			return month + “” + day + “” + year;
			}
		}


		public class Driver
		{
		public static void main(String[] args)
			{
			TheDate bday1 = new TheDate(1,19,2001);
			TheDate bday2 = new TheDate(1,19,2001);
			System.out.println(bday1);
			System.out.println(bday2);
			}
}
