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

public val SolidGroup.BahtSign: ImageVector
    get() {
        if (_bahtSign != null) {
            return _bahtSign!!
        }
        _bahtSign = Builder(name = "BahtSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                lineToRelative(-74.4f, 0.0f)
                curveTo(16.8f, 64.0f, 0.0f, 80.8f, 0.0f, 101.6f)
                lineTo(0.0f, 406.3f)
                curveToRelative(0.0f, 23.0f, 18.7f, 41.7f, 41.7f, 41.7f)
                lineToRelative(70.3f, 0.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -40.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                curveToRelative(0.0f, -40.1f, -21.1f, -75.3f, -52.7f, -95.1f)
                curveToRelative(13.1f, -18.3f, 20.7f, -40.7f, 20.7f, -64.9f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(112.0f, 128.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(48.0f, 0.0f)
                close()
                moveTo(160.0f, 224.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-16.0f, 0.0f)
                close()
                moveTo(112.0f, 288.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(48.0f, 0.0f)
                close()
                moveTo(160.0f, 384.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bahtSign!!
    }

private var _bahtSign: ImageVector? = null
