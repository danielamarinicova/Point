package sk.akademiasovy.sk.akademiasovy.adder;
import java.nio.charset.CharsetEncoder;

public class MyClass {

    public String FormatName(String name){
            name=name .toLowerCase();
            return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();

        }

        public boolean isEmailValid(String email){
            if (!email.contains("@"))
                return false;
            if (email.length()<5)
                return false;
            int i;
            int wrongCharacters=0;
            int countOfAt=0;                            //At=@
            for(i=0;i<email.length();i++){
                Character z=email.charAt(i);
                if (Character.isAlphabetic(z) || Character.isDigit(z)||"-_@." .contains(z.toString())){

                }
                else {
                    return false;
                }
            } return true;
        }

        public Gender getGender(String nin){
        char z=nin.charAt(2);
        if(nin.charAt(6) == '/' && (nin.length()!=11 && nin.length()==!10))
            return Gender.NONE;
            if(nin.charAt(6) == '/' && (nin.length()!=10 && nin.length()==!9))
                return Gender.NONE;

        if(z=='0' || z=='1')
            return Gender.MALE;
        else if(z=='5'|| z=='6')
            return Gender.FEMALE;
        else return Gender.NONE;
        }
    }


