package Movie.and.Collection.Filtering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieLibrary {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        // 5 adet film nesnesi ekledik
        movies.add(new Movie("Esaretin Bedeli", 1994, "Drama ", 9.3));
        movies.add(new Movie("Baba", 1994, "Suç, Drama, Trajedi", 9.2));
        movies.add(new Movie("Kara Şövalye", 2008, "Gerilim, Superhero, Trajedi, Epik", 9.1));
        movies.add(new Movie("Baba 2", 1974, "Suç, Drama, Trajedi", 9.0));
        movies.add(new Movie("12 Öfkeli Adam", 1957, "Hukuk Draması, Psikolojik Drama, Suç, Drama", 9.0));

        // IMDb puanına göre sıralama yapıyoruz.
        System.out.println("IMDb puanına göre büyükten küçüğe: ");
        movies.sort((m1, m2) -> Double.compare(m2.getImdbRating(), m1.getImdbRating()));
        for (Movie movie : movies) {
            System.out.println(movie); //to string otomatik çalışacak
        }
        // Yıla göre sıralıyoruz
        System.out.println("\nYayın yılına göre sıralanmış (eskiden yeniye):");
        movies.sort(Comparator.comparingInt(Movie::getYearOfPublication));
        for (Movie movie : movies) {
            System.out.println(movie);
        }


        // Türe göre sıralıyoruz
        System.out.println("\nTürlere göre Filtrelendi (Drama, Suç, Gerilim)");
        movieGenreFilter(movies, "Drama, Suç, Gerilim, Hukuk Draması, Psikolojik Drama ");
    }
            // Bu metod verilen türe göre filtreleme yapar
        public static void movieGenreFilter (List < Movie > movies, String genreFilter){
            String[] genres = genreFilter.split(",");
            for (Movie movie : movies) {
                for (String genre : genres) {
                    if (movie.getMovieGenre().toLowerCase().contains(genre.trim().toLowerCase())) {
                        System.out.println(movie);
                        break;// aynı filmin birden fazla defa yazılmaması için
                    }
                }
            }
        }
    }
