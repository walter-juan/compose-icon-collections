package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Hourglass2: ImageVector
    get() {
        if (_hourglass2 != null) {
            return _hourglass2!!
        }
        _hourglass2 = Builder(name = "Hourglass2", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                curveTo(0.0f, 10.7f, 10.7f, 0.0f, 24.0f, 0.0f)
                lineTo(360.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 19.0f)
                curveToRelative(0.0f, 40.3f, -16.0f, 79.0f, -44.5f, 107.5f)
                lineToRelative(-81.5f, 81.5f)
                lineToRelative(81.5f, 81.5f)
                curveTo(336.0f, 366.0f, 352.0f, 404.7f, 352.0f, 445.0f)
                lineToRelative(0.0f, 19.0f)
                lineToRelative(8.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, -19.0f)
                curveToRelative(0.0f, -40.3f, 16.0f, -79.0f, 44.5f, -107.5f)
                lineToRelative(81.5f, -81.5f)
                lineToRelative(-81.5f, -81.5f)
                curveTo(48.0f, 146.0f, 32.0f, 107.3f, 32.0f, 67.0f)
                lineToRelative(0.0f, -19.0f)
                lineToRelative(-8.0f, 0.0f)
                curveTo(10.7f, 48.0f, 0.0f, 37.3f, 0.0f, 24.0f)
                close()
                moveTo(110.5f, 371.5f)
                curveToRelative(-3.9f, 3.9f, -7.5f, 8.1f, -10.7f, 12.5f)
                lineToRelative(184.4f, 0.0f)
                curveToRelative(-3.2f, -4.4f, -6.8f, -8.6f, -10.7f, -12.5f)
                lineToRelative(-81.5f, -81.5f)
                lineToRelative(-81.5f, 81.5f)
                close()
                moveTo(80.8f, 432.0f)
                curveToRelative(-0.5f, 4.3f, -0.8f, 8.6f, -0.8f, 13.0f)
                lineToRelative(0.0f, 19.0f)
                lineToRelative(224.0f, 0.0f)
                lineToRelative(0.0f, -19.0f)
                curveToRelative(0.0f, -4.4f, -0.3f, -8.7f, -0.8f, -13.0f)
                lineTo(80.8f, 432.0f)
                close()
                moveTo(254.1f, 160.0f)
                lineToRelative(-124.1f, 0.0f)
                lineToRelative(62.1f, 62.1f)
                lineToRelative(62.1f, -62.1f)
                close()
                moveTo(293.8f, 112.0f)
                curveTo(300.4f, 98.1f, 304.0f, 82.7f, 304.0f, 67.0f)
                lineToRelative(0.0f, -19.0f)
                lineToRelative(-224.0f, 0.0f)
                lineToRelative(0.0f, 19.0f)
                curveToRelative(0.0f, 15.7f, 3.6f, 31.1f, 10.2f, 45.0f)
                lineToRelative(203.5f, 0.0f)
                close()
            }
        }
        .build()
        return _hourglass2!!
    }

private var _hourglass2: ImageVector? = null
