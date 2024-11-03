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

public val Twbs.Snow2: ImageVector
    get() {
        if (_snow2 != null) {
            return _snow2!!
        }
        _snow2 = Builder(name = "Snow2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.293f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.708f)
                lineTo(7.5f, 12.793f)
                verticalLineToRelative(-1.086f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.708f)
                lineTo(7.5f, 10.293f)
                verticalLineTo(8.866f)
                lineToRelative(-1.236f, 0.713f)
                lineToRelative(-0.495f, 1.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.966f, -0.26f)
                lineToRelative(0.237f, -0.882f)
                lineToRelative(-0.94f, 0.542f)
                lineToRelative(-0.496f, 1.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.966f, -0.26f)
                lineToRelative(0.237f, -0.882f)
                lineToRelative(-1.12f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.866f)
                lineToRelative(1.12f, -0.646f)
                lineToRelative(-0.884f, -0.237f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.26f, -0.966f)
                lineToRelative(1.848f, 0.495f)
                lineToRelative(0.94f, -0.542f)
                lineToRelative(-0.882f, -0.237f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.258f, -0.966f)
                lineToRelative(1.85f, 0.495f)
                lineTo(7.0f, 8.0f)
                lineToRelative(-1.236f, -0.713f)
                lineToRelative(-1.849f, 0.495f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.258f, -0.966f)
                lineToRelative(0.883f, -0.237f)
                lineToRelative(-0.94f, -0.542f)
                lineToRelative(-1.85f, 0.495f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.258f, -0.966f)
                lineToRelative(0.883f, -0.237f)
                lineToRelative(-1.12f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.5f, -0.866f)
                lineToRelative(1.12f, 0.646f)
                lineToRelative(-0.237f, -0.883f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.966f, -0.258f)
                lineToRelative(0.495f, 1.849f)
                lineToRelative(0.94f, 0.542f)
                lineToRelative(-0.236f, -0.883f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.966f, -0.258f)
                lineToRelative(0.495f, 1.849f)
                lineToRelative(1.236f, 0.713f)
                verticalLineTo(5.707f)
                lineTo(6.147f, 4.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, -0.708f)
                lineToRelative(0.646f, 0.647f)
                verticalLineTo(3.207f)
                lineTo(6.147f, 1.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, -0.708f)
                lineToRelative(0.646f, 0.647f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(1.293f)
                lineToRelative(0.647f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, 0.708f)
                lineTo(8.5f, 3.207f)
                verticalLineToRelative(1.086f)
                lineToRelative(0.647f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, 0.708f)
                lineTo(8.5f, 5.707f)
                verticalLineToRelative(1.427f)
                lineToRelative(1.236f, -0.713f)
                lineToRelative(0.495f, -1.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.966f, 0.26f)
                lineToRelative(-0.236f, 0.882f)
                lineToRelative(0.94f, -0.542f)
                lineToRelative(0.495f, -1.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.966f, 0.26f)
                lineToRelative(-0.236f, 0.882f)
                lineToRelative(1.12f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.866f)
                lineToRelative(-1.12f, 0.646f)
                lineToRelative(0.883f, 0.237f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.26f, 0.966f)
                lineToRelative(-1.848f, -0.495f)
                lineToRelative(-0.94f, 0.542f)
                lineToRelative(0.883f, 0.237f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.26f, 0.966f)
                lineToRelative(-1.848f, -0.495f)
                lineTo(9.0f, 8.0f)
                lineToRelative(1.236f, 0.713f)
                lineToRelative(1.849f, -0.495f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.259f, 0.966f)
                lineToRelative(-0.883f, 0.237f)
                lineToRelative(0.94f, 0.542f)
                lineToRelative(1.849f, -0.495f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.259f, 0.966f)
                lineToRelative(-0.883f, 0.237f)
                lineToRelative(1.12f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.866f)
                lineToRelative(-1.12f, -0.646f)
                lineToRelative(0.236f, 0.883f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.966f, 0.258f)
                lineToRelative(-0.495f, -1.849f)
                lineToRelative(-0.94f, -0.542f)
                lineToRelative(0.236f, 0.883f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.966f, 0.258f)
                lineTo(9.736f, 9.58f)
                lineTo(8.5f, 8.866f)
                verticalLineToRelative(1.427f)
                lineToRelative(1.354f, 1.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.708f)
                lineToRelative(-0.647f, -0.647f)
                verticalLineToRelative(1.086f)
                lineToRelative(1.354f, 1.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.708f)
                lineToRelative(-0.647f, -0.647f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
            }
        }
        .build()
        return _snow2!!
    }

private var _snow2: ImageVector? = null
