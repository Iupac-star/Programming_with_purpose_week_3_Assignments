public class DiscreteDistribution 
{
	public static void main(String[] args) 
	{
		int m = Integer.parseInt(args[0]);
		int [] n = new int[args.length-1];
		int [] cSum = new int[args.length];
		int [] rand = new int[m];
		int count = 1;
		int cCount = 1;
		int sum = 0;
		for(int i =0; i < n.length; i++)
		{
			n[i] = Integer.parseInt(args[count]);
			count++;
		}
		
		for(int j = 0; j < n.length; j++)
		{
			sum = sum + n[j];
			cSum[j+1] = sum;
		}

		for(int p = 0; p < m; p++) {	
				int r = (int)(1+Math.random()*cSum[cSum.length-1]);
				rand[p] = r;
		}
		
		
		for(int s = 0; s < m; s++) {
			
			for(int q = 1; q < n.length; q++) {
				if(rand[s] <= cSum[q-1]) {
					System.out.print(q+" ");
				}
				
			}
			
		}
		
	}  
} 
