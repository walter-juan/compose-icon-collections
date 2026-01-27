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

public val SolidGroup.Snowplow: ImageVector
    get() {
        if (_snowplow != null) {
            return _snowplow!!
        }
        _snowplow = Builder(name = "Snowplow", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 160.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineTo(296.4f, 0.0f)
                curveToRelative(24.2f, 0.0f, 46.4f, 13.7f, 57.2f, 35.4f)
                lineToRelative(87.6f, 175.1f)
                curveToRelative(4.4f, 8.9f, 6.8f, 18.7f, 6.8f, 28.6f)
                lineToRelative(0.0f, 56.9f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -48.6f, 39.4f, -88.0f, 88.0f, -88.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                lineToRelative(0.0f, 208.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, -39.4f, -88.0f, -88.0f)
                lineToRelative(0.0f, -80.0f)
                lineToRelative(-63.0f, 0.0f)
                curveToRelative(9.5f, 16.5f, 15.0f, 35.6f, 15.0f, 56.0f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                lineToRelative(-224.0f, 0.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, -50.1f, -112.0f, -112.0f)
                curveToRelative(0.0f, -30.5f, 12.2f, -58.2f, 32.0f, -78.4f)
                lineTo(64.0f, 224.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(219.7f, 194.9f)
                lineToRelative(43.6f, 29.1f)
                lineToRelative(113.2f, 0.0f)
                lineToRelative(-80.0f, -160.0f)
                lineToRelative(-104.4f, 0.0f)
                lineToRelative(0.0f, 108.8f)
                lineToRelative(27.7f, 22.1f)
                close()
                moveTo(416.0f, 400.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-224.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                close()
                moveTo(136.0f, 400.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(352.0f, 376.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(232.0f, 400.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _snowplow!!
    }

private var _snowplow: ImageVector? = null
