// import java.util.Scanner;

// class InvalidAgeException extends Exception {
//     public InvalidAgeException(String message) {
//         super(message);
//     }
// }

// class InvalidLearnerLicenseException extends Exception {
//     public InvalidLearnerLicenseException(String message) {
//         super(message);
//     }
// }


// class AccidentException extends Exception {
//     public AccidentException(String message) {
//         super(message);
//     }
// }

// class LicenseIssuance {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = input.nextInt();

//         System.out.print("Do you have  learner's license (Y/N): ");
//         String learnerLicense = input.next();

//         System.out.print("Have you had any accident cases in the last one year? (true/false) ");
//         boolean hasAccident = input.nextBoolean();

//         try {
//             if (age < 18) {
//                 throw new InvalidAgeException("Applicant must be over 18 years of age.");
//             }

//             if (!learnerLicense.matches("^[Y]{1}")) {
//                 throw new InvalidLearnerLicenseException("You need learner License to apply for permanent license .");
//             }

//             if (hasAccident) {
//                 throw new AccidentException("Cannot issue license due to accident case(s) in the last one year.");
//             }

//             System.out.println("License issued successfully!");
//         } catch (InvalidAgeException | InvalidLearnerLicenseException | AccidentException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
        
      
//     }
// }