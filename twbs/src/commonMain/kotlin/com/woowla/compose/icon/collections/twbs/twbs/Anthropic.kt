package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Anthropic: ImageVector
    get() {
        if (_anthropic != null) {
            return _anthropic!!
        }
        _anthropic = Builder(name = "Anthropic", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.218f, 2.0f)
                horizontalLineToRelative(2.402f)
                lineTo(16.0f, 12.987f)
                horizontalLineToRelative(-2.402f)
                close()
                moveTo(4.379f, 2.0f)
                horizontalLineToRelative(2.512f)
                lineToRelative(4.38f, 10.987f)
                lineTo(8.82f, 12.987f)
                lineToRelative(-0.895f, -2.308f)
                horizontalLineToRelative(-4.58f)
                lineToRelative(-0.896f, 2.307f)
                lineTo(0.0f, 12.986f)
                lineTo(4.38f, 2.001f)
                close()
                moveTo(7.134f, 8.64f)
                lineTo(5.635f, 4.777f)
                lineTo(4.137f, 8.64f)
                close()
            }
        }
        .build()
        return _anthropic!!
    }

private var _anthropic: ImageVector? = null
