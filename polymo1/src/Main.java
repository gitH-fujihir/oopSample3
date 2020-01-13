import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int i = inputStr();

        if(i == 1){
            Prefecture prefecture = new Prefecture("宮城県","日本","仙台市",2303160,7282);
            prefecture.displayCountry();
            prefecture.displayInfo();
        }else if(i == 2){
            State state = new State("カリフォルニア","アメリカ","サクラメント",39560000,403932,"英語");
            state.displayCountry();
            state.displayInfo();
        }else if(i == 3){
            Province province = new Province("四川省","中国","成都市",80760000,485000,"中国語","漢民族");
            province.displayCountry();
            province.displayInfo();
        }else{
            System.out.println("想定外の値：" + i);
        }

    }

    private static int inputStr(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("キーボードから１、２、３のいずれかを入力してください");

        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(str);
    }
}
