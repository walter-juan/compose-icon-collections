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

public val RegularGroup.BxBone: ImageVector
    get() {
        if (_bxBone != null) {
            return _bxBone!!
        }
        _bxBone = Builder(name = "BxBone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.049f, 4.951f)
                arcToRelative(3.953f, 3.953f, 0.0f, false, false, -1.028f, -1.801f)
                curveToRelative(-1.51f, -1.51f, -4.146f, -1.51f, -5.656f, 0.0f)
                arcToRelative(4.009f, 4.009f, 0.0f, false, false, -0.618f, 4.86f)
                lineToRelative(-3.714f, 3.714f)
                curveToRelative(-1.505f, -0.89f, -3.591f, -0.649f, -4.86f, 0.618f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, false, 0.0f, 5.657f)
                arcToRelative(3.946f, 3.946f, 0.0f, false, false, 1.8f, 1.028f)
                curveToRelative(0.178f, 0.681f, 0.53f, 1.302f, 1.028f, 1.8f)
                arcTo(3.966f, 3.966f, 0.0f, false, false, 8.829f, 22.0f)
                arcToRelative(3.973f, 3.973f, 0.0f, false, false, 2.828f, -1.172f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, false, 0.617f, -4.859f)
                lineToRelative(3.714f, -3.714f)
                curveToRelative(1.507f, 0.891f, 3.593f, 0.65f, 4.861f, -0.619f)
                arcToRelative(4.003f, 4.003f, 0.0f, false, false, 0.0f, -5.656f)
                arcToRelative(3.942f, 3.942f, 0.0f, false, false, -1.8f, -1.029f)
                close()
                moveTo(19.436f, 10.222f)
                curveToRelative(-0.756f, 0.755f, -2.073f, 0.756f, -2.829f, 0.0f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-6.363f, 6.364f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, 0.0f, 2.828f)
                curveToRelative(-0.757f, 0.757f, -2.074f, 0.755f, -2.829f, 0.0f)
                arcToRelative(1.963f, 1.963f, 0.0f, false, true, -0.571f, -1.31f)
                lineToRelative(-0.047f, -0.9f)
                lineToRelative(-0.9f, -0.047f)
                arcToRelative(1.972f, 1.972f, 0.0f, false, true, -1.31f, -0.571f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, 0.0f, -2.829f)
                curveToRelative(0.377f, -0.377f, 0.879f, -0.585f, 1.413f, -0.585f)
                reflectiveCurveToRelative(1.036f, 0.208f, 1.414f, 0.585f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(6.364f, -6.363f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, 0.0f, -2.829f)
                curveToRelative(0.756f, -0.754f, 2.072f, -0.754f, 2.828f, 0.0f)
                curveToRelative(0.343f, 0.343f, 0.546f, 0.809f, 0.572f, 1.312f)
                lineToRelative(0.048f, 0.897f)
                lineToRelative(0.897f, 0.048f)
                curveToRelative(0.503f, 0.026f, 0.969f, 0.229f, 1.312f, 0.572f)
                curveToRelative(0.377f, 0.378f, 0.585f, 0.88f, 0.585f, 1.414f)
                reflectiveCurveToRelative(-0.207f, 1.036f, -0.584f, 1.414f)
                close()
            }
        }
        .build()
        return _bxBone!!
    }

private var _bxBone: ImageVector? = null
