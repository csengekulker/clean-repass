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

  //TODO:check other 2 fields aswell
  public boolean isEmpty() {

    boolean empty = false;

    if (
      this.user == "" ||
      this.pass == "" ||
      this.place == ""
    ) {
      empty = true;
    }

    return empty;
  }
}
