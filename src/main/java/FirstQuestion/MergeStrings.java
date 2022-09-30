package FirstQuestion;

import Exceptions.InvalidConstraintException;

public class MergeStrings {
    public String mergeStrings(String a, String b) throws InvalidConstraintException {
        StringBuilder result= new StringBuilder();
        char[] first=a.toCharArray();
        char[] second=b.toCharArray();
        if ((a.length()>1 && a.length()<2500)&& b.length()>1 && b.length()<2500){
            for (int i = 0; i < first.length; i++) {
                result.append(first[i]);
                for (int j = i; j <= i; j++) {
                    result.append(second[j]);
                }
            }
            return result.toString();
        }else{
            throw new InvalidConstraintException("Range must be (1< a, b < 2500)");
        }
    }
    public static void main(String[] args) throws InvalidConstraintException {
        MergeStrings mergeStrings=new MergeStrings();
        System.out.println(mergeStrings.mergeStrings("hrte","aars"));
    }
}
