public class performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch; //will add all the characters
        }
        System.out.println(series);
    }
    
}

//output - abcdefghijklmnopqrstuvwxyz
