package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.BugSlash: ImageVector
    get() {
        if (_bugSlash != null) {
            return _bugSlash!!
        }
        _bugSlash = Builder(name = "BugSlash", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, -24.9f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineTo(241.8f, 176.0f)
                lineTo(344.0f, 176.0f)
                curveToRelative(14.2f, 0.0f, 27.7f, 2.8f, 40.0f, 8.0f)
                lineToRelative(108.8f, -81.6f)
                curveToRelative(14.1f, -10.6f, 34.2f, -7.7f, 44.8f, 6.4f)
                reflectiveCurveToRelative(7.7f, 34.2f, -6.4f, 44.8f)
                lineToRelative(-97.8f, 73.3f)
                curveToRelative(5.3f, 8.9f, 9.3f, 18.7f, 11.8f, 29.1f)
                lineToRelative(98.8f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 9.5f, -0.8f, 18.7f, -2.4f, 27.8f)
                lineTo(569.0f, 503.1f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(7.0f, 9.1f)
                curveTo(-2.3f, -0.3f, -2.3f, -15.5f, 7.0f, -24.9f)
                close()
                moveTo(398.2f, 468.0f)
                curveToRelative(-23.2f, 22.1f, -53.0f, 37.2f, -86.2f, 42.2f)
                lineToRelative(0.0f, -128.4f)
                lineToRelative(86.2f, 86.2f)
                close()
                moveTo(264.0f, 333.8f)
                lineToRelative(0.0f, 176.4f)
                curveToRelative(-51.2f, -7.7f, -94.5f, -39.7f, -117.7f, -83.9f)
                lineTo(83.2f, 473.6f)
                curveToRelative(-14.1f, 10.6f, -34.2f, 7.7f, -44.8f, -6.4f)
                reflectiveCurveToRelative(-7.7f, -34.2f, 6.4f, -44.8f)
                lineToRelative(83.4f, -62.5f)
                curveToRelative(-0.1f, -2.6f, -0.2f, -5.2f, -0.2f, -7.9f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(98.8f, 0.0f)
                curveToRelative(3.3f, -13.9f, 9.3f, -26.7f, 17.6f, -37.8f)
                lineTo(264.0f, 333.8f)
                close()
                moveTo(355.6f, 128.0f)
                lineToRelative(-82.4f, 0.0f)
                lineToRelative(-72.3f, -72.3f)
                curveTo(216.1f, 22.8f, 249.4f, 0.0f, 288.0f, 0.0f)
                curveTo(341.0f, 0.0f, 384.0f, 43.0f, 384.0f, 96.0f)
                lineToRelative(0.0f, 3.6f)
                curveToRelative(0.0f, 15.7f, -12.7f, 28.4f, -28.4f, 28.4f)
                close()
            }
        }
        .build()
        return _bugSlash!!
    }

private var _bugSlash: ImageVector? = null
