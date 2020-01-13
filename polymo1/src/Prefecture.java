/**
 */
public class Prefecture {
    private String name = null;
    private String countryName = null;
    private String prefecturalCapital = null;
    private int population = 0;
    private int area = 0;


    public Prefecture(String name, String countryName, String prefecturalCapital, int population, int area){
        this.name = name;
        this.countryName = countryName;
        this.prefecturalCapital = prefecturalCapital;
        this.population = population;
        this.area = area;
    }

    public void displayCountry(){
        System.out.println(countryName);
    }

    public void displayInfo(){
        System.out.println("都道府県名：" + name);
        System.out.println("県庁所在地：" + prefecturalCapital);
        System.out.println("人口：" + population);
        System.out.println("面積：" + area);
    }

}
