package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Markdown24: ImageVector
    get() {
        if (_markdown24 != null) {
            return _markdown24!!
        }
        _markdown24 = Builder(name = "Markdown24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.289f, 4.5f)
                arcTo(1.71f, 1.71f, 0.0f, false, true, 24.0f, 6.226f)
                verticalLineToRelative(11.557f)
                curveToRelative(0.0f, 0.946f, -0.766f, 1.726f, -1.726f, 1.726f)
                lineTo(1.726f, 19.509f)
                arcTo(1.74f, 1.74f, 0.0f, false, true, 0.0f, 17.768f)
                lineTo(0.0f, 6.226f)
                curveTo(0.0f, 5.28f, 0.78f, 4.5f, 1.726f, 4.5f)
                close()
                moveTo(13.508f, 16.507f)
                lineTo(13.508f, 7.501f)
                horizontalLineToRelative(-3.002f)
                lineToRelative(-2.251f, 3.002f)
                lineToRelative(-2.252f, -3.002f)
                lineTo(3.002f, 7.501f)
                verticalLineToRelative(9.006f)
                horizontalLineToRelative(3.001f)
                verticalLineToRelative(-4.503f)
                lineToRelative(2.252f, 2.882f)
                lineToRelative(2.251f, -2.882f)
                verticalLineToRelative(4.503f)
                close()
                moveTo(17.997f, 17.257f)
                lineTo(21.764f, 12.004f)
                horizontalLineToRelative(-2.251f)
                lineTo(19.513f, 7.501f)
                horizontalLineToRelative(-3.002f)
                verticalLineToRelative(4.503f)
                horizontalLineToRelative(-2.252f)
                close()
            }
        }
        .build()
        return _markdown24!!
    }

private var _markdown24: ImageVector? = null
