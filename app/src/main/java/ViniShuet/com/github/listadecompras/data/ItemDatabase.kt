package ViniShuet.com.github.listadecompras.data

import ViniShuet.com.github.listadecompras.model.ItemModel
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}