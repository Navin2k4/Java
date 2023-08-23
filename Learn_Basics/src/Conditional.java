public class Conditional {
    public static void main(String[] args) {
        boolean attendance = false;
        //Conditional statements are same as in C
        if (attendance == true)
        {
            System.out.println("Attended the class");
        }
        else
        {
            System.out.println("Not Attended");
        }

        char att='O';
        if (att=='P'){
            System.out.println("Attended");
        } else if (att=='A') {
            System.out.println("Absent");
        } else if (att=='O') {
            System.out.println("OD");
        }
        else {
            System.out.println("Not Registered");
        }

        char a='C';
        switch (a)
        {
            case 'A':
                System.out.println("It is A");
                break;
            case 'B':
                System.out.println("Ti is B");
                break;
            case 'C':
                System.out.println("It is C");
                break;
            default:
                break;
        }

    }
}
