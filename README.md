# BooksStock
SpringBoot, Maven, Rest WS


/books/getAll -Butun Kayıtlı kitapları getirir.

/books/delete?writerId={Id} --Gonderilen yazar idli yazarı ve varsa kitaplarını siler.

/books/saveBook :
{
	"bookName" : "Anna Karanina",
	"writerName" : "Tolstoy",
	"categoryName" : "Klasik",
	"publisher" : "Is bankasi",
	"editionYear" : "2017"
}
örnekteki gibi objeyi post ederek kitabı kaydedebilirsiniz.

/books/search/{NAME}  Name alanına yazdığınız kelime ile kitap adı ile arama yapabilirsiniz.
