public class TpPosition {
    static int[] point(String[] directions){
        int[] point=new int[2];
        point[0]=0;
        point[1]=0;
        for(int i=0;i<directions.length;i++){
            if(directions[i]=="gauche"){
                point[0] -=1;
            }
            if(directions[i]=="droite"){
                point[0] +=1;
            }
            if(directions[i]=="haut"){
                point[1] +=1;
            }
            if(directions[i]=="bas"){
                point[1] -=1;
            }
        }
        return point;
    }


}
