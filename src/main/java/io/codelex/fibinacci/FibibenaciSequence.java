package io.codelex.fibinacci;

public class FibibenaciSequence {


    public int getNumber(int index) {
        if (index == 1) {
            return 0;
        } else if (index == 2) {
            return 1;
        } else {
            return getNumber(index - 1) + getNumber(index - 2);
        }
/*private  int getFibinaciNumber(int index){
    if (index == 1) {
        return 0;
    } else if (index == 2) {
        return 1;
    } else {
        return getFibinaciNumber(index-1)+getFibinaciNumber(index-2);




    }*/
    }

}











