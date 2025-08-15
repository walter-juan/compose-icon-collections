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

public val SolidGroup.Campground: ImageVector
    get() {
        if (_campground != null) {
            return _campground!!
        }
        _campground = Builder(name = "Campground", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.8f, 52.3f)
                curveToRelative(11.2f, -13.7f, 9.2f, -33.8f, -4.5f, -45.0f)
                reflectiveCurveToRelative(-33.8f, -9.2f, -45.0f, 4.5f)
                lineToRelative(-39.2f, 48.0f)
                lineToRelative(-39.2f, -48.0f)
                curveTo(205.6f, -1.9f, 185.4f, -4.0f, 171.7f, 7.2f)
                reflectiveCurveToRelative(-15.7f, 31.4f, -4.5f, 45.0f)
                lineToRelative(47.4f, 58.0f)
                lineToRelative(-202.0f, 246.9f)
                curveTo(4.5f, 367.1f, 0.0f, 379.6f, 0.0f, 392.6f)
                lineTo(0.0f, 432.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(416.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -39.4f)
                curveToRelative(0.0f, -12.9f, -4.5f, -25.5f, -12.7f, -35.5f)
                lineToRelative(-202.0f, -246.9f)
                lineToRelative(47.4f, -58.0f)
                close()
                moveTo(256.0f, 288.0f)
                lineToRelative(112.0f, 128.0f)
                lineToRelative(-224.0f, 0.0f)
                lineToRelative(112.0f, -128.0f)
                close()
            }
        }
        .build()
        return _campground!!
    }

private var _campground: ImageVector? = null
