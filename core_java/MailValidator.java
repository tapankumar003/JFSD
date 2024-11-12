public class MailValidator {
    boolean mailChecker(String eml){
        if(eml.contains("@")){
            if(eml.contains("@gmail.com")){
                return true;
            }
            else if (eml.contains("@yahoo.com")) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String eml = "abc@yahoo.com";
        MailValidator mv = new MailValidator();
        boolean mvc = mv.mailChecker(eml);
        if(mvc==true){
            System.out.println("Entered mail is correct");
        }
        else{
            System.out.println("Sorry, Wrong email..");
        }
    }
}
