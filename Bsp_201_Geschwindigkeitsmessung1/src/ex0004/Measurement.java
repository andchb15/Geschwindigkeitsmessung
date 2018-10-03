package ex0004;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Christopher Andrä
 */
public class Measurement
{

    private LocalDate date;
    private LocalTime time;
    private String kennzeichen;
    private int gemesseneGeschw;
    private int erlaubteGeschw;
    private int uebertretung;

    public Measurement(LocalDate date, LocalTime time, String kennzeichen, int gemesseneGeschw, int erlaubteGeschw, int uebertretung)
    {
        this.date = date;
        this.time = time;
        this.kennzeichen = kennzeichen;
        this.gemesseneGeschw = gemesseneGeschw;
        this.erlaubteGeschw = erlaubteGeschw;
        this.uebertretung = uebertretung;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public LocalTime getTime()
    {
        return time;
    }

    public void setTime(LocalTime time)
    {
        this.time = time;
    }

    public int getUebertretung()
    {
        return uebertretung;
    }

    public void setUebertretung(int uebertretung)
    {
        this.uebertretung = uebertretung;
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
        return uebertretung;
    }

    public void setUeberttretung(int ueberttretung)
    {
        this.uebertretung = ueberttretung;
    }

}
