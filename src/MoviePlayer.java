// Harrison Paxton
// MoviePlayer is similar to audio player but movies instead of audio
// 10/24/2018
public class MoviePlayer extends Product implements MultimediaControl{


  private Screen screen;
  private MonitorType monitorType;

  public MoviePlayer(String name, Screen screen, MonitorType type) {
    super(name);
    this.screen = screen;
    this.monitorType = type;
  }

  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  @Override
  public void next() {
    System.out.println("Next movie");
  }

  public String toString() {

    String superString = super.toString();

    superString += screen + "\n" +
        "Monitor Type : " + monitorType;

    return superString;
  }

}