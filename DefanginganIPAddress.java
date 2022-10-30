class DefanginganIPAddress {
    public String defangIPaddr(String address) {
        String newadd = "";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                newadd = newadd+"[.]";
            }
            else newadd = newadd+address.charAt(i);
}
        return newadd;
    }
}
