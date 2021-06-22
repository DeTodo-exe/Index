public void insertar(Item it, int key){
        Node añadir = new Node();
        añadir.key = key;
        añadir.item = it;
        if(this.raiz == null){
            this.raiz = añadir;
        }
        else{
            Node aux = this.raiz;
            Node padre = null;
            while(aux!=null){
                padre = aux;
                if (key> aux.key){
                    aux = aux.hijoDerecho;
                }
                else if(key< aux.key){
                    aux = aux.hijoIzquierdo;
                }
                else{
                    System.out.println("Ya está");
                    break;
                }
            }
            System.out.println(padre.key);
            System.out.println(añadir.key);
            System.out.println("/////////////////////");
            if (key > padre.key){
                padre.hijoDerecho = añadir;
                this.derechos++;
                System.out.println("Derecha");
            }
            else{
                padre.hijoIzquierdo = añadir;
                this.izquierdos++;
                System.out.println("Izquierda");
            }
        }
    }
