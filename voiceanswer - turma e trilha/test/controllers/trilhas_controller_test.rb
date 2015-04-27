require 'test_helper'

class TrilhasControllerTest < ActionController::TestCase
  setup do
    @trilha = trilhas(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:trilhas)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create trilha" do
    assert_difference('Trilha.count') do
      post :create, trilha: { codigoTurma: @trilha.codigoTurma, nivel: @trilha.nivel, tagAssunto: @trilha.tagAssunto }
    end

    assert_redirected_to trilha_path(assigns(:trilha))
  end

  test "should show trilha" do
    get :show, id: @trilha
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @trilha
    assert_response :success
  end

  test "should update trilha" do
    patch :update, id: @trilha, trilha: { codigoTurma: @trilha.codigoTurma, nivel: @trilha.nivel, tagAssunto: @trilha.tagAssunto }
    assert_redirected_to trilha_path(assigns(:trilha))
  end

  test "should destroy trilha" do
    assert_difference('Trilha.count', -1) do
      delete :destroy, id: @trilha
    end

    assert_redirected_to trilhas_path
  end
end
