public class Autobus
{
    private String  kennzeichen;
    private int     sitzplatte;
    private boolean anhanger;


    public String getKennzeichen()
    {
        return kennzeichen;
    }

    public int getSitzpaltte()
    {
        return sitzplatte;
    }

    public boolean getAnhanger()
    {
        return anhanger;
}
    public void setName(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }

    public void setAlter(int neuSitzplatte)
    {
        sitzplatte = neuSitzplatte;
    }

    public void setMatura(boolean neuAnhanger)
    {
        anhanger = neuAnhanger;
    }
}