package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.938f, 2.016f)
                arcTo(0.13f, 0.13f, 0.0f, false, true, 8.002f, 2.0f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, true, 0.063f, 0.016f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.054f, 0.057f)
                lineToRelative(6.857f, 11.667f)
                curveToRelative(0.036f, 0.06f, 0.035f, 0.124f, 0.002f, 0.183f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.054f, 0.06f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.066f, 0.017f)
                horizontalLineTo(1.146f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.066f, -0.017f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.054f, -0.06f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, true, 0.002f, -0.183f)
                lineTo(7.884f, 2.073f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.054f, -0.057f)
                moveToRelative(1.044f, -0.45f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, -1.96f, 0.0f)
                lineTo(0.165f, 13.233f)
                curveToRelative(-0.457f, 0.778f, 0.091f, 1.767f, 0.98f, 1.767f)
                horizontalLineToRelative(13.713f)
                curveToRelative(0.889f, 0.0f, 1.438f, -0.99f, 0.98f, -1.767f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
