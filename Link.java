public class Link
{
    private Link next;
    
    public Link()
    {
        next = null;
    }
    
    public void link(Link thing)
    {
        next = thing;
    }
    
    public Link getLink()
    {
        return next;
    }  
}