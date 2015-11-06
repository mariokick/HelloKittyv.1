public class Rectangle {
	double width;
	double height;

	Rectangle() {
		width = 0;
		height = 0;
	}

	Rectangle(double w, double h) {
		if(w<=0 || h<=0){
			throw new 
			IllegalArgumentException();
		}
		width = w;
		height = h;

	}

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	double getArea() {
		return width * height;
	}
	void setWidth(double w){
		if(w<=0 ){
			throw new 
			IllegalArgumentException();
		}
		width= w;
	}

}
