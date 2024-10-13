package com.woowla.compose.icon.collections.devicons.devicons.erlang

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ErlangGroup

public val ErlangGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFA90533)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2f, 24.1f)
                lineTo(1.0f, 24.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(19.7f)
                verticalLineToRelative(-0.1f)
                curveTo(11.0f, 93.6f, 5.2f, 79.2f, 5.3f, 62.1f)
                curveTo(5.2f, 47.0f, 10.0f, 33.9f, 18.2f, 24.1f)
                close()
                moveTo(111.1f, 103.9f)
                close()
                moveTo(127.0f, 24.0f)
                horizontalLineToRelative(-16.4f)
                curveToRelative(6.2f, 9.0f, 9.6f, 19.3f, 9.1f, 32.1f)
                curveToRelative(0.1f, 1.2f, 0.1f, 1.9f, 0.0f, 4.9f)
                lineTo(46.3f, 61.0f)
                curveToRelative(0.0f, 22.0f, 7.7f, 38.3f, 27.3f, 38.4f)
                curveToRelative(13.5f, -0.1f, 23.2f, -10.1f, 29.9f, -20.9f)
                lineToRelative(19.0f, 9.5f)
                curveToRelative(-3.4f, 6.1f, -7.2f, 11.0f, -11.4f, 16.0f)
                lineTo(127.0f, 104.0f)
                lineTo(127.0f, 24.0f)
                close()
                moveTo(110.5f, 24.1f)
                close()
                moveTo(65.1f, 25.6f)
                curveToRelative(-9.0f, 0.0f, -16.8f, 7.4f, -17.6f, 16.4f)
                lineTo(81.0f, 42.0f)
                curveToRelative(-0.3f, -9.0f, -6.8f, -16.4f, -15.9f, -16.4f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
