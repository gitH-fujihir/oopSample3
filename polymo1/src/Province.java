/**
 */
public class Province {
    private String name = null;
    private String countryName = null;
    private String provinceCapital = null;
    private String officialLanguage = null;
    private String majorEthnic = null;
    private int population = 0;
    private int area = 0;

    public Province(String name, String countryName, String provinceCapital, int population, int area, String officialLanguage, String majorEthnic){
        this.name = name;
        this.countryName = countryName;
        this.provinceCapital = provinceCapital;
        this.population = population;
        this.area = area;
        this.officialLanguage = officialLanguage;
        this.majorEthnic = majorEthnic;
    }

    public void displayCountry(){
        System.out.println(countryName);
    }

    public void displayInfo(){
        System.out.println("省名：" + name);
        System.out.println("省都：" + provinceCapital);
        System.out.println("人口：" + population);
        System.out.println("面積：" + area);
        System.out.println("公用語：" + officialLanguage);
        System.out.println("主要民族：" + majorEthnic);
    }

}
