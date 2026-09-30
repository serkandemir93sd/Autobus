public class Autobus
{
    private String  kennzeichen;
    private int     sitzplatte;
    private boolean anhanger;
    
    public Autobus()
    {
        setKennzeichen("W-1234A");
        setSitzplatte(29);
        setAnhanger(false);
    }


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
    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }

    public void setSitzplatte(int neuSitzplatte)
    {
        sitzplatte = neuSitzplatte;
    }

    public void setAnhanger(boolean neuAnhanger)
    {
        anhanger = neuAnhanger;
    }
}