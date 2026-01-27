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

public val SolidGroup.BookDead: ImageVector
    get() {
        if (_bookDead != null) {
            return _bookDead!!
        }
        _bookDead = Builder(name = "BookDead", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 512.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(0.0f, -66.7f)
                curveToRelative(18.6f, -6.6f, 32.0f, -24.4f, 32.0f, -45.3f)
                lineToRelative(0.0f, -288.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(96.0f, 0.0f)
                curveTo(43.0f, 0.0f, 0.0f, 43.0f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                close()
                moveTo(64.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(256.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-256.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(272.0f, 163.2f)
                lineToRelative(0.0f, 12.8f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -12.8f)
                curveToRelative(-19.4f, -11.7f, -32.0f, -30.3f, -32.0f, -51.2f)
                curveToRelative(0.0f, -35.3f, 35.8f, -64.0f, 80.0f, -64.0f)
                reflectiveCurveToRelative(80.0f, 28.7f, 80.0f, 64.0f)
                curveToRelative(0.0f, 20.9f, -12.6f, 39.5f, -32.0f, 51.2f)
                close()
                moveTo(208.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(256.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
                moveTo(330.2f, 223.7f)
                curveToRelative(4.6f, 10.1f, 0.1f, 21.9f, -9.9f, 26.5f)
                lineToRelative(-47.9f, 21.8f)
                lineToRelative(47.9f, 21.8f)
                curveToRelative(10.1f, 4.6f, 14.5f, 16.4f, 9.9f, 26.5f)
                reflectiveCurveToRelative(-16.4f, 14.5f, -26.5f, 9.9f)
                lineTo(224.0f, 294.0f)
                lineTo(144.3f, 330.2f)
                curveToRelative(-10.1f, 4.6f, -21.9f, 0.1f, -26.5f, -9.9f)
                reflectiveCurveToRelative(-0.1f, -21.9f, 9.9f, -26.5f)
                lineToRelative(47.9f, -21.8f)
                lineToRelative(-47.9f, -21.8f)
                curveToRelative(-10.1f, -4.6f, -14.5f, -16.4f, -9.9f, -26.5f)
                reflectiveCurveToRelative(16.4f, -14.5f, 26.5f, -9.9f)
                lineTo(224.0f, 250.0f)
                lineTo(303.7f, 213.8f)
                curveToRelative(10.1f, -4.6f, 21.9f, -0.1f, 26.5f, 9.9f)
                close()
            }
        }
        .build()
        return _bookDead!!
    }

private var _bookDead: ImageVector? = null
