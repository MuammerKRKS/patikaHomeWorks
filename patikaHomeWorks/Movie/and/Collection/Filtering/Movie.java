package Movie.and.Collection.Filtering;

public class Movie {
    private String name;
    private int yearOfPublication;
    private String movieGenre;
    private double imdbRating;

    public Movie (String name,int yearOfPublication, String movieGenre, double imdbRating) // yapıcı metod 'constructor' ile 4 özellik ataması işlemini yapıyoruz.
    {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.movieGenre = movieGenre;
        this.imdbRating = imdbRating;
    }
    //getter metodları ile değerleri dışarıdan okuyoruz.
    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    //toString metodunu kozmetik için kullandım.
    @Override
    public String toString() {
        return name + " (" + yearOfPublication + ") - Genre: " + movieGenre + ", IMDb: " + imdbRating;
    }
}
