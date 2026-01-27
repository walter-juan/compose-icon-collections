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

public val SolidGroup.TextSlash: ImageVector
    get() {
        if (_textSlash != null) {
            return _textSlash!!
        }
        _textSlash = Builder(name = "TextSlash", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(322.7f, 256.9f)
                lineTo(368.2f, 96.0f)
                lineTo(471.0f, 96.0f)
                lineTo(465.0f, 120.2f)
                curveToRelative(-4.3f, 17.1f, 6.1f, 34.5f, 23.3f, 38.8f)
                reflectiveCurveToRelative(34.5f, -6.1f, 38.8f, -23.3f)
                lineToRelative(11.0f, -44.1f)
                curveTo(545.6f, 61.3f, 522.7f, 32.0f, 491.5f, 32.0f)
                lineToRelative(-319.0f, 0.0f)
                curveToRelative(-19.8f, 0.0f, -37.3f, 12.1f, -44.5f, 30.1f)
                lineToRelative(-87.0f, -87.0f)
                close()
                moveTo(180.4f, 114.5f)
                lineToRelative(4.6f, -18.5f)
                lineToRelative(116.7f, 0.0f)
                lineToRelative(-30.8f, 109.0f)
                lineToRelative(-90.5f, -90.5f)
                close()
                moveTo(241.0f, 310.8f)
                lineTo(211.3f, 416.0f)
                lineTo(160.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-42.2f, 0.0f)
                lineToRelative(15.1f, -53.3f)
                lineToRelative(-51.9f, -51.9f)
                close()
            }
        }
        .build()
        return _textSlash!!
    }

private var _textSlash: ImageVector? = null
