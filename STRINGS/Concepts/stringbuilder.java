
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

    sb.delete(2,4);
    System.out.println(sb);
    StringBuilder sbs = new StringBuilder("H");
    sbs.append("e");
    sbs.append("l");
    sbs.append("l");
    sbs.append("o");
    System.out.println(sbs);

    sb.replace(1,5,"kushwaha");
    //sb.delete(1,5,"kushwaha");
    System.out.println(sb);



    //REVERSE USING STRING BUILDER 
    StringBuilder sabu = new StringBuilder("hello");
    for(int i =0;i<sabu.length()/2;i++){
        int front =i;
        int back =sabu.length()-1-i; //5-1-0 =4
        char frontchar = sabu.charAt(front);
        char backchar = sabu.charAt(back);

        sabu.setCharAt(front,backchar);
        sabu.setCharAt(back,frontchar);
    }
    System.out.println(sabu);


    }}
