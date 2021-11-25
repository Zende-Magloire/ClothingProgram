public class Crochet extends Clothes
{
    private double Bust_M;
    private double Hips_M;
    private double Waist_M;


    public Crochet(double bust, double hips, double waist, double size)
    {
        Bust_M = bust;
        Hips_M = hips;
        Waist_M = waist;
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

}



