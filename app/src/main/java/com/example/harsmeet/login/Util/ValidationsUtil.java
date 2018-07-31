package com.example.harsmeet.login.Util;

/**
 * Created by harsmeet on 31-07-2018.
 */

public class ValidationsUtil {


        //        RegexTestPatternMatcher:
        private static String pinCodePattern = "^\\d{6}$";              // 1414141

        private static String tinPattern = "";              // 111-11-1111

        private static String userNamePattern = "/^[A-Za-z0-9]+(?:[ _-][A-Za-z0-9]+)*$/";              //      /^[a-zA-Z0-9]+([_\s\-]?[a-zA-Z0-9])*$/              /^(?!.*[_\s-]{2,})[a-zA-Z0-9][a-zA-Z0-9_\s\-]*[a-zA-Z0-9]$/              /^[a-zA-Z0-9]+([a-zA-Z0-9](_|-| )[a-zA-Z0-9])*[a-zA-Z0-9]+$/

        private static String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";              // homergize@gmail.com

        private static String mobilePattern = "[0-9]{10}";

        private static String panPattern = "[A-Z]{5}\\d{4}[A-Z]{1}";             // AAAAA9999A

        private static String gstPattern = "\\d{2}[A-Z]{5}\\d{4}[A-Z]{1}\\d[Z]{1}[A-Z\\d]{1}";        // 29ABCDE1234F2Z3


        public boolean isUserNameValid(String userName) {

            return userName.matches(userNamePattern);
        }

        public boolean isPinCodeValid(String pincode) {

            return pincode.matches(pinCodePattern);
        }


        public boolean isEmailValid(String email) {

            return email.matches(emailPattern);
        }

        public boolean isMobileValid(String mob) {

            return mob.matches(mobilePattern);
        }

        public boolean isPanValid(String pan) {

            return pan.matches(panPattern);
        }

        public boolean isGSTValid(String gst) {

            return gst.matches(gstPattern);
        }

    }



//        private boolean isValidMail(String email) {
//            boolean check;
//            Pattern p;
//            Matcher m;
//
//            String EMAIL_STRING = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//
//            p = Pattern.compile(EMAIL_STRING);
//
//            m = p.matcher(email);
//            check = m.matches();
//
//            if(!check) {
//                txtEmail.setError("Not Valid Email");
//            }
//            return check;
//        }
//OR
//
//    private boolean isValidMail(String email) {
//            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
//            }




//android.util.Patterns.EMAIL_ADDRESS.matcher(input).matches();
//        android.util.Patterns.PHONE.matcher(input).matches();

