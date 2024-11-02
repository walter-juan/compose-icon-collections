package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(18.627f, 0.0f, 24.0f, 5.373f, 24.0f, 12.0f)
                curveTo(24.0f, 18.627f, 18.627f, 24.0f, 12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 19.826f)
                arcToRelative(7.826f, 7.826f, 0.0f, true, false, -0.001f, -15.652f)
                curveTo(7.713f, 4.225f, 4.265f, 7.714f, 4.265f, 12.0f)
                curveToRelative(0.0f, 4.286f, 3.448f, 7.775f, 7.734f, 7.826f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(12.0f, 15.841f)
                arcToRelative(3.84f, 3.84f, 0.0f, true, true, 0.0f, -7.68f)
                curveToRelative(2.12f, 0.001f, 3.839f, 1.72f, 3.839f, 3.84f)
                reflectiveCurveToRelative(-1.719f, 3.84f, -3.839f, 3.84f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
