
package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class perlombaan extends posttest6{
    private int tgllomba;
    private String namalomba;

    public perlombaan(int tgllomba, String namalomba) {
        this.tgllomba = tgllomba;
        this.namalomba = namalomba;
    }



    perlombaan(String namalomba, String tgllomba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    perlombaan(String lomba_pemprograman_web, int i) {
      
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
        posttest6.namaWeb = namaWeb;
    }

    public static ArrayList<String> getNimWeb() {
        return nimWeb;
    }

    public static void setNimWeb(ArrayList<String> nimWeb) {
        posttest6.nimWeb = nimWeb;
    }

    public static ArrayList<String> getProdiWeb() {
        return prodiWeb;
    }

    public static void setProdiWeb(ArrayList<String> prodiWeb) {
        posttest6.prodiWeb = prodiWeb;
    }

    public static ArrayList<String> getAlasanWeb() {
        return alasanWeb;
    }

    public static void setAlasanWeb(ArrayList<String> alasanWeb) {
        posttest6.alasanWeb = alasanWeb;
    }

    public static ArrayList<String> getNamaRbt() {
        return namaRbt;
    }

    public static void setNamaRbt(ArrayList<String> namaRbt) {
        posttest6.namaRbt = namaRbt;
    }

    public static ArrayList<String> getNimRbt() {
        return nimRbt;
    }

    public static void setNimRbt(ArrayList<String> nimRbt) {
        posttest6.nimRbt = nimRbt;
    }

    public static ArrayList<String> getProdiRbt() {
        return prodiRbt;
    }

    public static void setProdiRbt(ArrayList<String> prodiRbt) {
        posttest6.prodiRbt = prodiRbt;
    }

    public static ArrayList<String> getAlasanRbt() {
        return alasanRbt;
    }

    public static void setAlasanRbt(ArrayList<String> alasanRbt) {
        posttest6.alasanRbt = alasanRbt;
    }

    public static boolean isIsRunning() {
        return isRunning;
    }

    public static void setIsRunning(boolean isRunning) {
        posttest6.isRunning = isRunning;
    }

    public static InputStreamReader getInputStreamReader() {
        return inputStreamReader;
    }

    public static void setInputStreamReader(InputStreamReader inputStreamReader) {
        posttest6.inputStreamReader = inputStreamReader;
    }

    public static BufferedReader getInput() {
        return input;
    }

    public static void setInput(BufferedReader input) {
        posttest6.input = input;
    }

    void tambah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setNamalomba() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setTgllomba() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

