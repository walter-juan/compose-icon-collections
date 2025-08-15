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

public val SolidGroup.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.9f, 75.5f)
                curveToRelative(4.5f, -11.8f, 1.7f, -25.2f, -7.2f, -34.1f)
                reflectiveCurveToRelative(-22.3f, -11.8f, -34.1f, -7.2f)
                lineToRelative(-416.0f, 160.0f)
                curveTo(7.9f, 199.0f, -0.3f, 211.2f, 0.0f, 224.7f)
                reflectiveCurveToRelative(9.1f, 25.4f, 21.9f, 29.6f)
                lineToRelative(176.8f, 58.9f)
                lineToRelative(58.9f, 176.8f)
                curveToRelative(4.3f, 12.8f, 16.1f, 21.6f, 29.6f, 21.9f)
                reflectiveCurveToRelative(25.7f, -7.9f, 30.6f, -20.5f)
                lineToRelative(160.0f, -416.0f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
