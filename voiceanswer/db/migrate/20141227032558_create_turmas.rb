class CreateTurmas < ActiveRecord::Migration
  def change
    create_table :turmas do |t|
      t.string :codigo
      t.string :nTurma

      t.timestamps
    end
  end
end
