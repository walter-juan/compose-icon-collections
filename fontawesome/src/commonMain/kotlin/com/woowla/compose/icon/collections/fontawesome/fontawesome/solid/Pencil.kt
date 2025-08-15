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

public val SolidGroup.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.4f, 353.2f)
                curveToRelative(4.1f, -14.6f, 11.8f, -27.9f, 22.6f, -38.7f)
                lineToRelative(181.2f, -181.2f)
                lineToRelative(33.9f, -33.9f)
                curveToRelative(16.6f, 16.6f, 51.3f, 51.3f, 104.0f, 104.0f)
                lineToRelative(33.9f, 33.9f)
                lineToRelative(-33.9f, 33.9f)
                lineToRelative(-181.2f, 181.2f)
                curveToRelative(-10.7f, 10.7f, -24.1f, 18.5f, -38.7f, 22.6f)
                lineTo(30.4f, 510.6f)
                curveToRelative(-8.3f, 2.3f, -17.3f, 0.0f, -23.4f, -6.2f)
                reflectiveCurveTo(-1.4f, 489.3f, 0.9f, 481.0f)
                lineTo(36.4f, 353.2f)
                close()
                moveTo(92.0f, 349.5f)
                curveToRelative(-4.4f, 4.7f, -7.6f, 10.4f, -9.3f, 16.6f)
                lineToRelative(-24.1f, 86.9f)
                lineToRelative(86.9f, -24.1f)
                curveToRelative(6.4f, -1.8f, 12.2f, -5.1f, 17.0f, -9.7f)
                lineTo(91.9f, 349.5f)
                close()
                moveTo(446.0f, 203.4f)
                curveToRelative(-16.6f, -16.6f, -51.3f, -51.3f, -104.0f, -104.0f)
                lineTo(308.0f, 65.5f)
                curveTo(334.5f, 39.0f, 349.4f, 24.1f, 352.9f, 20.6f)
                curveTo(366.4f, 7.0f, 384.8f, -0.6f, 404.0f, -0.6f)
                reflectiveCurveTo(441.6f, 7.0f, 455.1f, 20.6f)
                lineToRelative(35.7f, 35.7f)
                curveTo(504.4f, 69.9f, 512.0f, 88.3f, 512.0f, 107.4f)
                reflectiveCurveToRelative(-7.6f, 37.6f, -21.2f, 51.1f)
                curveToRelative(-3.5f, 3.5f, -18.4f, 18.4f, -44.9f, 44.9f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
