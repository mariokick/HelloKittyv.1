package OOPLab002;

public class Perimeter {
double Perimeter ;
void findPerimeter(double width,double long1){
	Perimeter = 2*(width+long1);
}
void random(double maxrandom ){
	int mathrandom1 ;
	mathrandom1 = 0 + (int)(Math.random() * (maxrandom));

}
double getPerimeter(){
	return Perimeter;
}
}

