import java.io.*;
import java.util.Scanner;
public class Database {
    private Movie[] movies;
    public static final int Movie_SIZE = 10;
    public static final String delim = "\t";
    public static final int FIELD_AMT = 5;

    public Database()
    {
        movies = new Movie[Movie_SIZE];
    }
    public Movie[] getMovies()
    {
        return this.movies;
    }
    public void AddMovie(Movie aMovie)
    {
        if(movies[movies.length-1] != null)
        {
            System.out.println("The movies database is full");
            return;
        }
        //Findz empty space
        for(int i=0;i<movies.length;i++)
        {
            if(movies[i] == null)
            {
                movies[i] = aMovie;
                break;
            }
        }
        this.SortMoviesByRating();
    }
    public void RemoveMovie(String aName)
    {
        int removeIndex = -1;
        for(int i=0;i<movies.length;i++)
        { //checks for certain movie
            if(movies[i].getName().equalsIgnoreCase(aName))
            {
                removeIndex = i;
                break;
            }
        }
        if(removeIndex == -1)
        {
            System.out.println("Movie was not found");
        }
        else
        {
            for(int i=removeIndex;i<movies.length-1;i++)
            {
                movies[i] = movies[i+1];
            }
            movies[movies.length-1] = null;//Make sure the last index is always null
        }
    }
    public void SortMoviesByYear()
    {
        //Using Bubble Sort
        boolean swapped = true;
        while(swapped)
        {
            swapped = false;
            for(int i=0;i<movies.length-1;i++)
            {
                if(movies[i+1]==null)
                {
                    break;
                }
                if(movies[i].getYear()>movies[i+1].getYear())
                {
                    Movie temp = movies[i];
                    movies[i] = movies[i+1];
                    movies[i+1] = temp;
                    swapped = true;
                }
                System.out.println(movies[i]);
            }
        }
    }
    public void SortMoviesByDirector()
    {
        int removeIndex = -1;
        for(int i=0;i<movies.length;i++)
        {
            String aDirector = null;
            if(movies[i].getName().equalsIgnoreCase(aDirector))
            {
                removeIndex = i;
                break;
            }
        }
        if(removeIndex == -1)
        {
            System.out.println("Movie was not found");
        }
        else
        {
            for(int i=removeIndex;i<movies.length-1;i++)
            {
                movies[i] = movies[i+1];
            }
            movies[movies.length-1] = null;
        }
    }
    public void SortMoviesByRating()
    {
        //Bubble Sort
        boolean swapped = true;
        while(swapped)
        {
            swapped = false;
            for(int i=0;i<movies.length-1;i++)
            {
                if(movies[i+1]==null)
                {
                    break;
                }
                if(movies[i].getRate()>movies[i+1].getRate())
                {
                    Movie temp = movies[i];
                    movies[i] = movies[i+1];
                    movies[i+1] = temp;
                    swapped = true;
                }
                System.out.println(movies[i]);
            }
        }

    }
    public void SortMoviesByBoxGross()
    {
        //Bubble Sort
        boolean swapped = true;
        while(swapped)
        {
            swapped = false;
            for(int i=0;i<movies.length-1;i++)
            {
                if(movies[i+1]==null)
                {
                    break;
                }
                if(movies[i].getBoxOffice()>movies[i+1].getBoxOffice())
                {
                    Movie temp = movies[i];
                    movies[i] = movies[i+1];
                    movies[i+1] = temp;
                    swapped = true;
                }
                System.out.println(movies[i]);
            }
        }
    }

    public void WriteDBFile(String aFile)
    {
        try
        {
            PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFile));
            for(Movie movie:movies)
            {
                if(movie == null)
                {
                    break;
                }
                fileWriter.println(movie.getName()+delim+
                        movie.getYear()+delim+
                        movie.getRate()+delim+
                        movie.getDirector()+delim+
                        movie.getBoxOffice());

            }
            fileWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e.getMessage());
        }
    }
    public void ReadDBFile(String aFile)
    {
        try
        {
            movies = new Movie[Movie_SIZE];
            Scanner fileScanner = new Scanner(new File(aFile));
            int movieCount = 0;
            while(fileScanner.hasNextLine())
            {
                String fileLine = fileScanner.nextLine();
                String[] splitLines = fileLine.split(delim);
                if(splitLines.length == FIELD_AMT)//Well formed line
                {
                    String name = splitLines[0];
                    int year = (int) Double.parseDouble(splitLines[1]);
                    String director  = splitLines[2];
                    int rate = (int) Double.parseDouble(splitLines[3]);
                    double boxOffice = Double.parseDouble(splitLines[4]);
                    Movie aMovie = new Movie(name,rate,year,director,boxOffice);

                    this.AddMovie(aMovie);
                    movieCount++;
                }
            }
            fileScanner.close();
        }
        catch(Exception e)
        {

        }
    }
}