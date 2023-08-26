//package Annotations.customAnnotations.fieldLevel;
//
//import java.lang.reflect.Field;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String name = "Gurjot Singh";
//        int age = 20;
//        ElectionCandidate obj = new ElectionCandidate(name, age);
//
//
//        for (Field field : obj.getClass().getDeclaredFields())
//        {
//            if (field.isAnnotationPresent(CandidateName.class))
//            {
//                field.get(obj);
//
//
//                // check and typecast to string : in JRE 16
//                if (objData instanceof String stringData)
//                {
//                    System.out.println(stringData.toLowerCase());
//                }
//
//
//            }
//        }
//    }
//}
