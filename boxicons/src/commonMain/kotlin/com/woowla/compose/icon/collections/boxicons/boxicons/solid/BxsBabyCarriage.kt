package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBabyCarriage: ImageVector
    get() {
        if (_bxsBabyCarriage != null) {
            return _bxsBabyCarriage!!
        }
        _bxsBabyCarriage = Builder(name = "BxsBabyCarriage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.666f, 12.277f)
                arcToRelative(7.72f, 7.72f, 0.0f, false, false, 0.171f, -0.665f)
                curveToRelative(0.003f, -0.017f, 0.004f, -0.033f, 0.008f, -0.05f)
                curveToRelative(0.02f, -0.098f, 0.029f, -0.199f, 0.045f, -0.298f)
                curveToRelative(0.025f, -0.157f, 0.055f, -0.313f, 0.07f, -0.471f)
                arcToRelative(7.979f, 7.979f, 0.0f, false, false, -2.303f, -6.45f)
                arcTo(7.979f, 7.979f, 0.0f, false, false, 14.0f, 2.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.517f, 10.0f)
                lineToRelative(-0.858f, -2.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.341f)
                lineToRelative(1.828f, 4.266f)
                arcTo(3.504f, 3.504f, 0.0f, false, false, 4.0f, 17.5f)
                curveTo(4.0f, 19.43f, 5.57f, 21.0f, 7.5f, 21.0f)
                curveToRelative(1.759f, 0.0f, 3.204f, -1.309f, 3.449f, -3.0f)
                horizontalLineToRelative(2.102f)
                curveToRelative(0.245f, 1.691f, 1.69f, 3.0f, 3.449f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.63f, -0.181f, -1.213f, -0.473f, -1.725f)
                curveToRelative(0.042f, -0.041f, 0.089f, -0.077f, 0.131f, -0.119f)
                curveToRelative(0.36f, -0.361f, 0.688f, -0.759f, 0.977f, -1.184f)
                curveToRelative(0.288f, -0.43f, 0.536f, -0.886f, 0.736f, -1.359f)
                curveToRelative(0.016f, -0.037f, 0.026f, -0.076f, 0.041f, -0.113f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.015f, -0.042f)
                curveToRelative(0.088f, -0.22f, 0.168f, -0.441f, 0.235f, -0.668f)
                lineToRelative(0.003f, -0.013f)
                close()
                moveTo(7.5f, 19.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveTo(6.673f, 16.0f, 7.5f, 16.0f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveTo(8.327f, 19.0f, 7.5f, 19.0f)
                close()
                moveTo(16.5f, 19.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bxsBabyCarriage!!
    }

private var _bxsBabyCarriage: ImageVector? = null
