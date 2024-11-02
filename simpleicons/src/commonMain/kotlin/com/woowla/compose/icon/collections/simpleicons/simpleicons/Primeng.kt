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

public val Simpleicons.Primeng: ImageVector
    get() {
        if (_primeng != null) {
            return _primeng!!
        }
        _primeng = Builder(name = "Primeng", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(0.784f, 3.984f)
                lineToRelative(1.711f, 14.772f)
                lineTo(12.0f, 24.0f)
                lineToRelative(9.506f, -5.244f)
                lineToRelative(1.71f, -14.772f)
                close()
                moveTo(8.354f, 4.212f)
                horizontalLineToRelative(1.674f)
                lineTo(9.19f, 6.124f)
                lineToRelative(-2.51f, -0.24f)
                close()
                moveTo(10.386f, 4.212f)
                horizontalLineToRelative(1.315f)
                verticalLineToRelative(6.812f)
                horizontalLineToRelative(-0.717f)
                lineTo(5.843f, 9.112f)
                lineToRelative(-0.717f, -2.988f)
                lineToRelative(4.308f, 0.35f)
                close()
                moveTo(12.18f, 4.212f)
                horizontalLineToRelative(1.314f)
                lineToRelative(0.953f, 2.261f)
                lineToRelative(4.427f, -0.349f)
                lineToRelative(-0.717f, 2.988f)
                lineToRelative(-5.14f, 1.912f)
                horizontalLineToRelative(-0.837f)
                close()
                moveTo(13.853f, 4.212f)
                horizontalLineToRelative(1.674f)
                lineTo(17.2f, 5.885f)
                lineToRelative(-2.51f, 0.239f)
                close()
                moveTo(5.963f, 9.59f)
                lineToRelative(1.315f, 0.478f)
                lineToRelative(1.315f, 1.315f)
                lineToRelative(1.076f, -0.24f)
                lineToRelative(-0.837f, 1.196f)
                verticalLineToRelative(3.704f)
                lineToRelative(-2.87f, -2.39f)
                close()
                moveTo(17.918f, 9.59f)
                verticalLineToRelative(4.063f)
                lineToRelative(-2.87f, 2.39f)
                verticalLineToRelative(-3.704f)
                lineToRelative(-0.837f, -1.195f)
                lineToRelative(1.077f, 0.239f)
                lineToRelative(1.314f, -1.315f)
                close()
                moveTo(10.132f, 11.126f)
                lineTo(10.728f, 11.486f)
                horizontalLineToRelative(2.384f)
                lineToRelative(0.597f, -0.36f)
                lineToRelative(0.953f, 1.437f)
                verticalLineToRelative(5.388f)
                lineToRelative(-0.715f, 1.078f)
                lineToRelative(-0.835f, 0.838f)
                horizontalLineToRelative(-2.384f)
                lineToRelative(-0.834f, -0.838f)
                lineToRelative(-0.715f, -1.078f)
                verticalLineToRelative(-5.388f)
                close()
                moveTo(7.278f, 15.206f)
                lineTo(8.832f, 16.521f)
                verticalLineToRelative(1.793f)
                lineTo(7.278f, 16.76f)
                close()
                moveTo(16.602f, 15.206f)
                verticalLineToRelative(1.554f)
                lineToRelative(-1.553f, 1.554f)
                lineTo(15.049f, 16.52f)
                close()
            }
        }
        .build()
        return _primeng!!
    }

private var _primeng: ImageVector? = null
