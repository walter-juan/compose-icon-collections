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

public val SolidGroup.BookOpenReader: ImageVector
    get() {
        if (_bookOpenReader != null) {
            return _bookOpenReader!!
        }
        _bookOpenReader = Builder(name = "BookOpenReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 152.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, 0.0f, -176.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, 0.0f, 176.0f)
                close()
                moveTo(256.0f, 450.7f)
                lineToRelative(0.0f, -149.3f)
                curveToRelative(16.3f, -6.8f, 32.9f, -13.7f, 49.7f, -20.7f)
                curveToRelative(39.0f, -16.2f, 80.8f, -24.6f, 123.1f, -24.6f)
                lineToRelative(19.2f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(-19.2f, 0.0f)
                curveToRelative(-59.1f, 0.0f, -117.7f, 11.7f, -172.3f, 34.5f)
                lineToRelative(-0.5f, 0.2f)
                close()
                moveTo(256.0f, 232.0f)
                lineToRelative(-25.1f, -10.5f)
                curveTo(184.1f, 202.0f, 133.9f, 192.0f, 83.2f, 192.0f)
                lineTo(48.0f, 192.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineTo(0.0f, 432.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(35.2f, 0.0f)
                curveToRelative(50.7f, 0.0f, 100.9f, 10.0f, 147.7f, 29.5f)
                lineToRelative(12.8f, 5.3f)
                curveToRelative(7.9f, 3.3f, 16.7f, 3.3f, 24.6f, 0.0f)
                lineToRelative(12.8f, -5.3f)
                curveToRelative(46.8f, -19.5f, 97.0f, -29.5f, 147.7f, -29.5f)
                lineToRelative(35.2f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -192.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-35.2f, 0.0f)
                curveToRelative(-50.7f, 0.0f, -100.9f, 10.0f, -147.7f, 29.5f)
                lineTo(256.0f, 232.0f)
                close()
            }
        }
        .build()
        return _bookOpenReader!!
    }

private var _bookOpenReader: ImageVector? = null
