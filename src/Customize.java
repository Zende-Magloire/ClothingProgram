public class Customize extends Clothes
{
    public double M_Size;
    public double D_Length;
    public double D_Width;

    public Customize ( double size, double length, double width){
        M_Size = size;
        D_Length = length;
        D_Width = width;
    }

    public double getLength()
    {
        if (D_Length <= 0)
            return 0;
        else
            return D_Length;
    }

    public double getWidth()
    {
        if (D_Width <= 0)
            return 0;
        else
            return D_Width;
    }

    public double getSize()
    {
        return M_Size;
    }

    @Override
    public double price()
    {
        return 0;
    }
}
