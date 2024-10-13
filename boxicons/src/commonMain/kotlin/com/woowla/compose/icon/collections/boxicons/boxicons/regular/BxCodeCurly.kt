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

public val RegularGroup.BxCodeCurly: ImageVector
    get() {
        if (_bxCodeCurly != null) {
            return _bxCodeCurly!!
        }
        _bxCodeCurly = Builder(name = "BxCodeCurly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.989f)
                curveTo(8.703f, 19.994f, 6.0f, 19.827f, 6.0f, 16.0f)
                curveToRelative(0.0f, -1.993f, -0.665f, -3.246f, -1.502f, -4.0f)
                curveTo(5.335f, 11.246f, 6.0f, 9.993f, 6.0f, 8.0f)
                curveToRelative(0.0f, -3.827f, 2.703f, -3.994f, 3.0f, -4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.0f, 2.0f)
                lineTo(8.998f, 2.0f)
                curveTo(7.269f, 2.004f, 4.0f, 3.264f, 4.0f, 8.0f)
                curveToRelative(0.0f, 2.8f, -1.678f, 2.99f, -2.014f, 3.0f)
                lineTo(2.0f, 13.0f)
                curveToRelative(0.082f, 0.0f, 2.0f, 0.034f, 2.0f, 3.0f)
                curveToRelative(0.0f, 4.736f, 3.269f, 5.996f, 5.0f, 6.0f)
                close()
                moveTo(22.0f, 11.0f)
                curveToRelative(-0.082f, 0.0f, -2.0f, -0.034f, -2.0f, -3.0f)
                curveToRelative(0.0f, -4.736f, -3.269f, -5.996f, -5.0f, -6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.989f)
                curveToRelative(0.308f, 0.006f, 3.011f, 0.173f, 3.011f, 4.0f)
                curveToRelative(0.0f, 1.993f, 0.665f, 3.246f, 1.502f, 4.0f)
                curveToRelative(-0.837f, 0.754f, -1.502f, 2.007f, -1.502f, 4.0f)
                curveToRelative(0.0f, 3.827f, -2.703f, 3.994f, -3.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.002f)
                curveTo(16.731f, 21.996f, 20.0f, 20.736f, 20.0f, 16.0f)
                curveToRelative(0.0f, -2.8f, 1.678f, -2.99f, 2.014f, -3.0f)
                lineTo(22.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bxCodeCurly!!
    }

private var _bxCodeCurly: ImageVector? = null
