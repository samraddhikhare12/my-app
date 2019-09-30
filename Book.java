class Book{
       
	   private int bookId;
	   private String name;
	   private String author;
       
	   
	   public int setbookId(int bookId)
	   {
	   this.bookId = bookId;
	   System.out.println("bookId is set");
	   }
	   public void get.bookId()
	   {
		   return bookId;
	   }
	    

	   public String setname(String name)
	   {
		   this.name=name;
		   System.out.println("this is my book");
	   }
	    public void getName()
		{
			return name;
		}
		private String setAuthor(String author)
		{
			this.author=author;
			System.out.println("author is here");
			
		}
		public void getAuthor()
		{
			return author;
		}