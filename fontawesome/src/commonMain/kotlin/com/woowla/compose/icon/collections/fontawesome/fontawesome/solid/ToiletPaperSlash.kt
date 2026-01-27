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

public val SolidGroup.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-94.5f, -94.5f)
                curveToRelative(40.2f, -23.0f, 69.5f, -96.9f, 69.5f, -184.6f)
                curveToRelative(0.0f, -106.0f, -43.0f, -192.0f, -96.0f, -192.0f)
                reflectiveCurveToRelative(-96.0f, 86.0f, -96.0f, 192.0f)
                curveToRelative(0.0f, 24.1f, 2.2f, 47.2f, 6.3f, 68.4f)
                lineTo(304.0f, 238.2f)
                lineTo(304.0f, 224.0f)
                curveToRelative(0.0f, -58.9f, 11.8f, -114.5f, 33.2f, -157.2f)
                curveToRelative(5.9f, -11.7f, 13.1f, -23.7f, 21.9f, -34.8f)
                lineTo(128.0f, 32.0f)
                curveToRelative(-8.3f, 0.0f, -16.4f, 2.1f, -24.1f, 6.1f)
                lineToRelative(-63.0f, -63.0f)
                close()
                moveTo(32.0f, 224.0f)
                lineToRelative(0.0f, 264.0f)
                curveToRelative(0.0f, 30.9f, 25.1f, 56.0f, 56.0f, 56.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, -25.1f, 56.0f, -56.0f)
                lineToRelative(0.0f, -114.2f)
                lineToRelative(-256.0f, -256.0f)
                curveTo(37.9f, 148.2f, 32.0f, 184.7f, 32.0f, 224.0f)
                close()
                moveTo(448.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -28.7f, -32.0f, -64.0f)
                reflectiveCurveToRelative(14.3f, -64.0f, 32.0f, -64.0f)
                reflectiveCurveToRelative(32.0f, 28.7f, 32.0f, 64.0f)
                reflectiveCurveToRelative(-14.3f, 64.0f, -32.0f, 64.0f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
