package IneuronAssignmetn1;
//1.Write a program(WAP) to print INEURON using pattern programming logic

public class Assignment1Qno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =11;
		for(int i=0;i<n;i++) {
			
			// For I
			for(int j=0;j<n;j++) {
				if(i==n/4&&j>=n/4&&j<=3*n/4||i==3*n/4&&j>=n/4&&j<=3*n/4||j==(n-1)/2&&i>n/4&&i<3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//For N
			
			for(int j=0;j<n;j++) {
				if(j==n/4&&i>=n/4&&i<=3*n/4||j==3*n/4&&i>=n/4&&i<=3*n/4||i==j&&j>n/4&&j<3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//For E 
			for(int j=0;j<n;j++) {
				if(i==n/4&&j>=n/4&&j<=3*n/4||i==3*n/4&&j>=n/4&&j<=3*n/4||i==(n-1)/2&&j>=n/4&&j<=3*n/4||j==n/4&&i>=n/4&&i<=3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//For U  i==n-1&&j>0&&j<n-1||j==n-1&&i<n-1
			
			for(int j=0;j<n;j++) {
				if(j==n/4&&i>=n/4&&i<3*n/4||j==3*n/4&&i>=n/4&&i<3*n/4||i==3*n/4&&j>n/4&&j<3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//for R    if(j==n/4&&i>=n/4&&i<=3*n/4||i==n/4&&j>=n/4&&j<3*n/4||j==3*n/4&&i>n/4&&i<(n-1)/2||i==(n-1)/2&&j>n/4&&j<3*n/4||i-j==(n-1)/2-1&&i>=(n-1)/2&&i<3*n/4&&j>=n/4&&j<3*n/4)
			for(int j=0;j<n;j++) {
				if(i==(n-1)/2&&j>n/4&&j<3*n/4||j==n/4&&i>=n/4&&i<=3*n/4||i==n/4&&j>n/4&&j<3*n/4||j==3*n/4&&i>n/4&&i<(n-1)/2||i==j&&i>n/2&&i<=3*n/4&&j>n/2)
				 {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//for O
			
			for(int j=0;j<n;j++) {
				if(j==n/4&&i>n/4&&i<3*n/4||i==n/4&&j>n/4&&j<3*n/4||i==3*n/4&&j>n/4&&j<3*n/4||j==3*n/4&&i>n/4&&i<3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//for N
			
			for(int j=0;j<n;j++) {
				if(j==n/4&&i>=n/4&&i<=3*n/4||j==3*n/4&&i>=n/4&&i<=3*n/4||i==j&&j>n/4&&j<3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}

	}

}
