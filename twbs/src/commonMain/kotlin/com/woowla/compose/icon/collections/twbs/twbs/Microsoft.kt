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

public val Twbs.Microsoft: ImageVector
    get() {
        if (_microsoft != null) {
            return _microsoft!!
        }
        _microsoft = Builder(name = "Microsoft", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.462f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(7.19f)
                horizontalLineToRelative(7.462f)
                close()
                moveTo(16.0f, 0.0f)
                lineTo(8.538f, 0.0f)
                verticalLineToRelative(7.19f)
                lineTo(16.0f, 7.19f)
                close()
                moveTo(7.462f, 8.211f)
                lineTo(0.0f, 8.211f)
                lineTo(0.0f, 16.0f)
                horizontalLineToRelative(7.462f)
                close()
                moveTo(16.0f, 8.211f)
                lineTo(8.538f, 8.211f)
                lineTo(8.538f, 16.0f)
                lineTo(16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _microsoft!!
    }

private var _microsoft: ImageVector? = null
