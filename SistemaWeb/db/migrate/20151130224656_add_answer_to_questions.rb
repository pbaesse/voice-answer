class AddAnswerToQuestions < ActiveRecord::Migration
  def change
    add_column :questions, :answer, :boolean
  end
end
