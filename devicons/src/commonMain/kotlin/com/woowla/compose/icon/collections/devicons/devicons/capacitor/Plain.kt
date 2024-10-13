package com.woowla.compose.icon.collections.devicons.devicons.capacitor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CapacitorGroup

public val CapacitorGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF53b9ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.21f, 0.0f)
                lineTo(77.51f, 30.69f)
                lineTo(46.96f, 0.16f)
                lineTo(27.18f, 19.96f)
                lineToRelative(80.82f, 80.93f)
                lineToRelative(19.78f, -19.81f)
                lineToRelative(-30.5f, -30.59f)
                lineTo(128.0f, 19.74f)
                close()
                moveTo(19.93f, 27.06f)
                lineTo(0.16f, 46.86f)
                lineToRelative(30.5f, 30.59f)
                lineTo(0.0f, 108.19f)
                lineToRelative(19.72f, 19.81f)
                lineTo(50.43f, 97.25f)
                lineToRelative(30.55f, 30.53f)
                lineToRelative(19.78f, -19.8f)
                close()
                moveTo(19.93f, 27.06f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
