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

public val Simpleicons.Devuan: ImageVector
    get() {
        if (_devuan != null) {
            return _devuan!!
        }
        _devuan = Builder(name = "Devuan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.415f)
                curveTo(42.518f, 10.56f, 2.297f, 18.812f, 2.297f, 18.812f)
                curveToRelative(-0.792f, 0.127f, -1.432f, 0.54f, -1.816f, 1.167f)
                curveToRelative(-0.433f, 0.704f, -0.47f, 1.656f, -0.066f, 2.326f)
                curveToRelative(0.492f, 0.814f, 1.114f, 1.096f, 1.65f, 1.217f)
                curveToRelative(0.845f, 0.191f, 1.527f, -0.113f, 1.527f, -0.113f)
                reflectiveCurveToRelative(20.562f, -6.11f, 20.407f, -12.214f)
                curveTo(23.922f, 8.131f, 17.694f, 2.948f, 0.0f, 0.415f)
            }
        }
        .build()
        return _devuan!!
    }

private var _devuan: ImageVector? = null
