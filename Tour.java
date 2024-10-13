 class Hillstation {
public void location(){}
public void famousfor(){}
}
class Manali extends Hillstation{
    public void location(){
System.out.println("Manali is a town, near Kullu town in Kullu district in the Indian state of Himachal Pradesh. \nIt is situated in the northern end of the Kullu Valley, formed by the Beas River.");
    }

     public void famousfor(){
        System.out.println("Manali is synonymous streams and birdsong, forests and orchards and grandees of \nsnow-capped mountains. Manali is the real starting point of an ancient trade route which crosses the\n Rohtang and Baralacha passes, and runs via Lahul and Ladakh to Kashmir while divergent road connects it with Spiti.\n");
     }


}
class Mussoorie extends Hillstation{
       public void location(){
        System.out.println("MUSSOORIE Pin Code is 248179. MUSSOORIE is located in NA DEHRADUN, UTTARAKHAND, India");
       }

  public void famousfor(){
    System.out.println("Mussoorie, the queen of hill stations, is famous for its scenic beauty, good social life\n and entertainment. The excellent climate makes it an attractive holiday resort. Thronged by holidayers, it \nvibrates with gaiety and merry making during the summer season.\n");
  }

}
class Gulmarg extends Hillstation{
    public void location(){
     System.out.println("Gulmarg, town, western Jammu and Kashmir union territory, northern India. It is situated\n at an elevation of 8,500 feet (2,600 metres) about 25 miles (40 km) west of Srinagar.");
    }
 
    public void famousfor(){
        System.out.println("Gulmarg has attracted millions of tourists throughout its existence with the scenic\n beauty of the Himalayan Mountains in the back drop. One of the main attractions in Gulmarg is the Gulmarg\n Gondola, the Highest Cable Car in the world.");
    }
}
 public class Tour{
    public static void main(String[]a){
        Hillstation manali=new Manali();
        Hillstation mussoorie =new Mussoorie();
        Hillstation gulmarg=new Gulmarg();
        manali.location();
      System.out.println("\n");
        manali.famousfor();
        System.out.println("\n");

        mussoorie.location();
        System.out.println("\n");

        mussoorie.famousfor();
        System.out.println("\n");

        gulmarg.location();
        System.out.println("\n");

        gulmarg.famousfor();
    }
}
