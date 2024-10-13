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

public val RegularGroup.BxHide: ImageVector
    get() {
        if (_bxHide != null) {
            return _bxHide!!
        }
        _bxHide = Builder(name = "BxHide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveToRelative(0.946f, 0.0f, 1.81f, -0.103f, 2.598f, -0.281f)
                lineToRelative(-1.757f, -1.757f)
                curveToRelative(-0.273f, 0.021f, -0.55f, 0.038f, -0.841f, 0.038f)
                curveToRelative(-5.351f, 0.0f, -7.424f, -3.846f, -7.926f, -5.0f)
                arcToRelative(8.642f, 8.642f, 0.0f, false, true, 1.508f, -2.297f)
                lineTo(4.184f, 8.305f)
                curveToRelative(-1.538f, 1.667f, -2.121f, 3.346f, -2.132f, 3.379f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, 0.0f, 0.633f)
                curveTo(2.073f, 12.383f, 4.367f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-1.837f, 0.0f, -3.346f, 0.396f, -4.604f, 0.981f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.319f, -3.319f)
                curveToRelative(2.614f, -1.951f, 3.547f, -4.615f, 3.561f, -4.657f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, 0.0f, -0.633f)
                curveTo(21.927f, 11.617f, 19.633f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(16.972f, 15.558f)
                lineTo(14.692f, 13.278f)
                curveToRelative(0.19f, -0.39f, 0.308f, -0.819f, 0.308f, -1.278f)
                curveToRelative(0.0f, -1.641f, -1.359f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.459f, 0.0f, -0.888f, 0.118f, -1.277f, 0.309f)
                lineTo(8.915f, 7.501f)
                arcTo(9.26f, 9.26f, 0.0f, false, true, 12.0f, 7.0f)
                curveToRelative(5.351f, 0.0f, 7.424f, 3.846f, 7.926f, 5.0f)
                curveToRelative(-0.302f, 0.692f, -1.166f, 2.342f, -2.954f, 3.558f)
                close()
            }
        }
        .build()
        return _bxHide!!
    }

private var _bxHide: ImageVector? = null
