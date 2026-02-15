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

public val SolidGroup.Sagittarius: ImageVector
    get() {
        if (_sagittarius != null) {
            return _sagittarius!!
        }
        _sagittarius = Builder(name = "Sagittarius", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -82.8f)
                lineToRelative(-146.8f, 146.8f)
                lineToRelative(41.4f, 41.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.2f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineTo(192.0f, 333.3f)
                lineTo(54.6f, 470.6f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.2f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.2f)
                lineTo(146.8f, 288.0f)
                lineTo(105.4f, 246.6f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.2f)
                reflectiveCurveToRelative(32.8f, -12.5f, 45.2f, 0.0f)
                lineTo(192.0f, 242.8f)
                lineTo(338.8f, 96.0f)
                lineTo(256.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sagittarius!!
    }

private var _sagittarius: ImageVector? = null
