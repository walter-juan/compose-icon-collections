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

public val SolidGroup.ThumbtackSlash: ImageVector
    get() {
        if (_thumbtackSlash != null) {
            return _thumbtackSlash!!
        }
        _thumbtackSlash = Builder(name = "ThumbtackSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(481.4f, 352.0f)
                curveToRelative(9.8f, -0.4f, 18.9f, -5.3f, 24.6f, -13.3f)
                curveToRelative(6.0f, -8.3f, 7.7f, -19.1f, 4.4f, -28.8f)
                lineToRelative(-1.0f, -3.0f)
                curveToRelative(-13.8f, -41.5f, -42.8f, -74.8f, -79.5f, -94.7f)
                lineTo(418.5f, 64.0f)
                lineTo(448.0f, 64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(29.5f, 0.0f)
                lineToRelative(-6.1f, 79.5f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(324.9f, 352.0f)
                lineTo(177.1f, 235.6f)
                curveToRelative(-20.9f, 18.9f, -37.2f, 43.3f, -46.5f, 71.3f)
                lineToRelative(-1.0f, 3.0f)
                curveToRelative(-3.3f, 9.8f, -1.6f, 20.5f, 4.4f, 28.8f)
                reflectiveCurveToRelative(15.7f, 13.3f, 26.0f, 13.3f)
                lineToRelative(164.9f, 0.0f)
                close()
                moveTo(288.0f, 384.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _thumbtackSlash!!
    }

private var _thumbtackSlash: ImageVector? = null
