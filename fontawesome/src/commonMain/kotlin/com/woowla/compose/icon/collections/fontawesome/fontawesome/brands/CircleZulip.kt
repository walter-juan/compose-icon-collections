package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.CircleZulip: ImageVector
    get() {
        if (_circleZulip != null) {
            return _circleZulip!!
        }
        _circleZulip = Builder(name = "CircleZulip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, 512.0f)
                close()
                moveTo(243.5f, 240.0f)
                curveToRelative(1.2f, -1.9f, -0.9f, -4.2f, -2.6f, -2.8f)
                lineToRelative(-89.0f, 79.5f)
                curveToRelative(-9.2f, 7.2f, -15.2f, 19.1f, -15.2f, 32.5f)
                curveToRelative(0.0f, 21.9f, 16.0f, 39.8f, 35.7f, 39.8f)
                lineToRelative(167.3f, 0.0f)
                curveToRelative(19.6f, 0.0f, 35.7f, -17.9f, 35.7f, -39.8f)
                curveToRelative(0.0f, -21.9f, -16.1f, -39.7f, -35.7f, -39.8f)
                lineToRelative(-126.6f, 0.0f)
                curveToRelative(-1.9f, 0.0f, -3.0f, -2.3f, -2.1f, -4.1f)
                lineTo(243.5f, 240.0f)
                close()
                moveTo(172.4f, 123.1f)
                curveToRelative(-19.6f, 0.0f, -35.7f, 17.9f, -35.7f, 39.8f)
                reflectiveCurveToRelative(16.0f, 39.8f, 35.7f, 39.8f)
                lineToRelative(126.6f, 0.0f)
                curveToRelative(1.9f, 0.0f, 3.1f, 2.2f, 2.2f, 4.1f)
                lineTo(268.5f, 272.0f)
                curveToRelative(-1.2f, 1.9f, 0.9f, 4.2f, 2.6f, 2.8f)
                lineToRelative(89.0f, -79.5f)
                curveToRelative(9.2f, -7.2f, 15.2f, -19.1f, 15.2f, -32.5f)
                curveToRelative(0.0f, -21.9f, -16.0f, -39.7f, -35.7f, -39.8f)
                lineToRelative(-167.3f, 0.0f)
                close()
            }
        }
        .build()
        return _circleZulip!!
    }

private var _circleZulip: ImageVector? = null
