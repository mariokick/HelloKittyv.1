package test5;

public class test {

		String  area[][] = new String [9][9];
		public void triangleArea() {
			
			for (int i = 0; i < area.length; i++) {
				for (int j = 0; j < area[i].length; j++) {
					if(j<i+1)
					{
						area[i][j]="x_";
					}else
					{
						area[i][j]="_";
					}
				}
			}
		}
		
		public void show1() {
			for (int i = 0; i < area.length; i++) {
				for (int j = 0; j < area[i].length; j++) {
					System.out.print(area[i][j]);
				}
				System.out.println();
			}
		
}
}



