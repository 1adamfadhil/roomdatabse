package com.example.roomdatabse.room

import androidx.room.*

@Dao
interface MovieDao {

    @Insert
    suspend fun addMovie(movie : Movie)

    @Update
    suspend fun updateMovie(movie : Movie)

    @Delete
    suspend fun deleteMovie(movie : Movie)

    @Query ("SELECT * FROM movie")
    suspend fun getMovie():List<Movie>
}