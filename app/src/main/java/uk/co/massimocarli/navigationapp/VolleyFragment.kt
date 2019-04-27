package uk.co.massimocarli.navigationapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_volley.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class VolleyFragment : Fragment() {

  private lateinit var model: List<String>

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    model = MutableList(100) {
      "Item $it"
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_volley, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    recyclerView.layoutManager = LinearLayoutManager(activity)
    recyclerView.adapter = DummyAdapter(activity, model)
  }

}

class DummyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
  fun bindItem(value: String) = (view as TextView).setText(value)
}


class DummyAdapter(val context: Context?, val model: List<String>) : RecyclerView.Adapter<DummyViewHolder>() {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DummyViewHolder {
    val view = LayoutInflater.from(context).inflate(R.layout.dummy_item_layout, parent, false)
    return DummyViewHolder(view)
  }

  override fun getItemCount(): Int = model.size

  override fun onBindViewHolder(holder: DummyViewHolder, position: Int) =
    holder.bindItem(model[position])

}