class Chinese {

    private static Chinese a = new Chinese();

    private Chinese() {
    }

    public static Chinese getInstance() {
        return a;
    }

}
//        class Chinese {
//
//            private Chinese() {
//            }
//
//            public static Chinese getInstance() {
//                return new Chinese();
//            }
//
//        }
