// public class stringbuilder {
//     public static void main(String[] args) {
//         StringBuilder builder = new StringBuilder();
//         for(int i=0;i<26;i++){
//             char ch = (char)('a'+i);
//             builder.append(ch);
//         }
//         System.out.println(builder.toString());
//         builder.reverse();
//         System.out.println(builder);
        
//     }
    
// }

public class stringbuilder{
    public static void main(String[] args) {

        for(int i =0;i<10;i++){
            char ch=(char)('a'+i);
            System.out.println(i+" "+ch[i]);
        }
    }
}