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

public val Simpleicons.Dash0: ImageVector
    get() {
        if (_dash0 != null) {
            return _dash0!!
        }
        _dash0 = Builder(name = "Dash0", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.421f)
                curveToRelative(4.883f, 0.0f, 8.842f, 3.393f, 8.842f, 7.579f)
                reflectiveCurveTo(4.883f, 19.579f, 0.0f, 19.579f)
                close()
                moveTo(16.421f, 4.421f)
                curveTo(20.608f, 4.421f, 24.0f, 7.814f, 24.0f, 12.0f)
                reflectiveCurveToRelative(-3.392f, 7.579f, -7.579f, 7.579f)
                reflectiveCurveTo(8.842f, 16.186f, 8.842f, 12.0f)
                reflectiveCurveToRelative(3.393f, -7.579f, 7.579f, -7.579f)
            }
        }
        .build()
        return _dash0!!
    }

private var _dash0: ImageVector? = null
