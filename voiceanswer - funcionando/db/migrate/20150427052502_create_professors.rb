class CreateProfessors < ActiveRecord::Migration
  def change
    create_table :professors do |t|
      t.string :nome
      t.float :matricula
      t.string :email
      t.string :senha
      t.string :foto

      t.timestamps
    end
  end
end
