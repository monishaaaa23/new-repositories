package ascending;

public class Ascendingorder {
public static void ascendingOrder() {
	int temp;
	int a[]= {10,100,200,40,20};
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
			}
		}
	}
	System.out.println("ASCENDING ORDER");
	for(int j=0;j<a.length;j++) {
		System.out.println(a[j]);
	}
	int maximumNumber=a[a.length-1];
	System.out.println("maximum number is"+maximumNumber);
	int minimumNumber=a[0];
	System.out.println("minimum number is"+minimumNumber);
	int thirdMaxNumber=a[a.length-3];
	System.out.println("third maximum"+thirdMaxNumber);
	int thirdMinNumber=a[2];
	System.out.println("ThirdMinum"+thirdMinNumber);
}
public static void descendingOrder() {
	int temp;
	int a[]= {10,100,200,40,20};
	for(int i=0;i<a.length;i++) {
		for (int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	
		
	}
	System.out.println("descending order");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
	
}
public static void main(String[] args) {
	ascendingOrder();
	descendingOrder();
}
}