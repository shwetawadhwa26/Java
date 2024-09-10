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
    StringBuilder sb = new StringBuilder("tony");
    System.out.println(sb); //tony

    System.out.println(sb.charAt(0)); //t
 
    sb.setCharAt(0,'P');//Pony
    System.out.println(sb);

    sb.insert(0,'S');
    System.out.println(sb);

    sb.insert(2,'l');
    System.out.println(sb);

    }}
