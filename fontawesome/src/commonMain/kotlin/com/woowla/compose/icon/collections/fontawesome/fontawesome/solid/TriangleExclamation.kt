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

public val SolidGroup.TriangleExclamation: ImageVector
    get() {
        if (_triangleExclamation != null) {
            return _triangleExclamation!!
        }
        _triangleExclamation = Builder(name = "TriangleExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(14.7f, 0.0f, 28.2f, 8.1f, 35.2f, 21.0f)
                lineToRelative(216.0f, 400.0f)
                curveToRelative(6.7f, 12.4f, 6.4f, 27.4f, -0.8f, 39.5f)
                reflectiveCurveTo(486.1f, 480.0f, 472.0f, 480.0f)
                lineTo(40.0f, 480.0f)
                curveToRelative(-14.1f, 0.0f, -27.2f, -7.4f, -34.4f, -19.5f)
                reflectiveCurveToRelative(-7.5f, -27.1f, -0.8f, -39.5f)
                lineToRelative(216.0f, -400.0f)
                curveToRelative(7.0f, -12.9f, 20.5f, -21.0f, 35.2f, -21.0f)
                close()
                moveTo(256.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                close()
                moveTo(256.0f, 160.0f)
                curveToRelative(-18.2f, 0.0f, -32.7f, 15.5f, -31.4f, 33.7f)
                lineToRelative(7.4f, 104.0f)
                curveToRelative(0.9f, 12.5f, 11.4f, 22.3f, 23.9f, 22.3f)
                curveToRelative(12.6f, 0.0f, 23.0f, -9.7f, 23.9f, -22.3f)
                lineToRelative(7.4f, -104.0f)
                curveToRelative(1.3f, -18.2f, -13.1f, -33.7f, -31.4f, -33.7f)
                close()
            }
        }
        .build()
        return _triangleExclamation!!
    }

private var _triangleExclamation: ImageVector? = null
