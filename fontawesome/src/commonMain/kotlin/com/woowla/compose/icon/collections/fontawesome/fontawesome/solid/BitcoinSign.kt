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

public val SolidGroup.BitcoinSign: ImageVector
    get() {
        if (_bitcoinSign != null) {
            return _bitcoinSign!!
        }
        _bitcoinSign = Builder(name = "BitcoinSign", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 24.0f)
                curveTo(64.0f, 10.7f, 74.7f, 0.0f, 88.0f, 0.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 41.1f)
                curveToRelative(54.3f, 7.8f, 96.0f, 54.4f, 96.0f, 110.9f)
                curveToRelative(0.0f, 24.2f, -7.7f, 46.6f, -20.7f, 64.9f)
                curveToRelative(31.7f, 19.8f, 52.7f, 55.0f, 52.7f, 95.1f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -40.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -40.0f)
                lineToRelative(-22.3f, 0.0f)
                curveTo(18.7f, 448.0f, 0.0f, 429.3f, 0.0f, 406.3f)
                lineTo(0.0f, 101.6f)
                curveTo(0.0f, 80.8f, 16.8f, 64.0f, 37.6f, 64.0f)
                lineTo(64.0f, 64.0f)
                lineTo(64.0f, 24.0f)
                close()
                moveTo(64.0f, 224.0f)
                lineToRelative(112.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-112.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                close()
                moveTo(176.0f, 288.0f)
                lineToRelative(-112.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bitcoinSign!!
    }

private var _bitcoinSign: ImageVector? = null
