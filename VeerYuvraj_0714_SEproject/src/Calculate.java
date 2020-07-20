
public class Calculate {
	static int TotalAm;
	public static int calculateAmount(int Cost,int TaxPer)
	{
		TotalAm  = Cost + Cost * TaxPer /100;
		return TotalAm;
	}
}
