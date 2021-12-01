public class Crochet extends Clothes
{
    private double Bust_M;
    private double Hips_M;
    private double Waist_M;

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

    @Override
    public String toString()
    {
        return "Your design " + getDesign() + "Bust " + getBustMeasure() + "Hips " + getHipsMeasure() + "Waist "
                + getWaistMeasure() + "Size " + getSize();
    }
}



