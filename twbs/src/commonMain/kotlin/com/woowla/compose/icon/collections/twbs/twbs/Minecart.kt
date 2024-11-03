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

public val Twbs.Minecart: ImageVector
    get() {
        if (_minecart != null) {
            return _minecart!!
        }
        _minecart = Builder(name = "Minecart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveToRelative(8.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveTo(0.115f, 3.18f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.491f, 0.592f)
                lineToRelative(-1.5f, 8.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.491f, -0.408f)
                lineToRelative(-1.5f, -8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.106f, -0.411f)
                close()
                moveTo(1.102f, 4.0f)
                lineTo(2.415f, 11.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(1.313f, -7.0f)
                close()
            }
        }
        .build()
        return _minecart!!
    }

private var _minecart: ImageVector? = null
