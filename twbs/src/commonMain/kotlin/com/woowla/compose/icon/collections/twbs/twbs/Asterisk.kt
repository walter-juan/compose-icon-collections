package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.268f)
                lineToRelative(4.562f, -2.634f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.732f)
                lineTo(10.0f, 8.0f)
                lineToRelative(4.562f, 2.634f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.732f)
                lineTo(9.0f, 9.732f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(9.732f)
                lineToRelative(-4.562f, 2.634f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.732f)
                lineTo(6.0f, 8.0f)
                lineTo(1.438f, 5.366f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.732f)
                lineTo(7.0f, 6.268f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
