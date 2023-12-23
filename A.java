class A
{
	public static void main(String Args[])
	{
		String x ="NITIN";
		int i=0, j=x.length()-1;
		while(i<j)
		{
			if(x.charAt(i)!=x.charAt(j))
			{
			System.out.println("NO");
			System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("YES");
	}
}