class business {
protected String name= "business";
public void businessname ()
 {
     System.out.println("divineshop");
    }
}
class location extends business
{
    String locationname="kigali";
    public void place()
    { System.out.println("kigali"); }

}
class product extends location
{
    String productname="orange";
    public void quality()
    { System.out.println("orange");
}
}
class price extends product{
    String pricerange="fivehundred";
    public void value()
    {
        System.out.println("fivehundred");
    }

     public static void main(String[] arg){
        business obj=new business();
        obj.businessname();
        System.out.println(obj.name);
        obj.location();
        System.out.println(obj.locationname);
        obj.place();
        System.out.println(obj.productname);
        obj.quality();
        System.out.println(obj.pricerange);       
        obj.value();

    }}
