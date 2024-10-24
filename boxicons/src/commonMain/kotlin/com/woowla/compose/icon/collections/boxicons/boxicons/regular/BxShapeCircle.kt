package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxShapeCircle: ImageVector
    get() {
        if (_bxShapeCircle != null) {
            return _bxShapeCircle!!
        }
        _bxShapeCircle = Builder(name = "BxShapeCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.494f, 9.05f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, -4.544f, -4.544f)
                curveTo(14.713f, 3.088f, 13.485f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(9.287f, 3.088f, 9.05f, 4.506f)
                arcTo(8.136f, 8.136f, 0.0f, false, false, 4.506f, 9.05f)
                curveTo(3.088f, 9.287f, 2.0f, 10.515f, 2.0f, 12.0f)
                reflectiveCurveToRelative(1.088f, 2.713f, 2.506f, 2.95f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, 4.544f, 4.544f)
                curveTo(9.287f, 20.912f, 10.515f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(2.713f, -1.088f, 2.95f, -2.506f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, 4.544f, -4.544f)
                curveTo(20.912f, 14.713f, 22.0f, 13.485f, 22.0f, 12.0f)
                reflectiveCurveToRelative(-1.088f, -2.713f, -2.506f, -2.95f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.06f, -0.023f, 0.11f, -0.034f, 0.167f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, true, -0.083f, 0.279f)
                curveToRelative(-0.014f, 0.027f, -0.034f, 0.049f, -0.051f, 0.075f)
                arcToRelative(1.062f, 1.062f, 0.0f, false, true, -0.16f, 0.209f)
                curveToRelative(-0.04f, 0.037f, -0.09f, 0.062f, -0.136f, 0.092f)
                curveToRelative(-0.054f, 0.036f, -0.104f, 0.078f, -0.165f, 0.103f)
                curveToRelative(-0.115f, 0.047f, -0.239f, 0.075f, -0.371f, 0.075f)
                reflectiveCurveToRelative(-0.256f, -0.028f, -0.371f, -0.075f)
                curveToRelative(-0.061f, -0.024f, -0.111f, -0.066f, -0.165f, -0.103f)
                curveToRelative(-0.046f, -0.03f, -0.096f, -0.055f, -0.136f, -0.092f)
                arcToRelative(1.062f, 1.062f, 0.0f, false, true, -0.16f, -0.209f)
                curveToRelative(-0.017f, -0.026f, -0.037f, -0.048f, -0.051f, -0.075f)
                arcToRelative(1.026f, 1.026f, 0.0f, false, true, -0.083f, -0.279f)
                curveTo(11.023f, 5.11f, 11.0f, 5.06f, 11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 11.0f)
                curveToRelative(0.06f, 0.0f, 0.11f, 0.023f, 0.167f, 0.034f)
                curveToRelative(0.099f, 0.017f, 0.194f, 0.041f, 0.279f, 0.083f)
                curveToRelative(0.027f, 0.014f, 0.049f, 0.034f, 0.075f, 0.051f)
                curveToRelative(0.075f, 0.047f, 0.149f, 0.097f, 0.209f, 0.16f)
                curveToRelative(0.037f, 0.04f, 0.062f, 0.09f, 0.092f, 0.136f)
                curveToRelative(0.036f, 0.054f, 0.078f, 0.104f, 0.103f, 0.165f)
                curveToRelative(0.047f, 0.115f, 0.075f, 0.239f, 0.075f, 0.371f)
                reflectiveCurveToRelative(-0.028f, 0.256f, -0.075f, 0.371f)
                curveToRelative(-0.024f, 0.061f, -0.066f, 0.111f, -0.103f, 0.165f)
                curveToRelative(-0.03f, 0.046f, -0.055f, 0.096f, -0.092f, 0.136f)
                curveToRelative(-0.06f, 0.063f, -0.134f, 0.113f, -0.209f, 0.16f)
                curveToRelative(-0.026f, 0.017f, -0.048f, 0.037f, -0.075f, 0.051f)
                arcToRelative(1.026f, 1.026f, 0.0f, false, true, -0.279f, 0.083f)
                curveTo(5.11f, 12.977f, 5.06f, 13.0f, 5.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.06f, 0.023f, -0.11f, 0.034f, -0.167f)
                curveToRelative(0.017f, -0.099f, 0.041f, -0.194f, 0.083f, -0.279f)
                curveToRelative(0.014f, -0.027f, 0.034f, -0.049f, 0.051f, -0.075f)
                curveToRelative(0.047f, -0.075f, 0.097f, -0.149f, 0.16f, -0.209f)
                curveToRelative(0.04f, -0.037f, 0.09f, -0.062f, 0.136f, -0.092f)
                curveToRelative(0.054f, -0.036f, 0.104f, -0.078f, 0.165f, -0.103f)
                curveToRelative(0.115f, -0.047f, 0.239f, -0.075f, 0.371f, -0.075f)
                reflectiveCurveToRelative(0.256f, 0.028f, 0.371f, 0.075f)
                curveToRelative(0.061f, 0.024f, 0.111f, 0.066f, 0.165f, 0.103f)
                curveToRelative(0.046f, 0.03f, 0.096f, 0.055f, 0.136f, 0.092f)
                curveToRelative(0.063f, 0.06f, 0.113f, 0.134f, 0.16f, 0.209f)
                curveToRelative(0.017f, 0.026f, 0.037f, 0.048f, 0.051f, 0.075f)
                curveToRelative(0.042f, 0.085f, 0.066f, 0.181f, 0.083f, 0.279f)
                curveToRelative(0.011f, 0.057f, 0.034f, 0.107f, 0.034f, 0.167f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(14.583f, 17.488f)
                curveToRelative(-0.006f, -0.011f, -0.017f, -0.019f, -0.022f, -0.029f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, -0.996f, -1.007f)
                curveToRelative(-0.054f, -0.033f, -0.109f, -0.06f, -0.166f, -0.09f)
                arcToRelative(2.902f, 2.902f, 0.0f, false, false, -0.486f, -0.205f)
                curveToRelative(-0.064f, -0.021f, -0.128f, -0.044f, -0.194f, -0.061f)
                curveToRelative(-0.233f, -0.057f, -0.471f, -0.096f, -0.719f, -0.096f)
                reflectiveCurveToRelative(-0.486f, 0.039f, -0.718f, 0.097f)
                curveToRelative(-0.066f, 0.017f, -0.13f, 0.039f, -0.195f, 0.061f)
                arcToRelative(2.928f, 2.928f, 0.0f, false, false, -0.485f, 0.205f)
                curveToRelative(-0.056f, 0.029f, -0.112f, 0.057f, -0.166f, 0.09f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, -0.996f, 1.007f)
                curveToRelative(-0.006f, 0.011f, -0.017f, 0.019f, -0.022f, 0.029f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, true, -2.905f, -2.905f)
                curveToRelative(0.011f, -0.006f, 0.019f, -0.017f, 0.029f, -0.022f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, 1.007f, -0.996f)
                curveToRelative(0.033f, -0.054f, 0.061f, -0.11f, 0.09f, -0.166f)
                curveToRelative(0.083f, -0.154f, 0.15f, -0.316f, 0.205f, -0.485f)
                curveToRelative(0.021f, -0.065f, 0.044f, -0.129f, 0.061f, -0.195f)
                curveToRelative(0.056f, -0.234f, 0.095f, -0.472f, 0.095f, -0.72f)
                reflectiveCurveToRelative(-0.039f, -0.486f, -0.097f, -0.718f)
                arcToRelative(2.568f, 2.568f, 0.0f, false, false, -0.061f, -0.194f)
                arcToRelative(2.902f, 2.902f, 0.0f, false, false, -0.205f, -0.486f)
                curveToRelative(-0.03f, -0.057f, -0.057f, -0.112f, -0.09f, -0.166f)
                arcTo(3.007f, 3.007f, 0.0f, false, false, 6.54f, 9.44f)
                curveToRelative(-0.01f, -0.006f, -0.018f, -0.017f, -0.028f, -0.023f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, true, 2.905f, -2.905f)
                curveToRelative(0.006f, 0.01f, 0.017f, 0.018f, 0.022f, 0.029f)
                curveToRelative(0.248f, 0.411f, 0.588f, 0.755f, 0.996f, 1.007f)
                curveToRelative(0.054f, 0.033f, 0.11f, 0.061f, 0.166f, 0.09f)
                curveToRelative(0.155f, 0.083f, 0.316f, 0.15f, 0.486f, 0.205f)
                curveToRelative(0.064f, 0.021f, 0.128f, 0.044f, 0.194f, 0.061f)
                curveToRelative(0.233f, 0.057f, 0.47f, 0.096f, 0.719f, 0.096f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, false, 0.912f, -0.158f)
                curveToRelative(0.17f, -0.055f, 0.331f, -0.122f, 0.486f, -0.205f)
                curveToRelative(0.056f, -0.029f, 0.112f, -0.057f, 0.166f, -0.09f)
                curveToRelative(0.408f, -0.252f, 0.748f, -0.596f, 0.996f, -1.007f)
                curveToRelative(0.006f, -0.011f, 0.017f, -0.019f, 0.022f, -0.029f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, true, 2.905f, 2.905f)
                curveToRelative(-0.011f, 0.006f, -0.019f, 0.017f, -0.029f, 0.022f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, -1.007f, 0.996f)
                curveToRelative(-0.033f, 0.054f, -0.061f, 0.11f, -0.09f, 0.166f)
                curveToRelative(-0.083f, 0.155f, -0.15f, 0.316f, -0.205f, 0.486f)
                curveToRelative(-0.021f, 0.064f, -0.044f, 0.128f, -0.061f, 0.194f)
                arcTo(3.07f, 3.07f, 0.0f, false, false, 16.0f, 12.0f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, false, 0.158f, 0.912f)
                curveToRelative(0.055f, 0.17f, 0.122f, 0.331f, 0.205f, 0.486f)
                curveToRelative(0.029f, 0.056f, 0.057f, 0.112f, 0.09f, 0.166f)
                curveToRelative(0.252f, 0.408f, 0.596f, 0.748f, 1.007f, 0.996f)
                curveToRelative(0.011f, 0.006f, 0.019f, 0.017f, 0.029f, 0.022f)
                arcToRelative(6.145f, 6.145f, 0.0f, false, true, -2.906f, 2.906f)
                close()
                moveTo(19.0f, 13.0f)
                curveToRelative(-0.06f, 0.0f, -0.11f, -0.023f, -0.167f, -0.034f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, true, -0.279f, -0.083f)
                curveToRelative(-0.027f, -0.014f, -0.049f, -0.034f, -0.075f, -0.051f)
                arcToRelative(1.062f, 1.062f, 0.0f, false, true, -0.209f, -0.16f)
                curveToRelative(-0.037f, -0.04f, -0.062f, -0.09f, -0.092f, -0.136f)
                curveToRelative(-0.036f, -0.054f, -0.078f, -0.104f, -0.103f, -0.165f)
                curveToRelative(-0.047f, -0.115f, -0.075f, -0.239f, -0.075f, -0.371f)
                reflectiveCurveToRelative(0.028f, -0.256f, 0.075f, -0.371f)
                curveToRelative(0.024f, -0.061f, 0.066f, -0.111f, 0.103f, -0.165f)
                curveToRelative(0.03f, -0.046f, 0.055f, -0.096f, 0.092f, -0.136f)
                curveToRelative(0.06f, -0.063f, 0.134f, -0.113f, 0.209f, -0.16f)
                curveToRelative(0.026f, -0.017f, 0.048f, -0.037f, 0.075f, -0.051f)
                curveToRelative(0.085f, -0.042f, 0.181f, -0.066f, 0.279f, -0.083f)
                curveToRelative(0.057f, -0.011f, 0.107f, -0.034f, 0.167f, -0.034f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxShapeCircle!!
    }

private var _bxShapeCircle: ImageVector? = null