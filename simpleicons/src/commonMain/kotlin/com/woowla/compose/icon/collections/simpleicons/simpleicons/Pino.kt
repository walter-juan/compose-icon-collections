package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Pino: ImageVector
    get() {
        if (_pino != null) {
            return _pino!!
        }
        _pino = Builder(name = "Pino", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.225f, 5.555f)
                lineToRelative(2.789f, 5.472f)
                lineToRelative(2.756f, -5.505f)
                lineTo(11.999f, 0.0f)
                moveTo(1.979f, 20.123f)
                horizontalLineToRelative(13.769f)
                verticalLineToRelative(-0.037f)
                lineTo(8.862f, 6.29f)
                moveToRelative(3.524f, 5.522f)
                lineToRelative(4.131f, 8.311f)
                horizontalLineToRelative(5.505f)
                lineTo(15.137f, 6.291f)
                moveTo(4.5f, 24.0f)
                horizontalLineToRelative(14.87f)
                lineToRelative(-1.554f, -3.188f)
                horizontalLineTo(6.056f)
            }
        }
        .build()
        return _pino!!
    }

private var _pino: ImageVector? = null
