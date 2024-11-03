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

public val Twbs.Sunset: ImageVector
    get() {
        if (_sunset != null) {
            return _sunset!!
        }
        _sunset = Builder(name = "Sunset", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.646f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineToRelative(-0.646f, 0.647f)
                lineTo(8.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(1.793f)
                lineToRelative(-0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                close()
                moveTo(2.343f, 4.344f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                lineToRelative(1.414f, 1.413f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.707f)
                lineTo(2.343f, 5.05f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                close()
                moveTo(13.657f, 4.344f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.706f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, -0.707f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                close()
                moveTo(8.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.599f, 4.5f)
                lineTo(5.4f, 11.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 7.0f)
                moveToRelative(3.71f, 4.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.418f, 0.0f)
                lineTo(0.499f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-3.79f)
                close()
                moveTo(0.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.0f, 10.0f)
                moveToRelative(13.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
        }
        .build()
        return _sunset!!
    }

private var _sunset: ImageVector? = null
