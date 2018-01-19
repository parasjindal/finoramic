public class Solution {
	public int pow(int x, int n, int d) {
	    
	    //System.out.println(-1%20);
	    
	    if(x==0){
	        return 0;
	    }
	    long y=x;
	    long r=1;
	    
	    while(n>0){
	        if(n%2==1){
	            r=((r%d)*(y%d))%d;
	            if(r<0){
	                r=r+d;
	            }
	        }
	        n=n/2;
	        y=(y%d)*(y%d)%d;
	        
	    }
	    return (int)r;
	}
}