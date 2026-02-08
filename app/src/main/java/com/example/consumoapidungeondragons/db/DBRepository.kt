package com.example.consumoapidungeondragons.db

import com.example.consumoapidungeondragons.model.listas.MonstersResult

class DBRepository {
    val daoInterface = MonsterApplication.database.monsterDao()

    suspend fun getAllMonsters() = daoInterface.getAllMonsters()
    suspend fun getKilledMonsters() = daoInterface.getKilledMonsters()
    suspend fun isKilled(index: String) = daoInterface.isKilled(index)
    suspend fun insert(monster: MonstersResult) = daoInterface.insert(monster)
}
