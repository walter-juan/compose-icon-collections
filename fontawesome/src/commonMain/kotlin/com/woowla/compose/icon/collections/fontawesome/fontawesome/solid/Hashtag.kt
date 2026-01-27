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

public val SolidGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.7f, 0.7f)
                curveToRelative(17.3f, 3.7f, 28.3f, 20.7f, 24.6f, 38.0f)
                lineToRelative(-19.1f, 89.3f)
                lineToRelative(126.5f, 0.0f)
                lineToRelative(22.0f, -102.7f)
                curveTo(372.4f, 8.0f, 389.4f, -3.0f, 406.7f, 0.7f)
                reflectiveCurveToRelative(28.3f, 20.7f, 24.6f, 38.0f)
                lineTo(412.2f, 128.0f)
                lineTo(480.0f, 128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-81.6f, 0.0f)
                lineToRelative(-27.4f, 128.0f)
                lineToRelative(67.8f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-81.6f, 0.0f)
                lineToRelative(-22.0f, 102.7f)
                curveToRelative(-3.7f, 17.3f, -20.7f, 28.3f, -38.0f, 24.6f)
                reflectiveCurveToRelative(-28.3f, -20.7f, -24.6f, -38.0f)
                lineToRelative(19.1f, -89.3f)
                lineToRelative(-126.5f, 0.0f)
                lineToRelative(-22.0f, 102.7f)
                curveToRelative(-3.7f, 17.3f, -20.7f, 28.3f, -38.0f, 24.6f)
                reflectiveCurveToRelative(-28.3f, -20.7f, -24.6f, -38.0f)
                lineTo(99.8f, 384.0f)
                lineTo(32.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(81.6f, 0.0f)
                lineToRelative(27.4f, -128.0f)
                lineToRelative(-67.8f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(81.6f, 0.0f)
                lineToRelative(22.0f, -102.7f)
                curveTo(180.4f, 8.0f, 197.4f, -3.0f, 214.7f, 0.7f)
                close()
                moveTo(206.4f, 192.0f)
                lineToRelative(-27.4f, 128.0f)
                lineToRelative(126.5f, 0.0f)
                lineToRelative(27.4f, -128.0f)
                lineToRelative(-126.5f, 0.0f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
