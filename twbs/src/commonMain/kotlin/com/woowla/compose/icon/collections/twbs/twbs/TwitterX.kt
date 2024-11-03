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

public val Twbs.TwitterX: ImageVector
    get() {
        if (_twitterX != null) {
            return _twitterX!!
        }
        _twitterX = Builder(name = "TwitterX", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6f, 0.75f)
                horizontalLineToRelative(2.454f)
                lineToRelative(-5.36f, 6.142f)
                lineTo(16.0f, 15.25f)
                horizontalLineToRelative(-4.937f)
                lineToRelative(-3.867f, -5.07f)
                lineToRelative(-4.425f, 5.07f)
                lineTo(0.316f, 15.25f)
                lineToRelative(5.733f, -6.57f)
                lineTo(0.0f, 0.75f)
                horizontalLineToRelative(5.063f)
                lineToRelative(3.495f, 4.633f)
                lineTo(12.601f, 0.75f)
                close()
                moveTo(11.74f, 13.778f)
                horizontalLineToRelative(1.36f)
                lineTo(4.323f, 2.145f)
                lineTo(2.865f, 2.145f)
                close()
            }
        }
        .build()
        return _twitterX!!
    }

private var _twitterX: ImageVector? = null
