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

public val Simpleicons.Bambulab: ImageVector
    get() {
        if (_bambulab != null) {
            return _bambulab!!
        }
        _bambulab = Builder(name = "Bambulab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.662f, 24.0f)
                lineTo(12.662f, 8.959f)
                lineToRelative(8.535f, 3.369f)
                lineTo(21.197f, 24.0f)
                close()
                moveTo(2.803f, 23.997f)
                verticalLineToRelative(-7.521f)
                lineToRelative(8.534f, -3.371f)
                lineToRelative(-0.001f, 10.892f)
                close()
                moveTo(2.803f, 0.0f)
                horizontalLineToRelative(8.533f)
                lineToRelative(0.001f, 11.672f)
                lineToRelative(-8.534f, 3.369f)
                close()
                moveTo(12.662f, 0.0f)
                horizontalLineToRelative(8.535f)
                verticalLineToRelative(10.892f)
                lineToRelative(-8.535f, -3.371f)
                close()
            }
        }
        .build()
        return _bambulab!!
    }

private var _bambulab: ImageVector? = null
