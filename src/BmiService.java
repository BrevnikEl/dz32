public class BmiService
{
    public int calculate(double heightMetres, int weightKg)
    {
        double heightS = heightMetres *  heightMetres;
        double myIndex = weightKg / heightS;
        int result = (int) myIndex;
        return result;
    }
}

