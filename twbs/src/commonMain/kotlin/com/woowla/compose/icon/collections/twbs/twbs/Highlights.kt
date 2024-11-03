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

public val Twbs.Highlights: ImageVector
    get() {
        if (_highlights != null) {
            return _highlights!!
        }
        _highlights = Builder(name = "Highlights", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                moveToRelative(-8.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.093f, 0.009f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 3.1f, 13.0f)
                close()
                moveTo(8.0f, 12.0f)
                lineTo(2.255f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.581f, -1.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(1.29f, 10.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.22f, -1.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(1.0f, 8.0f)
                quadToRelative(0.0f, -0.51f, 0.07f, -1.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(1.29f, 6.0f)
                quadToRelative(0.155f, -0.519f, 0.384f, -1.0f)
                lineTo(8.0f, 5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(2.255f, 4.0f)
                quadToRelative(0.377f, -0.54f, 0.846f, -1.0f)
                lineTo(8.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(4.392f, 2.0f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 8.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _highlights!!
    }

private var _highlights: ImageVector? = null
