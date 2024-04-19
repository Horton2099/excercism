class Badge {
    public String print(Integer id, String name, String department) {
        return (id != null) ? "["+id+"]"+" - "+name+" - "+department.toUpperCase() : name+" - "+department.toUpperCase();
    }
}
