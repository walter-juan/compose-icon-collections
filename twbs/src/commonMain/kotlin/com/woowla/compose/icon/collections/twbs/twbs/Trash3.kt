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

public val Twbs.Trash3: ImageVector
    get() {
        if (_trash3 != null) {
            return _trash3!!
        }
        _trash3 = Builder(name = "Trash3", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveTo(11.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 1.5f)
                verticalLineToRelative(1.0f)
                lineTo(1.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(0.538f)
                lineToRelative(0.853f, 10.66f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.885f, 16.0f)
                horizontalLineToRelative(6.23f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.994f, -1.84f)
                lineToRelative(0.853f, -10.66f)
                horizontalLineToRelative(0.538f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(12.958f, 3.5f)
                lineTo(12.112f, 14.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.997f, 0.92f)
                horizontalLineToRelative(-6.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.997f, -0.92f)
                lineTo(3.042f, 3.5f)
                close()
                moveTo(5.471f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.528f, 0.47f)
                lineToRelative(0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.998f, 0.06f)
                lineTo(5.0f, 5.03f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.47f, -0.53f)
                close()
                moveTo(10.529f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.47f, 0.53f)
                lineToRelative(-0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.998f, -0.06f)
                lineToRelative(0.5f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.528f, -0.47f)
                moveTo(8.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(7.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _trash3!!
    }

private var _trash3: ImageVector? = null
