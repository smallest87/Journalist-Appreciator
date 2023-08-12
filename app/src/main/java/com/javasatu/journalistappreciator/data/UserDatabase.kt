package com.javasatu.journalistappreciator.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(
    entities = [User::class],
    version = 1
)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao(): Dao

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): UserDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(
                        UserCallback(scope)
                    )
                    .build()
                INSTANCE = instance

                instance
            }
        }

        private class UserCallback(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {

            override fun onCreate(
                db: SupportSQLiteDatabase
            ) {
                super.onCreate(db)

                INSTANCE?.let { database ->
                    scope.launch(
                        Dispatchers.IO
                    ) {
                        populateDatabase(
                            database.userDao()
                        )
                    }
                }
            }
        }

        suspend fun populateDatabase(
            userDao: Dao
        ) {

            userDao.deleteAll()

            var word = User(
                1,
                "Hello",
                "Julian",
                36
            )

            userDao.insert(word)
            word = User(
                2,
                "Halo",
                "Sukrisna",
                37
            )
            userDao.insert(word)
        }
    }
}