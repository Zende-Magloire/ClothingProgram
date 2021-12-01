public class Customize extends Clothes
{
    public double D_Length;
    public double D_Width;

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


    @Override
    public String toString()
    {
        return "Your design " + getDesign() + "Length of your design " + getLength() + "Width of " +
                "your design " + getWidth() + "Size " + getSize();
    }
}


