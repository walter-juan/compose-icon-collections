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

public val SolidGroup.LandmarkFlag: ImageVector
    get() {
        if (_landmarkFlag != null) {
            return _landmarkFlag!!
        }
        _landmarkFlag = Builder(name = "LandmarkFlag", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, -32.0f)
                lineTo(240.0f, -32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 144.0f)
                lineToRelative(-176.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 224.0f)
                lineToRelative(-51.2f, 38.4f)
                curveTo(4.7f, 460.4f, 0.0f, 469.9f, 0.0f, 480.0f)
                curveTo(0.0f, 497.7f, 14.3f, 512.0f, 32.0f, 512.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -10.1f, -4.7f, -19.6f, -12.8f, -25.6f)
                lineToRelative(-51.2f, -38.4f)
                lineToRelative(0.0f, -224.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(400.0f, 192.0f)
                lineToRelative(0.0f, 224.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -224.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(288.0f, 192.0f)
                lineToRelative(0.0f, 224.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -224.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(176.0f, 192.0f)
                lineToRelative(0.0f, 224.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -224.0f)
                lineToRelative(64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _landmarkFlag!!
    }

private var _landmarkFlag: ImageVector? = null
