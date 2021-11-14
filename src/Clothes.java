public abstract class Clothes
{
    private String E_Design;
    private double S_Price;
    private double M_Price;
    private double L_Price;
    private double XL_Price;

public void Clothes(String d){
    E_Design = d;
    //set start prices
    S_Price = 20;
    M_Price = 25;
    L_Price = 30;
    XL_Price = 35;
}

public double getSmallPrice()
{
    return S_Price;
}
public double getMediumPrice()
{
    return M_Price;
}
public double getLargePrice()
{
    return L_Price;
}
public double getExtraLargePrice()
{
    return XL_Price;
}

public String getDesign()
{
    return E_Design;
}

}
