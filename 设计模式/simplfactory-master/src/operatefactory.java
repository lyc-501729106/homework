/**
 * 功能描述

 **/
public class operatefactory {
    public static operate choseoperate(String operator){
        operate operate=null;
        if("+".equals(operator)) {
            return new operateadd();
        }
        else if ("-".equals(operator)){
            return new operateSub();
        }
        else if ("*".equals(operator)){
            return new operateMul();
        }
        else if ("/".equals(operator)){
            return new operatediv();
        }

           return operate;
    }
}
