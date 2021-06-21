try {
  new File("/").delete();
} catch (Exception ignored) {
  System.out.println("fu");
}
