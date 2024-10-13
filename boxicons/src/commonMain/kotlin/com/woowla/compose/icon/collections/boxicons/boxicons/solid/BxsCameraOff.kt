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

public val SolidGroup.BxsCameraOff: ImageVector
    get() {
        if (_bxsCameraOff != null) {
            return _bxsCameraOff!!
        }
        _bxsCameraOff = Builder(name = "BxsCameraOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(11.879f)
                lineToRelative(-3.083f, -3.083f)
                arcTo(4.774f, 4.774f, 0.0f, false, true, 12.0f, 17.0f)
                curveToRelative(-2.71f, 0.0f, -5.0f, -2.29f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.271f, 0.039f, -0.535f, 0.083f, -0.796f)
                lineTo(2.144f, 6.265f)
                curveTo(2.054f, 6.493f, 2.0f, 6.74f, 2.0f, 7.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-2.707f, -2.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 14.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.707f, 0.293f)
                lineTo(6.586f, 5.0f)
                horizontalLineToRelative(-0.172f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.626f, -0.626f)
                arcTo(1.98f, 1.98f, 0.0f, false, false, 22.0f, 18.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.688f, 13.274f)
                arcTo(2.86f, 2.86f, 0.0f, false, false, 15.0f, 12.0f)
                curveToRelative(0.0f, -1.626f, -1.374f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.456f, 0.0f, -0.884f, 0.12f, -1.274f, 0.312f)
                lineToRelative(-1.46f, -1.46f)
                arcTo(4.88f, 4.88f, 0.0f, false, true, 12.0f, 7.0f)
                curveToRelative(2.71f, 0.0f, 5.0f, 2.29f, 5.0f, 5.0f)
                arcToRelative(4.88f, 4.88f, 0.0f, false, true, -0.852f, 2.734f)
                lineToRelative(-1.46f, -1.46f)
                close()
            }
        }
        .build()
        return _bxsCameraOff!!
    }

private var _bxsCameraOff: ImageVector? = null
