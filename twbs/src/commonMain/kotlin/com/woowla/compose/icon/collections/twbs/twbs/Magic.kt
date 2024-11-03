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

public val Twbs.Magic: ImageVector
    get() {
        if (_magic != null) {
            return _magic!!
        }
        _magic = Builder(name = "Magic", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.672f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                lineTo(10.5f, 0.843f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                close()
                moveTo(14.0f, 2.707f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.293f, 2.0f)
                lineTo(12.0f, 3.293f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.707f, 0.707f)
                close()
                moveTo(7.293f, 4.0f)
                arcTo(0.5f, 0.5f, 0.0f, true, false, 8.0f, 3.293f)
                lineTo(6.707f, 2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 6.0f, 2.707f)
                close()
                moveTo(6.672f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(4.843f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                close()
                moveTo(15.157f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-1.829f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                close()
                moveTo(13.293f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, true, false, 14.0f, 9.293f)
                lineTo(12.707f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, 0.707f)
                close()
                moveTo(9.5f, 11.157f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(10.5f, 9.328f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                close()
                moveTo(11.354f, 6.06f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.706f)
                lineToRelative(-0.708f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                lineTo(8.646f, 5.94f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                lineToRelative(0.708f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                lineToRelative(1.293f, -1.293f)
                close()
                moveTo(8.354f, 9.06f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.706f)
                lineToRelative(-0.708f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                lineTo(0.646f, 13.94f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                lineToRelative(0.708f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                close()
            }
        }
        .build()
        return _magic!!
    }

private var _magic: ImageVector? = null
