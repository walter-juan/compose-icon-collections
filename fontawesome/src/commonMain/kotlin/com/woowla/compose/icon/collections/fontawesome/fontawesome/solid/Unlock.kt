package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                curveToRelative(31.7f, 0.0f, 58.0f, 23.0f, 63.1f, 53.3f)
                curveToRelative(2.9f, 17.4f, 19.4f, 29.2f, 36.9f, 26.3f)
                reflectiveCurveToRelative(29.2f, -19.4f, 26.3f, -36.9f)
                curveTo(308.1f, 14.1f, 255.5f, -32.0f, 192.0f, -32.0f)
                curveTo(121.3f, -32.0f, 64.0f, 25.3f, 64.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -224.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null
