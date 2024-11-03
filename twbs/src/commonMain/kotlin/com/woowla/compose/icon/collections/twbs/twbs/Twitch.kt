package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.857f, 0.0f)
                lineTo(1.0f, 2.857f)
                verticalLineToRelative(10.286f)
                horizontalLineToRelative(3.429f)
                lineTo(4.429f, 16.0f)
                lineToRelative(2.857f, -2.857f)
                lineTo(9.57f, 13.143f)
                lineTo(14.714f, 8.0f)
                lineTo(14.714f, 0.0f)
                close()
                moveTo(13.571f, 7.429f)
                lineTo(11.286f, 9.714f)
                lineTo(9.0f, 9.714f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.429f, 9.714f)
                lineTo(4.429f, 1.143f)
                horizontalLineToRelative(9.142f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.857f, 3.143f)
                horizontalLineToRelative(-1.143f)
                lineTo(10.714f, 6.57f)
                horizontalLineToRelative(1.143f)
                close()
                moveTo(8.714f, 3.143f)
                lineTo(7.571f, 3.143f)
                lineTo(7.571f, 6.57f)
                horizontalLineToRelative(1.143f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
