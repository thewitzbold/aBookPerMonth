import java.util.*;
public class book{
	private String title;
	private String author;
	private int totalPages;
	private int currentPage;
	static ArrayList<book> myLibrary = new ArrayList<book>();


	public book(String title, String author, int totalPages){
		this.title = title;
		this.author = author;
		this.totalPages = totalPages;
		this.currentPage = 1;
		myLibrary.add(this);
	}

	public String toString(){
		return title + " by " + author;
	}
	public void currentPage(int currentPage){
		this.currentPage = currentPage;
	}
	public int getTotalPages(){
		return this.totalPages;
	}
	public int getCurrentPage(){
		return this.currentPage;
	}
	public void iWantToReadIt(){

		System.out.println(toString());

		Calendar today = Calendar.getInstance();
		int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
		int endofMonth = today.getActualMaximum(Calendar.DAY_OF_MONTH);

		int temp = this.currentPage;
		double pagesPerDay;

		while(true){
			pagesPerDay = (this.totalPages - temp + 1.0)/(endofMonth - dayOfMonth + 1.0);

			if(pagesPerDay % 1 == 0)
				break;

			System.out.print(temp + "-");
			temp = temp + (int)Math.ceil(pagesPerDay) - 1;
			System.out.println(temp);
			temp += 1;
			dayOfMonth += 1;
		}
		while(temp < this.totalPages ){
			System.out.print(temp + "-");
			temp = temp + (int)(pagesPerDay) - 1;
			System.out.println(temp);
			temp += 1;
		}
	}

	public static void delete(){
		
	}

	public static void printAll(){
		for(int i=0; i<myLibrary.size(); i++)
			System.out.println(myLibrary.get(i));
	}

}