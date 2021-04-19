package com.chihang.tinnews.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.chihang.tinnews.model.Article;

@Database(entities = {Article.class}, version = 1, exportSchema = false)
public abstract class TinNewsDatabase extends RoomDatabase {

    public abstract ArticleDao articleDao();
}
