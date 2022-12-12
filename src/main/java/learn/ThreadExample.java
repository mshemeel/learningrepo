package main.java.learn;

public class ThreadExample {
    public static void main(String[] args){
        System.out.println(getFormattedLog("ThreadAbortException|The remote call did not return within the time limit"));
    }
    public static String getFormattedLog(String error){
        String [] errorArray = error.split("\\|");
        String exceptionType = errorArray[0];
        String message = errorArray[1];

        String severity = getSeverity(exceptionType);

        String s = new StringBuilder().append(severity).append("|").append(error).toString();
        return s;
    }


    private static String getSeverity(String exceptionType){
        switch(exceptionType){
            case "IOException" :
                return "High" +"|" + "100"  ;

            case "MemoryException":
                return "High" +"|" + "110" ;


            case "ThreadAbortException"      :
                return "Medium" +"|" + "200" ;

            case "ResponseTimeoutException"  :
                return "Low" +"|" + "300" ;

            case "ParameterException"        :
                return "Low" +"|" + "301" ;

            default : return "" ;

        }
    }
}
