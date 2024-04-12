public class Book extends TangibleAsset {
	private String isbn;
	public Book (String name,int price,String color,String Isbn){
		super(name,price,color);
		this.Isbn = isbn;
	}
	public String getIsbn(){ return this.isbn;}
}

