public class ShortestPath {
    public static float ShortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'E'){
                x++;
            }else if(str.charAt(i) == 'W'){
                x--;
            }else if(str.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return(float) Math.sqrt(x2 + y2);
    }
    public static void main(String argc[]){
        String str = "WNEENESENNN";

        float res = ShortestPath(str);
        System.out.print("Shortest path is :"+res);
    }
}
