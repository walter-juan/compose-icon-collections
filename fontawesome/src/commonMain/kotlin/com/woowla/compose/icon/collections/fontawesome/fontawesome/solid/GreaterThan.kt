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

public val SolidGroup.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) {
            return _greaterThan!!
        }
        _greaterThan = Builder(name = "GreaterThan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.9f, 50.6f)
                curveToRelative(-7.4f, 16.0f, -0.4f, 35.1f, 15.6f, 42.5f)
                lineTo(403.6f, 256.0f)
                lineTo(50.6f, 419.0f)
                curveToRelative(-16.0f, 7.4f, -23.1f, 26.4f, -15.6f, 42.5f)
                reflectiveCurveToRelative(26.4f, 23.0f, 42.5f, 15.6f)
                lineToRelative(416.0f, -192.0f)
                curveToRelative(11.3f, -5.2f, 18.6f, -16.6f, 18.6f, -29.1f)
                reflectiveCurveToRelative(-7.3f, -23.8f, -18.6f, -29.1f)
                lineTo(77.4f, 35.0f)
                curveToRelative(-16.0f, -7.4f, -35.1f, -0.4f, -42.5f, 15.6f)
                close()
            }
        }
        .build()
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
