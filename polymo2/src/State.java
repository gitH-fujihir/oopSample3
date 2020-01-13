/**
 */
public class State implements IDisplayable {
    private String name = null;
    private String countryName = null;
    private String stateCapital = null;
    private String officialLanguage = null;
    private int population = 0;
    private int area = 0;

    public State(String name, String countryName, String stateCapital, int population, int area, String officialLanguage){
        this.name = name;
        this.countryName = countryName;
        this.stateCapital = stateCapital;
        this.population = population;
        this.area = area;
        this.officialLanguage = officialLanguage;
    }

    public void displayCountry(){
        System.out.println(countryName);
    }

    public void displayInfo(){
        System.out.println("州名：" + name);
        System.out.println("州都：" + stateCapital);
        System.out.println("人口：" + population);
        System.out.println("面積：" + area);
        System.out.println("公用語：" + officialLanguage);
    }

}
