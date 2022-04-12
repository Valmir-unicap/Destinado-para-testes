public void inserirOrdenado(Aluno al){
        Node novo= new Node(al);
        Node aux, recebe;   
        if(this.isEmpty()==true){
            System.out.println("Lista vázia!");
            this.primeiro=novo;
            this.ultimo=novo;
            this.qtd++;
            System.out.println("Inserção efetuada!");
        }else if(al.compareTo(this.primeiro.getInfo())<0){
                novo.setProx(this.primeiro);
                this.primeiro= novo;
                this.qtd++;
                System.out.println("Inserção realizada!");
            }else if (al.compareTo(this.ultimo.getInfo())>0){
                this.ultimo.setProx(novo);
                this.ultimo= novo;
                this.qtd++;  
                System.out.println("Inserção realizada!");
        }else{
                aux= this.primeiro;
                while(aux!=null){
                    if(novo.getInfo().compareTo(aux.getInfo())>0){
                        recebe= aux.getProx();
                        aux.setProx(novo);
                        novo.setProx(recebe);
                        this.qtd++;
                        System.out.println("Inserção efetuada!");
                    }
                    aux=aux.getProx();
                }
                  System.out.println("Repetido! Inserção não foi realizada!");
            }
