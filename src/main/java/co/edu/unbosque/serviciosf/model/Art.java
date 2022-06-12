package co.edu.unbosque.serviciosf.model;

public class Art {

    private String title;
    private String price;
    private Boolean forsale;
    private String img;
    private Integer collection;
    private Integer id;
    private String owner;

    public Art(){}

    public Art(String titulo, String precio, boolean email, String link, Integer coleccion){
        title = titulo;
        forsale=email;
        price = precio;
        img = link;
        collection = coleccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Boolean getForsale() {
        return forsale;
    }

    public void setForsale(Boolean forsale) {
        this.forsale = forsale;
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getCollection() {
        return collection;
    }

    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
