public class arraytostring {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(toString(arr));
    }

    
    public static String toSTring(int[] a){
        if(a==null){
            return "null";
        int iMax=a.length-1;
        if(iMax==-1){
            return "[]";

    StringBuilder b = new StringBuilder();
    b.append('[');
    for(int i=0; ;i++){
        b.append(a[i]);
        if(i==iMax)
        return b.append(']').toString();
        b.append(",");
    }
        }
        }
    }
    
}
