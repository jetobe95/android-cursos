# Curso de android Next U

## Layouts
## Hay varios tipo de layouts en android
* Frame Layout
* Linear Layout
* Relative Layout
* Table Layout
* Grid Layout


### Linear layout
 
 ![''](assets/linear-layout-ejer1.png)

 Esto es un pequeño diseño haciendo uso de `LinearLayout` y de las propiedades de cada elemento hijo `layout_weight`, que actual con `flex`, *nota*: Simpre hay que especificar la altura o sino la aplicación tendrá un  error.

 ```xml
       <EditText
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:gravity="top"
        android:hint="@string/descripcion" 
      />
 ````


 ### Relative layout
 
 !['Ejercicio'](assets/relative-layout.png)

 Este tipo de layout consiste en ubicar un elemento con respecto al otro por medio de su `@+id/` 

#### Algunos de los valores de elemplo son
1. `android:layout_centerInParent="true"` centra un elemento en centro de padre
1.  ` android:layout_above="id"` indica que un debe alinearse arriba del elemento con el `id` 
1.  ` android:layout_below="id"` indica que un debe alinearse debajo del elemento con el `id` 


## Glosario

- `gravity`: Alinea el contenido de un elemento

 
