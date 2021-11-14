public class Customize extends Clothes {
    public double Size;
    public double D_Length;
    public double D_Width;

    public Customize(double size, double length, double width) {
        Size = size;
        D_Length = length;
        D_Width = width;
    }

    public double getLength() {
        if (D_Length <= 0)
            return 0;
        else
            return D_Length;
    }

    public double getWidth() {
        if (D_Width <= 0)
            return 0;
        else
            return D_Width;
    }

    public double getSize() {
        return Size;
    }

}


