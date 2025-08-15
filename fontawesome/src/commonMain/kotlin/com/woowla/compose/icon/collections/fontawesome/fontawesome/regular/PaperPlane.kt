package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.5f, 287.7f)
                lineTo(491.4f, 86.9f)
                lineTo(359.0f, 456.3f)
                lineTo(290.5f, 287.7f)
                close()
                moveTo(457.4f, 53.0f)
                lineTo(256.6f, 253.8f)
                lineTo(88.0f, 185.3f)
                lineTo(457.4f, 53.0f)
                close()
                moveTo(38.1f, 216.8f)
                lineToRelative(205.8f, 83.6f)
                lineToRelative(83.6f, 205.8f)
                curveToRelative(5.3f, 13.1f, 18.1f, 21.7f, 32.3f, 21.7f)
                curveToRelative(14.7f, 0.0f, 27.8f, -9.2f, 32.8f, -23.1f)
                lineTo(570.6f, 8.0f)
                curveToRelative(3.5f, -9.8f, 1.0f, -20.6f, -6.3f, -28.0f)
                reflectiveCurveToRelative(-18.2f, -9.8f, -28.0f, -6.3f)
                lineTo(39.4f, 151.7f)
                curveToRelative(-13.9f, 5.0f, -23.1f, 18.1f, -23.1f, 32.8f)
                curveToRelative(0.0f, 14.2f, 8.6f, 27.0f, 21.7f, 32.3f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
