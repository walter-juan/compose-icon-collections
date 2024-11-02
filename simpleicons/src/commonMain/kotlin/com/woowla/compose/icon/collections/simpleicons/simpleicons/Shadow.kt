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

public val Simpleicons.Shadow: ImageVector
    get() {
        if (_shadow != null) {
            return _shadow!!
        }
        _shadow = Builder(name = "Shadow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.514f, 1.511f, 6.675f, 3.918f, 8.87f)
                arcToRelative(4.457f, 4.457f, 0.0f, false, true, -0.2f, -1.324f)
                curveToRelative(0.0f, -2.46f, 1.994f, -4.453f, 4.454f, -4.453f)
                curveToRelative(2.46f, 0.0f, 4.453f, 1.994f, 4.453f, 4.453f)
                curveToRelative(0.0f, 1.957f, -1.262f, 3.617f, -3.016f, 4.215f)
                curveTo(10.382f, 23.918f, 11.182f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shadow!!
    }

private var _shadow: ImageVector? = null
