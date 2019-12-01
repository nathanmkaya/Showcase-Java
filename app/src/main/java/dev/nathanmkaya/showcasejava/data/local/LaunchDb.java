package dev.nathanmkaya.showcasejava.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import dev.nathanmkaya.showcasejava.data.model.Agency;

@Database(
        entities = {
                Agency.class
        },
        version = 1,
        exportSchema = false
)
@TypeConverters(Converter.class)
public abstract class LaunchDb extends RoomDatabase {

}
