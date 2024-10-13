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

public val SolidGroup.BxsNetworkChart: ImageVector
    get() {
        if (_bxsNetworkChart != null) {
            return _bxsNetworkChart!!
        }
        _bxsNetworkChart = Builder(name = "BxsNetworkChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 3.0f)
                arcTo(2.502f, 2.502f, 0.0f, false, false, 17.0f, 5.5f)
                curveToRelative(0.0f, 0.357f, 0.078f, 0.696f, 0.214f, 1.005f)
                lineToRelative(-1.955f, 2.199f)
                arcTo(3.977f, 3.977f, 0.0f, false, false, 13.0f, 8.0f)
                curveToRelative(-0.74f, 0.0f, -1.424f, 0.216f, -2.019f, 0.566f)
                lineTo(8.707f, 6.293f)
                lineToRelative(-0.023f, 0.023f)
                curveTo(8.88f, 5.918f, 9.0f, 5.475f, 9.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, 3.0f)
                curveToRelative(0.475f, 0.0f, 0.917f, -0.12f, 1.316f, -0.316f)
                lineToRelative(-0.023f, 0.023f)
                lineTo(9.567f, 9.98f)
                arcTo(3.956f, 3.956f, 0.0f, false, false, 9.0f, 12.0f)
                curveToRelative(0.0f, 0.997f, 0.38f, 1.899f, 0.985f, 2.601f)
                lineToRelative(-2.577f, 2.576f)
                arcTo(2.472f, 2.472f, 0.0f, false, false, 6.5f, 17.0f)
                curveTo(5.122f, 17.0f, 4.0f, 18.121f, 4.0f, 19.5f)
                reflectiveCurveTo(5.122f, 22.0f, 6.5f, 22.0f)
                reflectiveCurveTo(9.0f, 20.879f, 9.0f, 19.5f)
                curveToRelative(0.0f, -0.321f, -0.066f, -0.626f, -0.177f, -0.909f)
                lineToRelative(2.838f, -2.838f)
                curveToRelative(0.421f, 0.15f, 0.867f, 0.247f, 1.339f, 0.247f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -0.636f, -0.163f, -1.229f, -0.428f, -1.764f)
                lineToRelative(2.117f, -2.383f)
                curveToRelative(0.256f, 0.088f, 0.526f, 0.147f, 0.811f, 0.147f)
                curveTo(20.879f, 8.0f, 22.0f, 6.879f, 22.0f, 5.5f)
                reflectiveCurveTo(20.879f, 3.0f, 19.5f, 3.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsNetworkChart!!
    }

private var _bxsNetworkChart: ImageVector? = null
