package myPractice.getterSetter.chain;

public class Chain {

    private Link firstLink;

    public Chain(Link firstLink) {
        this.firstLink = firstLink;
    }

    public Link getFirstLink() {
        return firstLink;
    }

    public void addLink(Link newLink){
     newLink.setNextLink(firstLink);
     this.firstLink=newLink;
    }
    public void printOut(){
        System.out.println(firstLink.getValue());
        Link currentLink=firstLink;
        while(currentLink.getNextLink()!=null){
            System.out.println(currentLink.getNextLink().getValue());
            currentLink=currentLink.getNextLink();
        }
    }
}
