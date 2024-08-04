package ru.passionDev.moneyBot

import jakarta.persistence.*

@Entity
class Account (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(nullable = false)
    var name: String,
    @Column(nullable = false)
    var balanse: Int
)