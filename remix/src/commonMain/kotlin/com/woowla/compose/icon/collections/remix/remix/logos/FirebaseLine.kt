package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FirebaseLine: ImageVector
    get() {
        if (_firebaseLine != null) {
            return _firebaseLine!!
        }
        _firebaseLine = Builder(name = "FirebaseLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.223f, 8.707f)
                lineTo(6.911f, 13.041f)
                lineTo(8.0f, 6.326f)
                lineTo(9.223f, 8.707f)
                close()
                moveTo(10.368f, 6.559f)
                lineTo(7.695f, 1.353f)
                curveTo(7.474f, 0.924f, 6.834f, 1.025f, 6.757f, 1.501f)
                lineTo(4.0f, 18.5f)
                lineTo(5.748f, 19.593f)
                lineTo(10.94f, 22.837f)
                curveTo(11.589f, 23.243f, 12.411f, 23.243f, 13.06f, 22.837f)
                lineTo(20.0f, 18.5f)
                lineTo(18.142f, 5.961f)
                curveTo(18.083f, 5.559f, 17.593f, 5.392f, 17.301f, 5.674f)
                lineTo(14.566f, 8.311f)
                lineTo(12.441f, 4.327f)
                curveTo(12.253f, 3.974f, 11.747f, 3.974f, 11.559f, 4.327f)
                lineTo(10.368f, 6.559f)
                close()
                moveTo(13.069f, 9.755f)
                lineTo(8.667f, 14.0f)
                lineTo(12.0f, 7.75f)
                lineTo(13.069f, 9.755f)
                close()
                moveTo(7.232f, 18.162f)
                lineTo(16.591f, 9.137f)
                lineTo(17.83f, 17.498f)
                lineTo(12.0f, 21.142f)
                lineTo(7.232f, 18.162f)
                close()
            }
        }
        .build()
        return _firebaseLine!!
    }

private var _firebaseLine: ImageVector? = null
