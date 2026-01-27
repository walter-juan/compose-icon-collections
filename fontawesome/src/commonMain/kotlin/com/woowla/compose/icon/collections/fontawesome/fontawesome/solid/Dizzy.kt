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

public val SolidGroup.Dizzy: ImageVector
    get() {
        if (_dizzy != null) {
            return _dizzy!!
        }
        _dizzy = Builder(name = "Dizzy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(134.1f, 153.9f)
                lineToRelative(25.9f, 25.9f)
                lineToRelative(25.9f, -25.9f)
                curveToRelative(7.8f, -7.8f, 20.5f, -7.8f, 28.3f, 0.0f)
                reflectiveCurveToRelative(7.8f, 20.5f, 0.0f, 28.3f)
                lineToRelative(-25.9f, 25.9f)
                lineToRelative(25.9f, 25.9f)
                curveToRelative(7.8f, 7.8f, 7.8f, 20.5f, 0.0f, 28.3f)
                reflectiveCurveToRelative(-20.5f, 7.8f, -28.3f, 0.0f)
                lineToRelative(-25.9f, -25.9f)
                lineToRelative(-25.9f, 25.9f)
                curveToRelative(-7.8f, 7.8f, -20.5f, 7.8f, -28.3f, 0.0f)
                reflectiveCurveToRelative(-7.8f, -20.5f, 0.0f, -28.3f)
                lineToRelative(25.9f, -25.9f)
                lineToRelative(-25.9f, -25.9f)
                curveToRelative(-7.8f, -7.8f, -7.8f, -20.5f, 0.0f, -28.3f)
                reflectiveCurveToRelative(20.5f, -7.8f, 28.3f, 0.0f)
                close()
                moveTo(326.1f, 153.9f)
                lineToRelative(25.9f, 25.9f)
                lineToRelative(25.9f, -25.9f)
                curveToRelative(7.8f, -7.8f, 20.5f, -7.8f, 28.3f, 0.0f)
                reflectiveCurveToRelative(7.8f, 20.5f, 0.0f, 28.3f)
                lineToRelative(-25.9f, 25.9f)
                lineToRelative(25.9f, 25.9f)
                curveToRelative(7.8f, 7.8f, 7.8f, 20.5f, 0.0f, 28.3f)
                reflectiveCurveToRelative(-20.5f, 7.8f, -28.3f, 0.0f)
                lineToRelative(-25.9f, -25.9f)
                lineToRelative(-25.9f, 25.9f)
                curveToRelative(-7.8f, 7.8f, -20.5f, 7.8f, -28.3f, 0.0f)
                reflectiveCurveToRelative(-7.8f, -20.5f, 0.0f, -28.3f)
                lineToRelative(25.9f, -25.9f)
                lineToRelative(-25.9f, -25.9f)
                curveToRelative(-7.8f, -7.8f, -7.8f, -20.5f, 0.0f, -28.3f)
                reflectiveCurveToRelative(20.5f, -7.8f, 28.3f, 0.0f)
                close()
                moveTo(256.0f, 304.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                close()
            }
        }
        .build()
        return _dizzy!!
    }

private var _dizzy: ImageVector? = null
