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

public val SolidGroup.WheelchairMove: ImageVector
    get() {
        if (_wheelchairMove != null) {
            return _wheelchairMove!!
        }
        _wheelchairMove = Builder(name = "WheelchairMove", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 56.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                close()
                moveTo(205.4f, 124.1f)
                curveToRelative(-6.4f, -5.2f, -15.6f, -4.7f, -21.4f, 1.1f)
                lineToRelative(-33.4f, 33.4f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(138.8f, 80.0f)
                curveToRelative(29.0f, -29.0f, 75.2f, -31.4f, 107.0f, -5.5f)
                lineToRelative(81.3f, 66.0f)
                curveToRelative(21.4f, 17.4f, 23.8f, 49.2f, 5.2f, 69.5f)
                lineToRelative(-41.8f, 46.0f)
                lineToRelative(98.0f, 0.0f)
                curveToRelative(30.3f, 0.0f, 53.0f, 27.7f, 47.1f, 57.4f)
                lineTo(407.4f, 454.3f)
                curveToRelative(-3.5f, 17.3f, -20.3f, 28.6f, -37.7f, 25.1f)
                reflectiveCurveToRelative(-28.6f, -20.3f, -25.1f, -37.7f)
                lineTo(369.0f, 320.0f)
                lineTo(316.8f, 320.0f)
                curveToRelative(2.1f, 10.3f, 3.2f, 21.0f, 3.2f, 32.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                reflectiveCurveTo(0.0f, 440.4f, 0.0f, 352.0f)
                reflectiveCurveTo(71.6f, 192.0f, 160.0f, 192.0f)
                curveToRelative(6.0f, 0.0f, 11.9f, 0.3f, 17.8f, 1.0f)
                lineToRelative(50.4f, -50.4f)
                lineToRelative(-22.7f, -18.5f)
                close()
                moveTo(160.0f, 448.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, -192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, 192.0f)
                close()
            }
        }
        .build()
        return _wheelchairMove!!
    }

private var _wheelchairMove: ImageVector? = null
