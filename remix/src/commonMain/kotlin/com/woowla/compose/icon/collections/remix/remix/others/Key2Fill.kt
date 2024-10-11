package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.Key2Fill: ImageVector
    get() {
        if (_key2Fill != null) {
            return _key2Fill!!
        }
        _key2Fill = Builder(name = "Key2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.313f, 11.566f)
                lineTo(18.253f, 3.626f)
                lineTo(20.374f, 5.747f)
                lineTo(18.96f, 7.161f)
                lineTo(21.081f, 9.282f)
                lineTo(17.546f, 12.818f)
                lineTo(15.425f, 10.697f)
                lineTo(12.434f, 13.687f)
                curveTo(13.418f, 15.572f, 13.119f, 17.952f, 11.535f, 19.535f)
                curveTo(9.583f, 21.488f, 6.417f, 21.488f, 4.464f, 19.535f)
                curveTo(2.512f, 17.583f, 2.512f, 14.417f, 4.464f, 12.464f)
                curveTo(6.048f, 10.881f, 8.428f, 10.582f, 10.313f, 11.566f)
                close()
                moveTo(9.414f, 17.414f)
                curveTo(10.195f, 16.633f, 10.195f, 15.367f, 9.414f, 14.586f)
                curveTo(8.633f, 13.805f, 7.367f, 13.805f, 6.586f, 14.586f)
                curveTo(5.805f, 15.367f, 5.805f, 16.633f, 6.586f, 17.414f)
                curveTo(7.367f, 18.195f, 8.633f, 18.195f, 9.414f, 17.414f)
                close()
            }
        }
        .build()
        return _key2Fill!!
    }

private var _key2Fill: ImageVector? = null
