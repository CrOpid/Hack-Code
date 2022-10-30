class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                str.append((char)((int)s.charAt(i) + 32));
            }
            else{
                str.append((char)s.charAt(i));
            }
        }
        return str.toString();
    }
}
