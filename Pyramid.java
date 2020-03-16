import java.lang.Math.*;
class Pyramid {
  double l;
  double w;
  double h;
  public Pyramid(int l, int w, int h) {
    this.l = l;
    this.w = w;
    this.h = h;
  }
  public double getVolume(){
    double volVal;
    return volVal = (l*w*h)/3;
  }
  public double getSurfArea(){
   double SurfVal;
   double p1 = ((l*w));
	 double p2 = l * ( Math.sqrt( Math.pow( (w/2),2) + Math.pow(h,2) ) );
   double p3 = w * ( Math.sqrt( Math.pow( (l/2),2) + Math.pow(h,2) ) );
	return(p1 + p2 + p3);
  }
}
