public class stringMethods {
    public static void main(String[] args) {
        String str=new String("netbeans");
        /*
        //System.out.println(str.length());
        int len=str.length();
        System.out.println(len);*/
        /*String str2=str.toUpperCase();
        System.out.println(str2);*/
        /*str=str.trim();
        System.out.println(str);*/
        /*String str2=str.substring(3);
        System.out.println(str2);
        String str2=str.replace('e', 'M');
        System.out.println(str2);
        System.out.println(str2+ " " +str);
        */



        /*
        String str1="Mr. Shahrukh Khan";
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Shah" , 4));
        System.out.println(str1.endsWith("Khan"));
        System.out.println(str1.charAt(4));
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i));
        String str1="www.udemy.co.in";
        System.out.println(str1.indexOf("."));
        System.out.println(str1.indexOf(".",4));
        System.out.println(str1.indexOf("udemy"));
        System.out.println(str1.lastIndexOf("."));
        */



         /*
        String str1="Pyramid";
        String str2="pyramid";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //System.out.println(str1==str2);
        */
        /*
        //String str1="pyramid";
        String str1="china wall";
        String str2=new String("china tall");
        //System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        */
        String str1="the great wall ";
        String str2="of china";
        System.out.println(str1.contains("wall"));
        System.out.println(str1.concat(str2));//System.out.println(str1 + str2);
    }
}