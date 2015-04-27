class CreateTrilhas < ActiveRecord::Migration
  def change
    create_table :trilhas do |t|
      t.float :nivel
      t.string :tagAssunto
      t.string :codigoTurma

      t.timestamps
    end
  end
end
