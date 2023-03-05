package com.example.whatssap.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.whatssap.R
import com.example.whatssap.databinding.ActivityLoginBinding
import com.example.whatssap.databinding.ActivityMainBinding
import java.util.EnumMap

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Captura o email da tela de cadastro
        val bundle = intent.extras
        val emailUser = bundle?.getString("email")
        binding.editEmail.setText( emailUser )

        binding.txtIrCadastro.setOnClickListener {
            telaDeCadastro()
        }

        binding.btnConfirmar.setOnClickListener {

            val email = binding.editEmail.text.toString()
            val senha = binding.editSenha.text.toString()

            if (email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }

    private fun telaDeCadastro() {
        startActivity(Intent(this, CadastroActivity::class.java))
    }

}