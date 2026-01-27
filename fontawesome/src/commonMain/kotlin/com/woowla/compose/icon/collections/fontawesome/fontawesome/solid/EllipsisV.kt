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

public val SolidGroup.EllipsisV: ImageVector
    get() {
        if (_ellipsisV != null) {
            return _ellipsisV!!
        }
        _ellipsisV = Builder(name = "EllipsisV", defaultWidth = 128.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 128.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 144.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                close()
                moveTo(64.0f, 368.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                reflectiveCurveToRelative(-25.1f, 56.0f, -56.0f, 56.0f)
                reflectiveCurveToRelative(-56.0f, -25.1f, -56.0f, -56.0f)
                reflectiveCurveToRelative(25.1f, -56.0f, 56.0f, -56.0f)
                close()
                moveTo(120.0f, 256.0f)
                curveToRelative(0.0f, 30.9f, -25.1f, 56.0f, -56.0f, 56.0f)
                reflectiveCurveToRelative(-56.0f, -25.1f, -56.0f, -56.0f)
                reflectiveCurveToRelative(25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                close()
            }
        }
        .build()
        return _ellipsisV!!
    }

private var _ellipsisV: ImageVector? = null
