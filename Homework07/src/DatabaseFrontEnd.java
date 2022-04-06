//Lauren Hodges
import java.util.Scanner;
public class DatabaseFrontEnd {

    public static void main(String[] args) {


        Database movieDB = new Database();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the movie database");
        boolean quit = false;
        while(!quit)
        {
            System.out.println("Enter 1 to add a movie\n"
                    + "Enter 2 to remove a movie\n"
                    + "Enter 3 to read a movie database file\n"
                    + "Enter 4 to write to a movie database file\n" +
                    "Enter 5 to sort movies by year\n" +
                    "Enter 6 to sort movies by rating\n" +
                    "Enter 7 to sort movies by box office\n"
                    + "Enter 9 to quit");
            int userChoice = keyboard.nextInt();
            keyboard.nextLine();

            switch(userChoice)
            {
                case 1://Adds a Movie
                    System.out.println("Enter the name of the movie");
                    String name = keyboard.nextLine();
                    System.out.println("Enter the year of the movie");
                    int year = keyboard.nextInt();
                    System.out.println("Enter the rating of the movie");
                    int rating = keyboard.nextInt();
                    System.out.println("Enter the Director of the movie");
                    String director = keyboard.nextLine();
                    keyboard.next();
                    System.out.println("Enter the box office gross of the movie");
                    double boxOffice = keyboard.nextDouble();


                    movieDB.AddMovie(new Movie(name,year,rating,director,boxOffice));
                    break;
                case 2://Removes a movie
                    System.out.println("Enter the name of the movie to remove");
                    name = keyboard.nextLine();
                    movieDB.RemoveMovie(name);
                    break;
                case 3://Reads movies file
                    System.out.println("Enter the file name to read a MovieDB");
                    String fileName = keyboard.nextLine();
                    movieDB.ReadDBFile(fileName);
                    break;
                case 4:
                    System.out.println("Enter the file name to write a MovieDB File");
                    fileName = keyboard.nextLine();
                    movieDB.WriteDBFile(fileName);
                    break;
                case 5:
                    movieDB.SortMoviesByYear();
                case 6:
                    movieDB.SortMoviesByRating();
                case 7:
                    movieDB.SortMoviesByBoxGross();

                case 9://Quit
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input");
            }
            //Prints the movie
            for(Movie movie:movieDB.getMovies())
            {
                if(movie == null)
                {
                    break;
                }
                System.out.println(movie.getName()+" "+movie.getYear()+" "+movie.getRate()+" Stars "+movie.getDirector()+" "+movie.getBoxOffice()+" $");
            }
        }
        System.out.println("Good bye");
    }

}