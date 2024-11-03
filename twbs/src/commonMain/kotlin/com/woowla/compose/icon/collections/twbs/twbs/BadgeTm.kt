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

public val Twbs.BadgeTm: ImageVector
    get() {
        if (_badgeTm != null) {
            return _badgeTm!!
        }
        _badgeTm = Builder(name = "BadgeTm", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.295f, 11.0f)
                lineTo(5.295f, 5.995f)
                lineTo(7.0f, 5.995f)
                lineTo(7.0f, 5.0f)
                lineTo(2.403f, 5.0f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(1.701f)
                lineTo(4.104f, 11.0f)
                close()
                moveTo(8.692f, 11.0f)
                lineTo(8.692f, 7.01f)
                horizontalLineToRelative(0.058f)
                lineToRelative(1.428f, 3.239f)
                horizontalLineToRelative(0.773f)
                lineToRelative(1.42f, -3.24f)
                horizontalLineToRelative(0.057f)
                lineTo(12.428f, 11.0f)
                lineTo(13.5f, 11.0f)
                lineTo(13.5f, 5.001f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-1.71f, 3.894f)
                horizontalLineToRelative(-0.039f)
                lineToRelative(-1.71f, -3.894f)
                lineTo(7.634f, 5.001f)
                lineTo(7.634f, 11.0f)
                horizontalLineToRelative(1.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _badgeTm!!
    }

private var _badgeTm: ImageVector? = null
