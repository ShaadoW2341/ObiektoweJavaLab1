class Wieloryb extends Ryba implements Plywanie {

    @Override
    public void plyn() {
        System.out.println("Wieloryb płynie po wodzie.");
    }

    @Override
    public void wynurz() {
        System.out.println("Wieloryb wynurza się z wody.");
    }

    @Override
    public void zanurz() {
        System.out.println("Wieloryb zanurza się w wodzie.");
    }
}