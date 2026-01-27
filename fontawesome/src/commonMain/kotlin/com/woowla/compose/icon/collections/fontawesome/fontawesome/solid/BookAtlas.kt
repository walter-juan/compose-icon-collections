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

public val SolidGroup.BookAtlas: ImageVector
    get() {
        if (_bookAtlas != null) {
            return _bookAtlas!!
        }
        _bookAtlas = Builder(name = "BookAtlas", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 512.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(0.0f, -66.7f)
                curveToRelative(18.6f, -6.6f, 32.0f, -24.4f, 32.0f, -45.3f)
                lineToRelative(0.0f, -288.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(96.0f, 0.0f)
                curveTo(43.0f, 0.0f, 0.0f, 43.0f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                close()
                moveTo(64.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(256.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-256.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(310.6f, 208.0f)
                lineTo(279.0f, 208.0f)
                curveToRelative(-1.4f, 23.1f, -6.0f, 44.2f, -12.6f, 61.2f)
                curveToRelative(22.7f, -12.5f, 39.4f, -34.8f, 44.2f, -61.2f)
                close()
                moveTo(137.5f, 208.0f)
                curveToRelative(4.8f, 26.4f, 21.5f, 48.7f, 44.2f, 61.2f)
                curveToRelative(-6.7f, -17.0f, -11.2f, -38.0f, -12.6f, -61.2f)
                lineToRelative(-31.6f, 0.0f)
                close()
                moveTo(213.9f, 263.0f)
                curveToRelative(4.5f, 9.6f, 8.2f, 13.8f, 10.2f, 15.5f)
                curveToRelative(2.0f, -1.7f, 5.7f, -5.8f, 10.2f, -15.5f)
                curveToRelative(6.2f, -13.4f, 11.1f, -32.5f, 12.7f, -55.0f)
                lineToRelative(-45.8f, 0.0f)
                curveToRelative(1.6f, 22.5f, 6.5f, 41.6f, 12.7f, 55.0f)
                close()
                moveTo(201.2f, 176.0f)
                lineToRelative(45.8f, 0.0f)
                curveToRelative(-1.6f, -22.5f, -6.5f, -41.6f, -12.7f, -55.0f)
                curveToRelative(-4.5f, -9.6f, -8.2f, -13.8f, -10.2f, -15.5f)
                curveToRelative(-2.0f, 1.7f, -5.7f, 5.8f, -10.2f, 15.5f)
                curveToRelative(-6.2f, 13.4f, -11.1f, 32.5f, -12.7f, 55.0f)
                close()
                moveTo(310.7f, 176.0f)
                curveToRelative(-4.8f, -26.4f, -21.5f, -48.7f, -44.2f, -61.2f)
                curveToRelative(6.7f, 17.0f, 11.2f, 38.0f, 12.6f, 61.2f)
                lineToRelative(31.6f, 0.0f)
                close()
                moveTo(169.0f, 176.0f)
                curveToRelative(1.4f, -23.1f, 6.0f, -44.2f, 12.6f, -61.2f)
                curveToRelative(-22.7f, 12.5f, -39.4f, 34.8f, -44.2f, 61.2f)
                lineToRelative(31.6f, 0.0f)
                close()
                moveTo(96.0f, 192.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, -256.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bookAtlas!!
    }

private var _bookAtlas: ImageVector? = null
