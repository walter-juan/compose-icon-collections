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
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(160.0f, 152.0f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -72.0f)
                lineToRelative(60.9f, 0.0f)
                lineToRelative(37.2f, 81.9f)
                curveToRelative(5.5f, 12.1f, 19.7f, 17.4f, 31.8f, 11.9f)
                reflectiveCurveToRelative(17.4f, -19.7f, 11.9f, -31.8f)
                lineTo(315.7f, 275.0f)
                curveToRelative(21.8f, -14.3f, 36.3f, -39.0f, 36.3f, -67.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                lineToRelative(-88.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                close()
                moveTo(208.0f, 240.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _registered!!
    }

private var _registered: ImageVector? = null
