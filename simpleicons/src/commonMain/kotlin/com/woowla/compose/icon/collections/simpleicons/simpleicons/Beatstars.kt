package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Beatstars: ImageVector
    get() {
        if (_beatstars != null) {
            return _beatstars!!
        }
        _beatstars = Builder(name = "Beatstars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.217f, 11.996f)
                lineToRelative(-3.308f, 1.079f)
                verticalLineToRelative(3.478f)
                lineToRelative(-2.052f, -2.818f)
                lineToRelative(-3.309f, 1.079f)
                lineToRelative(2.043f, -2.818f)
                lineToRelative(-2.043f, -2.819f)
                lineToRelative(3.31f, 1.08f)
                lineToRelative(2.05f, -2.819f)
                verticalLineToRelative(3.487f)
                close()
                moveTo(17.217f, 11.996f)
                verticalLineToRelative(7.277f)
                lineTo(6.854f, 19.273f)
                lineTo(6.854f, 4.584f)
                horizontalLineToRelative(10.363f)
                verticalLineToRelative(7.412f)
                lineToRelative(4.585f, -1.49f)
                verticalLineToRelative(-7.67f)
                lineTo(19.135f, 0.0f)
                lineTo(2.198f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(16.92f)
                lineToRelative(2.684f, -2.685f)
                verticalLineToRelative(-7.83f)
                close()
            }
        }
        .build()
        return _beatstars!!
    }

private var _beatstars: ImageVector? = null
