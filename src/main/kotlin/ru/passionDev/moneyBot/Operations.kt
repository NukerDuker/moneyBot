package ru.passionDev.moneyBot

import jakarta.persistence.*
import java.sql.Date

@Entity
class Operations(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(name = "date", nullable = false)
    val date: Date,
    @Column(nullable = false)
    val category: String,
    @Column
    val comment: String?,
    @Column(nullable = false)
    val type: OperationType,
    @Column(nullable = false)
    @ManyToOne
    val account: Account
)