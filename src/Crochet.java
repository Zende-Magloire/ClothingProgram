public class Crochet extends Clothes
{
private double Bust_M;
private double Hips_M;
private double Waist_M;
private double C_Size;

public Crochet(double bust, double hips, double waist, double size){
    Bust_M = bust;
    Hips_M = hips;
    Waist_M = waist;
    C_Size = size;
}

public double getBustMeasure()
{
    return Bust_M;
}
public double getHipsMeasure()
{
    return Hips_M;
}
public double getWaistMeasure()
{
    return Waist_M;
}
public double getCrochetSize()
{
    return C_Size;
}


    @Override
    public double price()
    {
        return 0;
    }
}
