
package posttest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class perlombaan extends posttest4{
    private int tgllomba;
    private String namalomba;

    public perlombaan(int tgllomba, String namalomba) {
        this.tgllomba = tgllomba;
        this.namalomba = namalomba;
    }

    perlombaan(String lomba_pemprograman_web, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    perlombaan(String namalomba, String tgllomba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void display(){
        System.out.println("nama perlombaan :"+this.namalomba);
        System.out.println("tanggal perlombaan :"+this.tgllomba);
    }

    public int getTgllomba() {
        return tgllomba;
    }

    public void setTgllomba(int tgllomba) {
        this.tgllomba = tgllomba;
    }

    public String getNamalomba() {
        return namalomba;
    }

    public void setNamalomba(String namalomba) {
        this.namalomba = namalomba;
    }

    public static ArrayList<String> getNamaWeb() {
        return namaWeb;
    }

    public static void setNamaWeb(ArrayList<String> namaWeb) {
        posttest4.namaWeb = namaWeb;
    }

    public static ArrayList<String> getNimWeb() {
        return nimWeb;
    }

    public static void setNimWeb(ArrayList<String> nimWeb) {
        posttest4.nimWeb = nimWeb;
    }

    public static ArrayList<String> getProdiWeb() {
        return prodiWeb;
    }

    public static void setProdiWeb(ArrayList<String> prodiWeb) {
        posttest4.prodiWeb = prodiWeb;
    }

    public static ArrayList<String> getAlasanWeb() {
        return alasanWeb;
    }

    public static void setAlasanWeb(ArrayList<String> alasanWeb) {
        posttest4.alasanWeb = alasanWeb;
    }

    public static ArrayList<String> getNamaRbt() {
        return namaRbt;
    }

    public static void setNamaRbt(ArrayList<String> namaRbt) {
        posttest4.namaRbt = namaRbt;
    }

    public static ArrayList<String> getNimRbt() {
        return nimRbt;
    }

    public static void setNimRbt(ArrayList<String> nimRbt) {
        posttest4.nimRbt = nimRbt;
    }

    public static ArrayList<String> getProdiRbt() {
        return prodiRbt;
    }

    public static void setProdiRbt(ArrayList<String> prodiRbt) {
        posttest4.prodiRbt = prodiRbt;
    }

    public static ArrayList<String> getAlasanRbt() {
        return alasanRbt;
    }

    public static void setAlasanRbt(ArrayList<String> alasanRbt) {
        posttest4.alasanRbt = alasanRbt;
    }

    public static boolean isIsRunning() {
        return isRunning;
    }

    public static void setIsRunning(boolean isRunning) {
        posttest4.isRunning = isRunning;
    }

    public static InputStreamReader getInputStreamReader() {
        return inputStreamReader;
    }

    public static void setInputStreamReader(InputStreamReader inputStreamReader) {
        posttest4.inputStreamReader = inputStreamReader;
    }

    public static BufferedReader getInput() {
        return input;
    }

    public static void setInput(BufferedReader input) {
        posttest4.input = input;
    }

    void tambah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
