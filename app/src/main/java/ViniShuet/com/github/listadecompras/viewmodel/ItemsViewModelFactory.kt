package ViniShuet.com.github.listadecompras.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ItemsViewModelFactory(private val application: Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        // Verifica se a classe do ViewModel é `ItemsViewModel`.
        if (modelClass.isAssignableFrom(ItemsViewModel::class.java)) {
            // Se for, cria uma nova instância do `ItemsViewModel` e retorna.
            // A anotação `@Suppress("UNCHECKED_CAST")` é usada para suprimir o aviso de cast inseguro.
            @Suppress("UNCHECKED_CAST")
            return ItemsViewModel(application) as T
        }
        // Se a classe do ViewModel não for `ItemsViewModel`, lança uma exceção `IllegalArgumentException`.
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}