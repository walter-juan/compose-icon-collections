package com.woowla.compose.icon.collections.devicons.devicons.akka

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AkkaGroup

public val AkkaGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.51f, 103.66f)
                curveToRelative(18.26f, 14.6f, 29.96f, -28.99f, 0.87f, -37.03f)
                curveToRelative(-24.42f, -6.76f, -48.98f, 4.83f, -73.6f, 31.89f)
                curveToRelative(0.0f, 0.0f, 45.47f, -16.63f, 72.74f, 5.14f)
                close()
                moveTo(33.18f, 98.17f)
                curveToRelative(17.5f, -18.16f, 46.59f, -38.4f, 73.7f, -30.93f)
                curveToRelative(6.31f, 1.78f, 10.78f, 5.44f, 13.68f, 9.82f)
                lineToRelative(-25.64f, -51.73f)
                curveToRelative(-3.66f, -5.85f, -13.02f, -4.63f, -18.31f, -0.15f)
                lineTo(8.86f, 81.94f)
                curveToRelative(-6.16f, 5.29f, -6.51f, 14.7f, -0.81f, 20.4f)
                curveToRelative(5.04f, 5.04f, 13.02f, 5.49f, 18.57f, 1.02f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
