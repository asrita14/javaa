public class MaxCount
{
	public static void main(String[] args) {
		int [] arr={1,7,2,9,3,9,7,9,6,3,6};
int count=1,i,j,maxcount=0;
int n=arr.length;
for(i=0;i<n;i++){
	for(j=i+1;j<n;j++){
		if(arr[i]>arr[j]){
			int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
    }
  }
}
i=0;
while(i<n)
{
   count=1; 
   for(j=i+1;j<n;j++)
       if(arr[i]==arr[j])
          count++;
        else
          {
            if(count>maxcount)
                 maxcount=count;
             i=j;
             break;
           }
   if(j==n)
{
	if(count>maxcount)
               maxcount=count;
             i=j;
           
}
}

System.out.println("Max Count = "+maxcount);
	}
}