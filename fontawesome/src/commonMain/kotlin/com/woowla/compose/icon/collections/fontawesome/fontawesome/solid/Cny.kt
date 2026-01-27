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

public val SolidGroup.Cny: ImageVector
    get() {
        if (_cny != null) {
            return _cny!!
        }
        _cny = Builder(name = "Cny", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.9f, 46.7f)
                curveToRelative(-9.6f, -14.9f, -29.4f, -19.2f, -44.2f, -9.6f)
                reflectiveCurveTo(11.5f, 66.4f, 21.1f, 81.3f)
                lineTo(143.7f, 272.0f)
                lineTo(88.0f, 272.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(72.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-72.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(72.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-72.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-55.7f, 0.0f)
                lineToRelative(122.6f, -190.7f)
                curveToRelative(9.6f, -14.9f, 5.3f, -34.7f, -9.6f, -44.2f)
                reflectiveCurveToRelative(-34.7f, -5.3f, -44.2f, 9.6f)
                lineTo(192.0f, 228.8f)
                lineTo(74.9f, 46.7f)
                close()
            }
        }
        .build()
        return _cny!!
    }

private var _cny: ImageVector? = null
