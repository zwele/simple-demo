package com.zwh.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    /**
     * 正则：手机号（精确）
     * <p>移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188、198</p>
     * <p>联通：130、131、132、145、155、156、175、176、185、186、166</p>
     * <p>电信：133、153、173、177、180、181、189、199</p>
     * <p>全球星：1349</p>
     * <p>虚拟运营商：170</p>
     */
    public static final String REGEX_MOBILE_EXACT = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";

    public static final String REGEX_TELEPHONE = "^((0\\d{2,3})-)(\\d{7,8})(-(\\d{3,}))?$";
    //^((0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$

    public static void main(String[] args){
//        String phonePattern =  REGEX_MOBILE_EXACT+"|"+REGEX_TELEPHONE;
        String CONTACT_NUMBER_PATTERN = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$|^((0\\d{2,3})-)(\\d{7,8})(-(\\d{3,}))?$";
        Pattern pattern = Pattern.compile(CONTACT_NUMBER_PATTERN);

        Matcher matcher = pattern.matcher("0557-5717623");
        System.out.print(matcher.matches());

        /**
         * 中国电信号段
         133、149、153、173、177、180、181、189、199

         中国联通号段
         130、131、132、145、155、156、166、175、176、185、186

         中国移动号段
         134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188、198
         */
        String phonePattern2 = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";



    }

    private static boolean isMatch(String regex, CharSequence input) {
        return input != null && input.length() > 0 && Pattern.matches(regex, input);
    }

    public static boolean isMobileExact(CharSequence input) {
        return isMatch(REGEX_MOBILE_EXACT, input);
    }
    /**
     * 验证手机号码
     *
     * 移动号码段:139、138、137、136、135、134、150、151、152、157、158、159、182、183、187、188、147
     * 联通号码段:130、131、132、136、185、186、145
     * 电信号码段:133、153、180、189
     *
     * @param cellphone
     * @return
     */
//    public static boolean checkCellphone(String cellphone) {
//        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";
//        return check(cellphone, regex);
//    }
    //"^(0[0-9]{2,3}\-)?([2-9][0-9]{6,7})+(\-[0-9]{1,4})?$"
    //区号+座机号码+分机号码：regexp="^(0[0-9]{2,3}/-)?([2-9][0-9]{6,7})+(/-[0-9]{1,4})?$"
    /**
     * 验证固话号码
     *
     * @param telephone
     * @return
     */
//    public static boolean checkTelephone(String telephone) {
//        String regex = "^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";
//        return check(telephone, regex);
//    }

    //一起验证
    //方式1
    //^((0\d{2,3}-\d{7,8})|(1[3584]\d{9}))$
    //方式2
    //^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\d{8}$|^0\d{2,3}-?\d{7,8}$
}
