package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        Pocitac ePocitac = new Pocitac();
        ePocitac.isJeZapnuty(false);

        Disk eDisk = new Disk();
        eDisk.setKapacita(463_000_000_000L);
        eDisk.setVyuziteMisto(156_000_000_000L);

        Pamet ePamet = new Pamet();
        ePamet.setKapacita(8_000_000_000L);

        Procesor eProcesor = new Procesor();
        eProcesor.setVyrobce("Intel");
        eProcesor.setRychlost(2_400_000_000_000L);

        ePocitac.setCpu(eProcesor);
        ePocitac.setRam(ePamet);
        ePocitac.setPevnyDisk(eDisk);

        ePocitac.zapniSe();
        ePocitac.zapniSe();

        ePocitac.vypniSe();
        ePocitac.vypniSe();

        ePocitac.zapniSe();

        ePocitac.vytvorSouborOVelikosti(50_000_000_000L);

        ePocitac.vypniSe();
        ePocitac.zapniSe();

        ePocitac.vymazSouboryOVelikosti(150_000_000_000L);

        System.out.println(ePocitac);
    }
}
