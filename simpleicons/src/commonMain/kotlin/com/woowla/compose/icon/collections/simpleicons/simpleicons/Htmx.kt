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

public val Simpleicons.Htmx: ImageVector
    get() {
        if (_htmx != null) {
            return _htmx!!
        }
        _htmx = Builder(name = "Htmx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.01f)
                verticalLineToRelative(-2.0f)
                lineToRelative(7.09f, -2.98f)
                lineToRelative(0.58f, 1.94f)
                lineToRelative(-5.1f, 2.05f)
                lineToRelative(5.16f, 2.05f)
                lineToRelative(-0.63f, 1.9f)
                close()
                moveTo(16.37f, 14.04f)
                lineTo(21.55f, 12.04f)
                lineTo(16.39f, 9.95f)
                lineTo(17.04f, 8.07f)
                lineTo(24.0f, 10.95f)
                verticalLineToRelative(2.12f)
                lineTo(17.0f, 16.0f)
                close()
                moveTo(13.52f, 4.06f)
                lineTo(16.0f, 4.06f)
                lineToRelative(-5.47f, 15.88f)
                lineTo(8.05f, 19.94f)
                close()
            }
        }
        .build()
        return _htmx!!
    }

private var _htmx: ImageVector? = null
