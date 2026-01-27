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

public val Simpleicons.Betterauth: ImageVector
    get() {
        if (_betterauth != null) {
            return _betterauth!!
        }
        _betterauth = Builder(name = "Betterauth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.39f)
                verticalLineToRelative(17.22f)
                horizontalLineToRelative(5.783f)
                verticalLineTo(15.06f)
                horizontalLineToRelative(6.434f)
                verticalLineTo(8.939f)
                horizontalLineTo(5.783f)
                verticalLineTo(3.39f)
                close()
                moveTo(12.217f, 8.94f)
                horizontalLineToRelative(5.638f)
                verticalLineToRelative(6.122f)
                horizontalLineToRelative(-5.638f)
                verticalLineToRelative(5.548f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.391f)
                horizontalLineTo(12.217f)
                close()
            }
        }
        .build()
        return _betterauth!!
    }

private var _betterauth: ImageVector? = null
