public class Store {

  String user;
  String pass;
  String place;

  public Store(String user, String pass, String place) {
    this.user = user;
    this.pass = pass;
    this.place = place;
  }

  public String retrieval() {
    return pass;
  }
  
  // FIXME: return bool only once
  // FIXME: replace method name 'hollow'

  //TODO:check other 2 fields aswell
  public boolean isEmpty() {

    // we assume its not empty
    boolean empty = false;

    if (this.pass == "") {
      empty = true;
    }

    return empty;
  }
}
