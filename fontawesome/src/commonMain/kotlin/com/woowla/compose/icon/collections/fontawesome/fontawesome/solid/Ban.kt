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

public val SolidGroup.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(367.2f, 412.5f)
                lineTo(99.5f, 144.8f)
                curveToRelative(-22.4f, 31.4f, -35.5f, 69.8f, -35.5f, 111.2f)
                curveToRelative(0.0f, 106.0f, 86.0f, 192.0f, 192.0f, 192.0f)
                curveToRelative(41.5f, 0.0f, 79.9f, -13.1f, 111.2f, -35.5f)
                close()
                moveTo(412.5f, 367.2f)
                curveToRelative(22.4f, -31.4f, 35.5f, -69.8f, 35.5f, -111.2f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                curveToRelative(-41.5f, 0.0f, -79.9f, 13.1f, -111.2f, 35.5f)
                lineTo(412.5f, 367.2f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
