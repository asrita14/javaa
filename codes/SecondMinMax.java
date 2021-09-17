public class SecondMinMax
{
	public static void main(String[] args) {
	    int [] arr=new int[args.length];
	    int i=0;
	    for(String s:args){
	        arr[i]=Integer.parseInt(s);
	        i++;
	    }
	    int max=arr[0];
	    int min=arr[0];
	    for(i=0;i<arr.length;i++){
	        if (arr[i]>max){
	            max=arr[i];
	        }
	        else if (arr[i]<min){
	            min=arr[i];
	        }
	    }
	        
	   int fmx=min;
	   int smx=min;
	   int fmn=max;
	   int smn=max;
	   for(i=0;i<arr.length;i++){
	       if (arr[i]>fmx){
	           smx=fmx;
	           fmx=arr[i];
	       }
	       else if(arr[i]>smx){
	           smx=arr[i];
	       }
	       if(arr[i]<fmn){
	           smn=fmn;
	           fmn=arr[i];
	       }
	       else if(arr[i]<smn){
	           smn=arr[i];
	       }
	   }
	    System.out.println("First maximum in the array is : " + fmx);
	    System.out.println("Second maximum in the array is : " + smx);
	    System.out.println("First minimum element in the array is : " + fmn);
	    System.out.println("Second minimum element in the array is : " + smn);
}
}
