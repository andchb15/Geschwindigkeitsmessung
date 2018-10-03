package ex0004;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Christopher Andrä
 */
public class Measurement
{

    private Date date;
    private Time time;
    private String kennzeichen;
    private int gemesseneGeschw;
    private int erlaubteGeschw;
    private int ueberttretung;

    public Measurement(Date date, Time time, String kennzeichen, int gemesseneGeschw, int erlaubteGeschw, int ueberttretung)
    {
        this.date = date;
        this.time = time;
        this.kennzeichen = kennzeichen;
        this.gemesseneGeschw = gemesseneGeschw;
        this.erlaubteGeschw = erlaubteGeschw;
        this.ueberttretung = ueberttretung;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Time getTime()
    {
        return time;
    }

    public void setTime(Time time)
    {
        this.time = time;
    }

    public String getKennzeichen()
    {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen)
    {
        this.kennzeichen = kennzeichen;
    }

    public int getGemesseneGeschw()
    {
        return gemesseneGeschw;
    }

    public void setGemesseneGeschw(int gemesseneGeschw)
    {
        this.gemesseneGeschw = gemesseneGeschw;
    }

    public int getErlaubteGeschw()
    {
        return erlaubteGeschw;
    }

    public void setErlaubteGeschw(int erlaubteGeschw)
    {
        this.erlaubteGeschw = erlaubteGeschw;
    }

    public int getUeberttretung()
    {
        return ueberttretung;
    }

    public void setUeberttretung(int ueberttretung)
    {
        this.ueberttretung = ueberttretung;
    }

}
