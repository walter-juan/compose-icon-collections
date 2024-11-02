package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.848f, 8.25f)
                lineTo(9.384f, 9.137f)
                moveTo(7.848f, 8.25f)
                curveTo(7.019f, 9.685f, 5.185f, 10.177f, 3.75f, 9.348f)
                curveTo(2.315f, 8.52f, 1.824f, 6.685f, 2.652f, 5.25f)
                curveTo(3.48f, 3.815f, 5.315f, 3.323f, 6.75f, 4.152f)
                curveTo(8.185f, 4.98f, 8.676f, 6.815f, 7.848f, 8.25f)
                close()
                moveTo(9.384f, 9.137f)
                curveTo(10.043f, 9.517f, 10.454f, 10.215f, 10.467f, 10.976f)
                curveTo(10.472f, 11.327f, 10.521f, 11.671f, 10.607f, 12.0f)
                moveTo(9.384f, 9.137f)
                lineTo(11.461f, 10.336f)
                moveTo(7.848f, 15.75f)
                lineTo(9.384f, 14.863f)
                moveTo(7.848f, 15.75f)
                curveTo(8.676f, 17.185f, 8.185f, 19.02f, 6.75f, 19.848f)
                curveTo(5.315f, 20.677f, 3.48f, 20.185f, 2.652f, 18.75f)
                curveTo(1.824f, 17.315f, 2.315f, 15.48f, 3.75f, 14.652f)
                curveTo(5.185f, 13.823f, 7.019f, 14.315f, 7.848f, 15.75f)
                close()
                moveTo(9.384f, 14.863f)
                curveTo(10.043f, 14.483f, 10.454f, 13.785f, 10.467f, 13.025f)
                curveTo(10.472f, 12.673f, 10.521f, 12.33f, 10.607f, 12.0f)
                moveTo(9.384f, 14.863f)
                lineTo(11.461f, 13.664f)
                moveTo(11.461f, 10.336f)
                curveTo(11.988f, 9.699f, 12.699f, 9.211f, 13.529f, 8.957f)
                lineTo(18.854f, 7.329f)
                curveTo(19.661f, 7.082f, 20.52f, 7.067f, 21.335f, 7.285f)
                lineTo(22.137f, 7.5f)
                lineTo(14.343f, 12.0f)
                moveTo(11.461f, 10.336f)
                curveTo(11.062f, 10.818f, 10.768f, 11.385f, 10.607f, 12.0f)
                moveTo(14.343f, 12.0f)
                lineTo(22.137f, 16.5f)
                lineTo(21.335f, 16.715f)
                curveTo(20.52f, 16.933f, 19.661f, 16.918f, 18.854f, 16.672f)
                lineTo(13.529f, 15.043f)
                curveTo(12.699f, 14.789f, 11.988f, 14.301f, 11.461f, 13.664f)
                moveTo(14.343f, 12.0f)
                lineTo(11.461f, 13.664f)
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
