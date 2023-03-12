package cz.czechitas.ukol3;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Objects;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public String toString() {
        return "Můj počítač je " + cpu + " " + ram + " " + pevnyDisk + ".";
    }

    public boolean isJeZapnuty(boolean jeZapnuty) {
        if (jeZapnuty) {
            System.out.println("Počítač je zapnutý.");
            return true;
        } else {
            System.out.println("Počítač je vypnutý.");
            return false;
        }
    }

    public void zapniSe() {
        if (!jeZapnuty) {
            if (cpu == null || ram == null || pevnyDisk == null) {
                System.err.println("Nejsou zadané všechny informace o počítači.");
            } else {
                System.out.println("Počítač se zapnul.");
                jeZapnuty = true;
            }
        } else {
            System.err.println("Počítač je už zapnutý.");
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač se vypnul.");
            jeZapnuty = false;
        } else {
            System.err.println("Počítač je už vypnutý.");
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            long vyuziteMisto = (pevnyDisk.getVyuziteMisto() + velikost);
            if (vyuziteMisto > pevnyDisk.getKapacita()) {
                System.err.println("Plná kapacita paměti.");
            } else {
                System.out.println("Využité místo je: " + vyuziteMisto + ".");
            }
        } else {
            System.err.println("Počítač je vypnutý.");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            long vyuziteMísto = pevnyDisk.getVyuziteMisto() - velikost;
            if (vyuziteMísto < 0) {
                System.err.println("Kapacita paměti nemůže být menší než O.");
            } else {
                System.out.println("Využité místo je: " + vyuziteMísto + ".");
            }
        } else {
            System.err.println("Počítač je vypnutý.");
        }
    }
}


