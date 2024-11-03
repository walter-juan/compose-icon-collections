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

public val Twbs.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 1.018f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -4.79f, 11.566f)
                lineTo(7.5f, 7.793f)
                close()
                moveTo(8.5f, 1.018f)
                verticalLineToRelative(6.775f)
                lineToRelative(4.79f, 4.79f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 8.5f, 1.018f)
                moveToRelative(4.084f, 12.273f)
                lineTo(8.5f, 9.207f)
                verticalLineToRelative(5.775f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 4.084f, -1.691f)
                moveTo(7.5f, 14.982f)
                lineTo(7.5f, 9.207f)
                lineToRelative(-4.084f, 4.084f)
                arcTo(6.97f, 6.97f, 0.0f, false, false, 7.5f, 14.982f)
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
