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

public val SolidGroup.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(name = "BookBookmark", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
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
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 169.4f)
                curveToRelative(0.0f, 12.5f, -10.1f, 22.6f, -22.6f, 22.6f)
                curveToRelative(-6.0f, 0.0f, -11.8f, -2.4f, -16.0f, -6.6f)
                lineTo(272.0f, 144.0f)
                lineTo(230.6f, 185.4f)
                curveToRelative(-4.2f, 4.2f, -10.0f, 6.6f, -16.0f, 6.6f)
                curveToRelative(-12.5f, 0.0f, -22.6f, -10.1f, -22.6f, -22.6f)
                lineTo(192.0f, 0.0f)
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
            }
        }
        .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
