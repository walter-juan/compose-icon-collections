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

public val SolidGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.3f, 6.7f)
                curveTo(477.7f, 0.6f, 487.0f, -1.6f, 495.6f, 1.2f)
                curveTo(505.4f, 4.5f, 512.0f, 13.7f, 512.0f, 24.0f)
                lineToRelative(0.0f, 186.9f)
                curveToRelative(0.0f, 131.2f, -108.1f, 237.1f, -238.8f, 237.1f)
                curveToRelative(-77.0f, 0.0f, -143.4f, -49.5f, -167.5f, -118.7f)
                curveToRelative(-35.4f, 30.8f, -57.7f, 76.1f, -57.7f, 126.7f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveTo(0.0f, 469.3f, 0.0f, 456.0f)
                curveTo(0.0f, 381.1f, 38.2f, 315.1f, 96.1f, 276.3f)
                curveTo(131.4f, 252.7f, 173.5f, 240.0f, 216.0f, 240.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-39.7f, 0.0f, -77.3f, 8.8f, -111.0f, 24.5f)
                curveToRelative(23.3f, -70.0f, 89.2f, -120.5f, 167.0f, -120.5f)
                curveToRelative(66.4f, 0.0f, 115.8f, -22.1f, 148.7f, -44.0f)
                curveToRelative(19.2f, -12.8f, 35.5f, -28.1f, 50.7f, -45.3f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
