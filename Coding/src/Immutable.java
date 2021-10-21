public final class Immutable {
    final int id;
    final String name;

    public Immutable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Immutable im = new Immutable(23, "Raj");
        String s1 = im.getname();
        int id1 = im.getId();
        System.out.println("Name : " + s1 + '\n' + "id : " + id1);

    }

    private int getId() {
        return id;
    }

    private String getname() {
        return name;
    }


}
