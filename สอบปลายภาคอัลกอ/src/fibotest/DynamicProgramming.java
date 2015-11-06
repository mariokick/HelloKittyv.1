package fibotest;

public class DynamicProgramming {
	//นายปิยวัตร์ พุ่มพวง 564259135 56/36

		public static void main(String[] args) {
			 
	        int n= 10;
	        //fibonacci
	        System.out.println("fibonacci");
	        for (int i = 1; i <=n; i++)
	            System.out.println(i + ": " + fibonacci(i));
	        //fibonacci topdown
	        System.out.println("fibonacci topdown");
	        for(int i=0;i<n+1;i++){
	        	System.out.println(i + ": " + fibonaccitopdown(i));
	      
	        }
	        //fibonaccibottomup
	        System.out.println("fibonacci Bottom up ");
	        for(int i=2;i<=n;i++){
	        	System.out.println(i + ": " + fibonaccibottomup(i));
	      
	        }


	}

		public static int fibonaccibottomup(int n){
			
			int f0 = 0,f1=1,f2=1;
			for(int i=2;i<=n;i++){
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;


			}
			return f2;
			
	}
		public static int fibonacci(int n) {
			
			 if (n<2) return n; 
		
				
			 else return fibonacci(n-1) + fibonacci(n-2);
				
			 
			 }
		public static int fibonaccitopdown(int n) {
			
			int F[]= new int [n+1];
			
				 if (n<2) return n;

				 if (F[n]>0) return F[n]; 
				 
				return F[n] = fibonaccitopdown(n-1) + fibonaccitopdown(n-2);
					
		}


	}

	/*
	fibonacci
	1: 1
	2: 1
	3: 2
	4: 3
	5: 5
	6: 8
	7: 13
	8: 21
	9: 34
	10: 55
	fibonacci topdown
	0: 0
	1: 1
	2: 1
	3: 2
	4: 3
	5: 5
	6: 8
	7: 13
	8: 21
	9: 34
	10: 55
	fibonacci Bottom up 
	2: 1
	3: 2
	4: 3
	5: 5
	6: 8
	7: 13
	8: 21
	9: 34
	10: 55
	*/


