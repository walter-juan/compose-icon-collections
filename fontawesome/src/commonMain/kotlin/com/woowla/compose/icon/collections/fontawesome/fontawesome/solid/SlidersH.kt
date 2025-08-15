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

public val SolidGroup.SlidersH: ImageVector
    get() {
        if (_slidersH != null) {
            return _slidersH!!
        }
        _slidersH = Builder(name = "SlidersH", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                curveTo(14.3f, 64.0f, 0.0f, 78.3f, 0.0f, 96.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(86.7f, 0.0f)
                curveToRelative(12.3f, 28.3f, 40.5f, 48.0f, 73.3f, 48.0f)
                reflectiveCurveToRelative(61.0f, -19.7f, 73.3f, -48.0f)
                lineTo(480.0f, 128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(265.3f, 64.0f)
                curveTo(253.0f, 35.7f, 224.8f, 16.0f, 192.0f, 16.0f)
                reflectiveCurveToRelative(-61.0f, 19.7f, -73.3f, 48.0f)
                lineTo(32.0f, 64.0f)
                close()
                moveTo(32.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(246.7f, 0.0f)
                curveToRelative(12.3f, 28.3f, 40.5f, 48.0f, 73.3f, 48.0f)
                reflectiveCurveToRelative(61.0f, -19.7f, 73.3f, -48.0f)
                lineToRelative(54.7f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-54.7f, 0.0f)
                curveToRelative(-12.3f, -28.3f, -40.5f, -48.0f, -73.3f, -48.0f)
                reflectiveCurveToRelative(-61.0f, 19.7f, -73.3f, 48.0f)
                lineTo(32.0f, 224.0f)
                close()
                moveTo(32.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(54.7f, 0.0f)
                curveToRelative(12.3f, 28.3f, 40.5f, 48.0f, 73.3f, 48.0f)
                reflectiveCurveToRelative(61.0f, -19.7f, 73.3f, -48.0f)
                lineTo(480.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-246.7f, 0.0f)
                curveToRelative(-12.3f, -28.3f, -40.5f, -48.0f, -73.3f, -48.0f)
                reflectiveCurveToRelative(-61.0f, 19.7f, -73.3f, 48.0f)
                lineTo(32.0f, 384.0f)
                close()
            }
        }
        .build()
        return _slidersH!!
    }

private var _slidersH: ImageVector? = null
