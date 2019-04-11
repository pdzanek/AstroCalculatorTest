import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroCalculator.SunInfo;
import com.astrocalculator.AstroDateTime;
import com.astrocalculator.AstroCalculator.MoonInfo;


public class Main {

    public static void main(String[] args) {

        AstroDateTime astroDateTime = new AstroDateTime(2019,4,11,10,30,10,1,true);
        AstroCalculator.Location loc = new AstroCalculator.Location(51.7528122,19.433606);
        AstroCalculator astroCalculator = new AstroCalculator(astroDateTime,loc);
        SunInfo sunInfo = astroCalculator.getSunInfo();
        MoonInfo moonInfo = astroCalculator.getMoonInfo();
        System.out.println("----------------Sun----------------");
        System.out.println(sunInfo.getSunrise()+" "+sunInfo.getAzimuthRise());
        System.out.println(sunInfo.getSunset()+" "+sunInfo.getAzimuthSet());
        System.out.println(sunInfo.getTwilightMorning()+" "+sunInfo.getTwilightEvening());
        System.out.println("----------------MOON----------------");
        System.out.println(moonInfo.getMoonrise()+" "+moonInfo.getMoonset());
        System.out.println(moonInfo.getNextNewMoon()+" "+ moonInfo.getNextFullMoon());
        System.out.println(Math.round(moonInfo.getIllumination()*100)+"%");
        System.out.println(Math.round(moonInfo.getAge()/100*29.531));
    }
}
