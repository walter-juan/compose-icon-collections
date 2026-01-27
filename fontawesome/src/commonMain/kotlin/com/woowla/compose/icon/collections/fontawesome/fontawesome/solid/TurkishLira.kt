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

public val SolidGroup.TurkishLira: ImageVector
    get() {
        if (_turkishLira != null) {
            return _turkishLira!!
        }
        _turkishLira = Builder(name = "TurkishLira", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 43.6f)
                lineToRelative(121.4f, -34.7f)
                curveToRelative(12.7f, -3.6f, 26.0f, 3.7f, 29.7f, 16.5f)
                reflectiveCurveToRelative(-3.7f, 26.0f, -16.5f, 29.7f)
                lineToRelative(-134.6f, 38.5f)
                lineToRelative(0.0f, 46.1f)
                lineToRelative(121.4f, -34.7f)
                curveToRelative(12.7f, -3.6f, 26.0f, 3.7f, 29.7f, 16.5f)
                reflectiveCurveToRelative(-3.7f, 26.0f, -16.5f, 29.7f)
                lineToRelative(-134.6f, 38.5f)
                lineToRelative(0.0f, 162.5f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                lineToRelative(-104.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -176.2f)
                lineToRelative(-25.4f, 7.3f)
                curveToRelative(-12.7f, 3.6f, -26.0f, -3.7f, -29.7f, -16.5f)
                reflectiveCurveToRelative(3.7f, -26.0f, 16.5f, -29.7f)
                lineToRelative(38.6f, -11.0f)
                lineToRelative(0.0f, -46.1f)
                lineToRelative(-25.4f, 7.3f)
                curveToRelative(-12.7f, 3.6f, -26.0f, -3.7f, -29.7f, -16.5f)
                reflectiveCurveToRelative(3.7f, -26.0f, 16.5f, -29.7f)
                lineToRelative(38.6f, -11.0f)
                lineToRelative(0.0f, -61.9f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _turkishLira!!
    }

private var _turkishLira: ImageVector? = null
