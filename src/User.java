public class User {

  String name;
  String pass;
  String place;

  public User(String name, String pass, String place) {
    this.name = name;
    this.pass = pass;
    this.place = place;
  }

  public boolean isEmpty() {

    boolean empty = false;

    if (
      this.name == "" ||
      this.pass == "" ||
      this.place == ""
    ) {
      empty = true;
    }

    return empty;
  }
}
