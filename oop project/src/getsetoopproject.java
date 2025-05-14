public class getsetoopproject {
    private  String name ;

    public  String getName(){
        this.name=name;
        return  name;

    }

    public void setName(String name) {
        if(name!=null && !name.isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("invalid name");
        }
    }
}
