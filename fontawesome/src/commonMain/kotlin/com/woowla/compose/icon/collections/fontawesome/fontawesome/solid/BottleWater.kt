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

public val SolidGroup.BottleWater: ImageVector
    get() {
        if (_bottleWater != null) {
            return _bottleWater!!
        }
        _bottleWater = Builder(name = "BottleWater", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, -32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-96.0f, 0.0f)
                curveTo(94.3f, 32.0f, 80.0f, 17.7f, 80.0f, 0.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(16.0f, 144.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 24.1f, -13.3f, 45.1f, -33.0f, 56.0f)
                curveToRelative(19.7f, 10.9f, 33.0f, 31.9f, 33.0f, 56.0f)
                reflectiveCurveToRelative(-13.3f, 45.1f, -33.0f, 56.0f)
                curveToRelative(19.7f, 10.9f, 33.0f, 31.9f, 33.0f, 56.0f)
                reflectiveCurveToRelative(-13.3f, 45.1f, -33.0f, 56.0f)
                curveToRelative(19.7f, 10.9f, 33.0f, 31.9f, 33.0f, 56.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(80.0f, 544.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -24.1f, 13.3f, -45.1f, 33.0f, -56.0f)
                curveToRelative(-19.7f, -10.9f, -33.0f, -31.9f, -33.0f, -56.0f)
                reflectiveCurveToRelative(13.3f, -45.1f, 33.0f, -56.0f)
                curveToRelative(-19.7f, -10.9f, -33.0f, -31.9f, -33.0f, -56.0f)
                reflectiveCurveToRelative(13.3f, -45.1f, 33.0f, -56.0f)
                curveToRelative(-19.7f, -10.9f, -33.0f, -31.9f, -33.0f, -56.0f)
                close()
            }
        }
        .build()
        return _bottleWater!!
    }

private var _bottleWater: ImageVector? = null
