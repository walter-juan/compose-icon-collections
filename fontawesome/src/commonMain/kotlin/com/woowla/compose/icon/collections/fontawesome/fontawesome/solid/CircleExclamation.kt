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

public val SolidGroup.CircleExclamation: ImageVector
    get() {
        if (_circleExclamation != null) {
            return _circleExclamation!!
        }
        _circleExclamation = Builder(name = "CircleExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, 512.0f)
                close()
                moveTo(256.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                close()
                moveTo(256.0f, 128.0f)
                curveToRelative(-18.2f, 0.0f, -32.7f, 15.5f, -31.4f, 33.7f)
                lineToRelative(7.4f, 104.0f)
                curveToRelative(0.9f, 12.6f, 11.4f, 22.3f, 23.9f, 22.3f)
                curveToRelative(12.6f, 0.0f, 23.0f, -9.7f, 23.9f, -22.3f)
                lineToRelative(7.4f, -104.0f)
                curveToRelative(1.3f, -18.2f, -13.1f, -33.7f, -31.4f, -33.7f)
                close()
            }
        }
        .build()
        return _circleExclamation!!
    }

private var _circleExclamation: ImageVector? = null
