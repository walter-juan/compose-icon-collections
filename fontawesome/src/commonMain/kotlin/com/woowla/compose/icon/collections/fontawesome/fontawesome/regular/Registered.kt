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

public val RegularGroup.Registered: ImageVector
    get() {
        if (_registered != null) {
            return _registered!!
        }
        _registered = Builder(name = "Registered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, -416.0f)
                close()
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(200.0f, 144.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(34.4f, 0.0f)
                lineToRelative(41.0f, 68.3f)
                curveToRelative(6.8f, 11.4f, 21.6f, 15.0f, 32.9f, 8.2f)
                reflectiveCurveToRelative(15.0f, -21.6f, 8.2f, -32.9f)
                lineToRelative(-30.2f, -50.3f)
                curveToRelative(24.6f, -11.5f, 41.6f, -36.4f, 41.6f, -65.3f)
                curveToRelative(0.0f, -39.8f, -32.2f, -72.0f, -72.0f, -72.0f)
                lineToRelative(-80.0f, 0.0f)
                close()
                moveTo(272.0f, 240.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(56.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _registered!!
    }

private var _registered: ImageVector? = null
