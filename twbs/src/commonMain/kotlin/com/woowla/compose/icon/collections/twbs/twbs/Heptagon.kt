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

public val Twbs.Heptagon: ImageVector
    get() {
        if (_heptagon != null) {
            return _heptagon!!
        }
        _heptagon = Builder(name = "Heptagon", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.779f, 0.052f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.442f, 0.0f)
                lineToRelative(6.015f, 2.97f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.267f, 0.34f)
                lineToRelative(1.485f, 6.676f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.093f, 0.415f)
                lineToRelative(-4.162f, 5.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.395f, 0.193f)
                horizontalLineTo(4.662f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.395f, -0.193f)
                lineTo(0.105f, 10.453f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.093f, -0.415f)
                lineToRelative(1.485f, -6.676f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.267f, -0.34f)
                close()
                moveTo(2.422f, 3.813f)
                lineToRelative(-1.383f, 6.212f)
                lineTo(4.907f, 15.0f)
                horizontalLineToRelative(6.186f)
                lineToRelative(3.868f, -4.975f)
                lineToRelative(-1.383f, -6.212f)
                lineTo(8.0f, 1.058f)
                close()
            }
        }
        .build()
        return _heptagon!!
    }

private var _heptagon: ImageVector? = null
