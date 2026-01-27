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

public val SolidGroup.PersonCane: ImageVector
    get() {
        if (_personCane != null) {
            return _personCane!!
        }
        _personCane = Builder(name = "PersonCane", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, -32.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(144.0f, 236.7f)
                lineTo(97.7f, 299.1f)
                curveToRelative(-10.5f, 14.2f, -30.6f, 17.2f, -44.8f, 6.6f)
                reflectiveCurveToRelative(-17.2f, -30.6f, -6.6f, -44.8f)
                lineToRelative(70.5f, -95.0f)
                curveTo(142.0f, 132.0f, 181.7f, 112.0f, 224.0f, 112.0f)
                reflectiveCurveToRelative(82.0f, 20.0f, 107.2f, 53.9f)
                lineToRelative(70.5f, 95.0f)
                curveToRelative(10.5f, 14.2f, 7.6f, 34.2f, -6.6f, 44.8f)
                reflectiveCurveToRelative(-34.2f, 7.6f, -44.8f, -6.6f)
                lineTo(304.0f, 236.7f)
                lineTo(304.0f, 512.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -160.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -275.3f)
                close()
                moveTo(392.0f, 384.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _personCane!!
    }

private var _personCane: ImageVector? = null
